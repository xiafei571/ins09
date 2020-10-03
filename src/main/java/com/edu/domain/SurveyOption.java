package com.edu.domain;

public class SurveyOption {

	private Integer surveyId;

	private Integer optionId;

	private String optionDesc;

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public Integer getOptionId() {
		return optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public String getOptionDesc() {
		return optionDesc;
	}

	public void setOptionDesc(String optionDesc) {
		this.optionDesc = optionDesc;
	}

	@Override
	public String toString() {
		return "SurveyOption [surveyId=" + surveyId + ", optionId=" + optionId + ", optionDesc=" + optionDesc + "]";
	}

	public SurveyOption(Integer surveyId, Integer optionId, String optionDesc) {
		super();
		this.surveyId = surveyId;
		this.optionId = optionId;
		this.optionDesc = optionDesc;
	}

	public SurveyOption() {
	}

}
