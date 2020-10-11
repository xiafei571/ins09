package com.edu.service.survey;

import com.edu.domain.Survey;
import com.edu.domain.SurveyForm;
import com.edu.domain.SurveyOption;
import com.edu.service.response.Result;

public interface SurveyService {

	Result<SurveyForm> getSurveyForm(Integer surveyId);

	Result submitSurveyForm(SurveyForm form);
	
	Survey getSurveyById(Integer surveyId);
	
	SurveyOption getOptionById(Integer surveyId);

}
