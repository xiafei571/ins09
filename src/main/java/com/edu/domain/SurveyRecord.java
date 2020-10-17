package com.edu.domain;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class SurveyRecord {
	private Integer recordId;

	private Integer surveyId;

	private Integer stuId;

	private String options;
	
	private Date gmtCreate;
	
	private Date gmtModified;

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

	public int[] get_options_list() {
		if (StringUtils.isEmpty(options)) {
			return null;
		}

		String[] options_list = options.split(",");
		int[] result = new int[options_list.length];
		for (int i = 0; i < options_list.length; i++) {
			result[i] = Integer.valueOf(options_list[i]);
		}
		return result;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public SurveyRecord(Integer recordId, Integer surveyId, Integer stuId, String options) {
		super();
		this.recordId = recordId;
		this.surveyId = surveyId;
		this.stuId = stuId;
		this.options = options;
	}
	
	public SurveyRecord(Integer surveyId, Integer stuId, String options) {
		super();
		this.surveyId = surveyId;
		this.stuId = stuId;
		this.options = options;
	}

	public SurveyRecord() {
	}

	@Override
	public String toString() {
		return "SurveyRecord [recordId=" + recordId + ", surveyId=" + surveyId + ", stuId=" + stuId + ", options="
				+ options + "]";
	}

}
