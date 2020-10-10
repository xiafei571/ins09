package com.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.domain.SurveyForm;
import com.edu.service.response.Result;
import com.edu.service.survey.SurveyService;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	@RequestMapping("/form/{id}")
	@ResponseBody
	public Result<SurveyForm> getSurveyForm(@PathVariable Integer id){
		return surveyService.getSurveyForm(id);
	}
	
	@RequestMapping(path="/form/{id}", method=RequestMethod.POST)
	@ResponseBody
	public Result submitSurveyForm(@RequestBody SurveyForm form) {
		return surveyService.submitSurveyForm(form);
	}

}
