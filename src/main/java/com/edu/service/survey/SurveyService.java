package com.edu.service.survey;

import java.util.List;
import java.util.Map;

import com.edu.domain.SurveyForm;
import com.edu.service.response.Result;

public interface SurveyService {

	Result<SurveyForm> getSurveyForm(Integer surveyId);

	Result submitSurveyForm(SurveyForm form);

	Map<String, List<Integer>> calculateResult(Integer surveyId);
}
