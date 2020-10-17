package com.edu.service.survey.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edu.domain.SurveyRecord;
import com.edu.domain.SurveyResult;

public class RecordAnalysisGWJ extends RecordAnalysis {

	@Override
	SurveyResult cal_record(List<SurveyRecord> recordList, int scores[]) {
		// TODO Auto-generated method stub
		
		int score = 0;
		Map<String, List<Integer>> survey_result = new HashMap<String, List<Integer>>();
		
		for (SurveyRecord sr : recordList) {
			//int[] options = sr.get_options_list();
			System.out.println(sr);
		}
		
		return new SurveyResult(survey_result, score);
	}
}
