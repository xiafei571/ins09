package com.edu.service.survey.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.domain.SurveyForm;
import com.edu.domain.SurveyOption;
import com.edu.domain.SurveyRecord;
import com.edu.mapper.SurveyRecordMapper;
import com.edu.service.response.Result;
import com.edu.service.survey.SurveyService;
import com.google.common.collect.Lists;

@Service
public class SurveyServiceImpl implements SurveyService {
	@Autowired
	SurveyRecordMapper surveyMapper; 

	@Override
	public Result<SurveyForm> getSurveyForm(Integer surveyId) {
		//TODO  假数据，真正的要去数据库调用
		SurveyForm sf = new SurveyForm();
		SurveyOption s1 = new SurveyOption(surveyId, 1001, "計算理論");
		SurveyOption s2 = new SurveyOption(surveyId, 1002, "プログラム理論");
		SurveyOption s3 = new SurveyOption(surveyId, 1003, "数理論理学");
		SurveyOption s4 = new SurveyOption(surveyId, 1004, "プログラム言語論");
		SurveyOption s5 = new SurveyOption(surveyId, 1005, "ソフトウェア工学");
		SurveyOption s6 = new SurveyOption(surveyId, 1006, "形式手法");
		SurveyOption s7 = new SurveyOption(surveyId, 1007, "機械学習");
		SurveyOption s8 = new SurveyOption(surveyId, 1008, "自然言語処理");
		SurveyOption s9 = new SurveyOption(surveyId, 1009, "画像解析");
		SurveyOption s10 = new SurveyOption(surveyId, 1010, "並列アーキテクチャ");
		List<SurveyOption> options = Lists.newArrayList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
		sf.setSurveyDesc("Project选择アンケート");
		sf.setOptions(options);
		sf.setSurveyId(surveyId);
		return new Result<SurveyForm>(sf);
	}

	@Override
	public Result submitSurveyForm(SurveyForm form) {
		//TODO 
		String options = form.getTop1() + "," +  form.getTop2() + "," +  form.getTop3();
		SurveyRecord surveyRecord = new SurveyRecord();
		surveyRecord.setOptions(options);
		surveyRecord.setStuId(form.getStuId());
		surveyRecord.setSurveyId(form.getSurveyId());
		surveyRecord.setGmtCreate(new Date());
		surveyRecord.setGmtModified(new Date());
		int count = surveyMapper.selcetCountBySurveyId(form.getSurveyId());
		System.out.println(count);
		if (count < 50) {
			int result = surveyMapper.addRecord(surveyRecord);
			return new Result(0,"提交成功");
		} else if (count == 50) {
			calculateResult(form.getSurveyId());
			return new Result(0,"提交成功");
		} else {
			return new Result(0,"提交失败，名额已满");
		}
	}
	
