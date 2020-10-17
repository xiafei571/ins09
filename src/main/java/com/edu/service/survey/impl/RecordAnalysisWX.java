package com.edu.service.survey.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edu.domain.SurveyRecord;

public class RecordAnalysisWX extends RecordAnalysis {

	@Override
	Map<String, List<Integer>> cal_record(List<SurveyRecord> recordList, int scores[]) {
		int happiness = 250;
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
		for (SurveyRecord surveyRecord : recordList) {
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
				aa: for (;;) {
					for (String option_1 : resultMap.keySet()) {
						if (resultMap.get(option_1).size() > 6) {
							for (SurveyRecord surveyRecord : recordList) {
								String options = surveyRecord.getOptions();
								String optionsArray[] = options.split(",");
								if (option_1.equals(optionsArray[0]) && option.equals(optionsArray[1])) {
									resultMap.get(option_1)
											.remove(resultMap.get(option_1).indexOf(surveyRecord.getStuId()));
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
							for (SurveyRecord surveyRecord : recordList) {
								String options = surveyRecord.getOptions();
								String optionsArray[] = options.split(",");
								if (option_1.equals(optionsArray[0]) && option.equals(optionsArray[2])) {
									resultMap.get(option_1)
											.remove(resultMap.get(option_1).indexOf(surveyRecord.getStuId()));
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
							for (SurveyRecord surveyRecord : recordList) {
								String options = surveyRecord.getOptions();
								String optionsArray[] = options.split(",");
								if (option_1.equals(optionsArray[0]) && option.equals(optionsArray[1])) {
									resultMap.get(option_1)
											.remove(resultMap.get(option_1).indexOf(surveyRecord.getStuId()));
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
							for (SurveyRecord surveyRecord : recordList) {
								String options = surveyRecord.getOptions();
								String optionsArray[] = options.split(",");
								if (option_1.equals(optionsArray[0]) && option.equals(optionsArray[2])) {
									resultMap.get(option_1)
											.remove(resultMap.get(option_1).indexOf(surveyRecord.getStuId()));
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
