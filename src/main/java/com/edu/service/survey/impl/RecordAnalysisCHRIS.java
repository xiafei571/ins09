package com.edu.service.survey.impl;

import java.util.List;
import java.util.Map;

import com.edu.domain.SurveyRecord;

public class RecordAnalysisCHRIS extends RecordAnalysis {

	@Override
	Map<String, List<Integer>> cal_record(List<SurveyRecord> recordList, int scores[]) {
		// TODO Auto-generated method stub
		for (SurveyRecord sr : recordList) {
			System.out.println(sr);
		}
		return null;
	}

}
