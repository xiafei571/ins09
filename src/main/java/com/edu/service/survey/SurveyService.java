package com.edu.service.survey;

import com.edu.domain.SurveyForm;
import com.edu.service.response.Result;

public interface SurveyService {

	Result<SurveyForm> getSurveyForm(Integer surveyId);

	Result submitSurveyForm(SurveyForm form);

}
