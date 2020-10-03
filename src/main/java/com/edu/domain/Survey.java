package com.edu.domain;

public class Survey {
	private Integer surveyId;

	private String surveyDesc;

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyDesc() {
		return surveyDesc;
	}

	public void setSurveyDesc(String surveyDesc) {
		this.surveyDesc = surveyDesc;
	}

	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", surveyDesc=" + surveyDesc + "]";
	}

	public Survey(Integer surveyId, String surveyDesc) {
		super();
		this.surveyId = surveyId;
		this.surveyDesc = surveyDesc;
	}

	public Survey() {
	}

}
