package com.edu.service.survey.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.domain.Survey;
import com.edu.domain.SurveyForm;
import com.edu.domain.SurveyOption;
import com.edu.mapper.SurveyMapper;
import com.edu.domain.SurveyRecord;
import com.edu.mapper.SurveyRecordMapper;
import com.edu.service.response.Result;
import com.edu.service.survey.SurveyService;
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
			calculateResult(form.getSurveyId());
			return new Result(0, "提交成功");
		} else {
			return new Result(0, "提交失败，名额已满");
		}
	}

	public Map<String, List<Integer>> calculateResult(Integer surveyId) {
		List<SurveyRecord> recordList = surveyRecordMapper.selcetAllBySurveyId(surveyId);
		int scores[] = { 5, 3, 1, 0 };
		// 测试每个人写的方法
		RecordAnalysis rd = new RecordAnalysisWX();
		return rd.cal_record(recordList, scores);
	}

}
