package com.edu.domain;

import java.util.Date;

public class Survey {
	private Integer surveyId;

	private String surveyDesc;
	
	private Date gmtCreate;
	
	private Date gmtModified;

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

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
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
