package com.edu.service.survey.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.domain.Survey;
import com.edu.domain.SurveyForm;
import com.edu.domain.SurveyOption;
import com.edu.mapper.SurveyMapper;
import com.edu.domain.SurveyRecord;
import com.edu.domain.SurveyResult;
import com.edu.mapper.SurveyRecordMapper;
import com.edu.service.response.Result;
import com.edu.service.survey.SurveyService;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

@Service
@SuppressWarnings("rawtypes")
public class SurveyServiceImpl implements SurveyService {
	@Autowired
	private SurveyRecordMapper surveyRecordMapper;
	@Autowired
	private SurveyMapper surveyMapper;

	@Override
	public Result<SurveyForm> getSurveyForm(Integer surveyId) {
		Survey survey = getSurveyById(surveyId);
		List<SurveyOption> options = surveyMapper.getSurveyOptionList(surveyId);
		return new Result<SurveyForm>(new SurveyForm(survey, options));
	}

	@Override
	public Survey getSurveyById(Integer surveyId) {
		return surveyMapper.getSurveyById(surveyId);
	}

	@Override
	public List<SurveyOption> getSurveyOptionList(Integer option_id) {
		return surveyMapper.getSurveyOptionList(option_id);
	}

	@Override
	public Result submitSurveyForm(SurveyForm form) {
		String options = form.getTop1() + "," + form.getTop2() + "," + form.getTop3();
		SurveyRecord surveyRecord = new SurveyRecord();
		surveyRecord.setOptions(options);
		surveyRecord.setStuId(form.getStuId());
		surveyRecord.setSurveyId(form.getSurveyId());
		surveyRecord.setGmtCreate(new Date());
		surveyRecord.setGmtModified(new Date());
		int count = surveyRecordMapper.selcetCountBySurveyId(form.getSurveyId());
		System.out.println(count);
		if (count < 50) {
			int result = surveyRecordMapper.addRecord(surveyRecord);
			return new Result(0, "提交成功 " + result);
		} else if (count == 50) {
			calculateResult(form.getSurveyId(), 1);
			return new Result(0, "提交成功");
		} else {
			return new Result(0, "提交失败，名额已满");
		}
	}
	
	public Result<SurveyResult> calculateResult(Integer surveyId, Integer testId) {
		List<SurveyRecord> recordList = surveyRecordMapper.selcetAllBySurveyId(surveyId);
		int scores[] = { 5, 3, 1, 0 };
		// TODO 测试每个人写的方法
		//测试方法： 访问 http://localhost:8080/survey/result/1?testId=你的ID 文学1，chris2，谷王珏3
		RecordAnalysis rd = null;
		if(testId==null || testId==1) {
			rd = new RecordAnalysisWX();
		}else if(testId==2) {
			rd = new RecordAnalysisCHRIS();
		}else if(testId == 3) {
			rd = new RecordAnalysisGWJ();
		}
		
		SurveyResult result = rd.cal_record(recordList, scores);
		return new Result<SurveyResult>(result);
	}

	public Result<String> generateRandomData(Integer surveyId, Integer count) {
		int[] option_ids = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int stu_id = 1001;
		
		for (int i = 0; i < count; i++) {

			String options = randomOptionStr(option_ids, 3);
			SurveyRecord sr = new SurveyRecord(surveyId, stu_id, options);
			surveyRecordMapper.addRecord(sr);
			stu_id++;
		}

		return new Result<String>("生成成功，"+surveyId+":"+count);
	}

	/**
	 * 从poor中随机抽选size个数，无重复
	 * 
	 * @param poor
	 * @param size
	 * @return
	 */
	private static HashSet<Integer> randomOption(int[] poor, int size) {
		if (poor.length == 0 || size <= 0)
			return null;

		HashSet<Integer> hs = new HashSet<Integer>();
		Random opt_random = new Random();
		while (hs.size() < size) {
			int index = opt_random.nextInt(poor.length);
			hs.add(poor[index]);
		}
		return hs;
	}

	private static String randomOptionStr(int[] poor, int size) {
		HashSet<Integer> hs = randomOption(poor, size);
		return Joiner.on(",").join(hs);
	}

}
