package com.edu.domain;

import java.util.List;

public class SurveyForm {

	private Integer stuId;

	private Integer surveyId;

	private String surveyDesc;

	private List<SurveyOption> options;
	
	public SurveyForm() {
		
	}

	public SurveyForm(Survey survey, List<SurveyOption> options) {
		this.surveyId = survey.getSurveyId();
		this.surveyDesc = survey.getSurveyDesc();
		this.options = options;
	}

	// <input type="radio" name="top1" value="optionId"> optionId
	private Integer top1;
	private Integer top2;
	private Integer top3;

	public String combine_options() {// 数据库里存的是String: "3,5,7"
		return top1 + "," + top2 + "," + top3;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public List<SurveyOption> getOptions() {
		return options;
	}

	public void setOptions(List<SurveyOption> options) {
		this.options = options;
	}

	public Integer getTop1() {
		return top1;
	}

	public void setTop1(Integer top1) {
		this.top1 = top1;
	}

	public Integer getTop2() {
		return top2;
	}

	public void setTop2(Integer top2) {
		this.top2 = top2;
	}

	public Integer getTop3() {
		return top3;
	}

	public void setTop3(Integer top3) {
		this.top3 = top3;
	}

	public String getSurveyDesc() {
		return surveyDesc;
	}

	public void setSurveyDesc(String surveyDesc) {
		this.surveyDesc = surveyDesc;
	}

	@Override
	public String toString() {
		return "SurveyForm [stuId=" + stuId + ", surveyId=" + surveyId + ", options=" + options + ", top1=" + top1
				+ ", top2=" + top2 + ", top3=" + top3 + "]";
	}
}