	public Map<String , List<Integer>> calculateResult(Integer surveyId) { 
		int happiness = 250;
		List<SurveyRecord> resultList = surveyMapper.selcetAllBySurveyId(surveyId);
		List<Integer> option1 = new ArrayList<Integer>();
		List<Integer> option2 = new ArrayList<Integer>();
		List<Integer> option3 = new ArrayList<Integer>();
		List<Integer> option4 = new ArrayList<Integer>();
		List<Integer> option5 = new ArrayList<Integer>();
		List<Integer> option6 = new ArrayList<Integer>();
		List<Integer> option7 = new ArrayList<Integer>();
		List<Integer> option8 = new ArrayList<Integer>();
		List<Integer> option9 = new ArrayList<Integer>();
		List<Integer> option10 = new ArrayList<Integer>();
		Map<String, List<Integer>> resultMap = new HashMap<>();
		for (SurveyRecord surveyRecord: resultList) {
			String options = surveyRecord.getOptions();
			String optionsArray[] = options.split(",");
			if ("1".equals(optionsArray[0])) {
				option1.add(surveyRecord.getStuId());
			} else if ("2".equals(optionsArray[0])) {
				option2.add(surveyRecord.getStuId());
			} else if ("3".equals(optionsArray[0])) {
				option3.add(surveyRecord.getStuId());
			} else if ("4".equals(optionsArray[0])) {
				option4.add(surveyRecord.getStuId());
			} else if ("5".equals(optionsArray[0])) {
				option5.add(surveyRecord.getStuId());
			} else if ("6".equals(optionsArray[0])) {
				option6.add(surveyRecord.getStuId());
			} else if ("7".equals(optionsArray[0])) {
				option7.add(surveyRecord.getStuId());
			} else if ("8".equals(optionsArray[0])) {
				option8.add(surveyRecord.getStuId());
			} else if ("9".equals(optionsArray[0])) {
				option9.add(surveyRecord.getStuId());
			} else if ("10".equals(optionsArray[0])) {
				option10.add(surveyRecord.getStuId());
			}
		}
		resultMap.put("1", option1);
		resultMap.put("2", option2);
		resultMap.put("3", option3);
		resultMap.put("4", option4);
		resultMap.put("5", option5);
		resultMap.put("6", option6);
		resultMap.put("7", option7);
		resultMap.put("8", option8);
		resultMap.put("9", option9);
		resultMap.put("10", option10);
		for (String option : resultMap.keySet()) {
			if (resultMap.get(option).size() < 4) {
				aa : for (;;) {
					for (String option_1 : resultMap.keySet()) {
						if (resultMap.get(option_1).size() > 6) {
							for (SurveyRecord surveyRecord : resultList) {
								String options = surveyRecord.getOptions();
								String optionsArray[] = options.split(",");
								if (option_1.equals(optionsArray[0]) && option.equals(optionsArray[1])) {
									resultMap.get(option_1).remove(resultMap.get(option_1).indexOf(surveyRecord.getStuId()));
									resultMap.get(option).add(surveyRecord.getStuId());
									happiness = happiness - 2;
									if (resultMap.get(option).size() >= 4) {
										break aa;
									}
								} else {
									break;
								}
							} 
						}
					}
					if (resultMap.get(option).size() >= 4) {
						break;
					}
					for (String option_1 : resultMap.keySet()) {
						if (resultMap.get(option_1).size() > 6) {
							for (SurveyRecord surveyRecord : resultList) {
								String options = surveyRecord.getOptions();
								String optionsArray[] = options.split(",");
								if (option_1.equals(optionsArray[0]) && option.equals(optionsArray[2])) {
									resultMap.get(option_1).remove(resultMap.get(option_1).indexOf(surveyRecord.getStuId()));
									resultMap.get(option).add(surveyRecord.getStuId());
									happiness = happiness - 3;
									if (resultMap.get(option).size() >= 4) {
										break aa;
									}
								} else {
									break;
								}
							} 
						}
					}
					if (resultMap.get(option).size() >= 4) {
						break;
					}
					for (String option_1 : resultMap.keySet()) {
						if (resultMap.get(option_1).size() > 6) {
							Integer stuId = resultMap.get(option_1).get(resultMap.get(option_1).size() - 1);
							resultMap.get(option_1).remove(resultMap.get(option_1).size() - 1);
							resultMap.get(option).add(stuId);
							happiness = happiness - 5;
							if (resultMap.get(option).size() >= 4) {
								break aa;
							}
						}
					}
					if (resultMap.get(option).size() >= 4) {
						break;
					}
					for (String option_1 : resultMap.keySet()) {
						if (resultMap.get(option_1).size() > 5) {
							for (SurveyRecord surveyRecord : resultList) {
								String options = surveyRecord.getOptions();
								String optionsArray[] = options.split(",");
								if (option_1.equals(optionsArray[0]) && option.equals(optionsArray[1])) {
									resultMap.get(option_1).remove(resultMap.get(option_1).indexOf(surveyRecord.getStuId()));
									resultMap.get(option).add(surveyRecord.getStuId());
									happiness = happiness - 2;
									if (resultMap.get(option).size() >= 4) {
										break aa;
									}
								} else {
									break;
								}
							} 
						}
					}
					if (resultMap.get(option).size() >= 4) {
						break;
					}
					for (String option_1 : resultMap.keySet()) {
						if (resultMap.get(option_1).size() > 5) {
							for (SurveyRecord surveyRecord : resultList) {
								String options = surveyRecord.getOptions();
								String optionsArray[] = options.split(",");
								if (option_1.equals(optionsArray[0]) && option.equals(optionsArray[2])) {
									resultMap.get(option_1).remove(resultMap.get(option_1).indexOf(surveyRecord.getStuId()));
									resultMap.get(option).add(surveyRecord.getStuId());
									happiness = happiness - 3;
									if (resultMap.get(option).size() >= 4) {
										break aa;
									}
								} else {
									break;
								}
							} 
						}
					}
					if (resultMap.get(option).size() >= 4) {
						break;
					}
					for (String option_1 : resultMap.keySet()) {
						if (resultMap.get(option_1).size() > 5) {
							Integer stuId = resultMap.get(option_1).get(resultMap.get(option_1).size() - 1);
							resultMap.get(option_1).remove(resultMap.get(option_1).size() - 1);
							resultMap.get(option).add(stuId);
							happiness = happiness - 5;
							if (resultMap.get(option).size() >= 4) {
								break aa;
							}
						}
					}
					if (resultMap.get(option).size() >= 4) {
						break;
					}
				}
			}
		}
		System.out.println(resultMap);
		System.out.println(happiness);
		return resultMap;
	}
}
