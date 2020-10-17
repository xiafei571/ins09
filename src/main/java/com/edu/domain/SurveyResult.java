package com.edu.domain;

import java.util.List;
import java.util.Map;

public class SurveyResult {
	
	//Key:option_id, Value: list(student_id) 
	private Map<String, List<Integer>> resultList;
	
	private Integer score;

	public Map<String, List<Integer>> getResultList() {
		return resultList;
	}

	public void setResultList(Map<String, List<Integer>> resultList) {
		this.resultList = resultList;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "SurveyResult [resultList=" + resultList + ", score=" + score + "]";
	}

	public SurveyResult(Map<String, List<Integer>> resultList, Integer score) {
		super();
		this.resultList = resultList;
		this.score = score;
	}
	
	public SurveyResult() {
		
	}
}
