package com.edu.service.survey;

import java.util.List;
import com.edu.domain.Survey;
import com.edu.domain.SurveyForm;
import com.edu.domain.SurveyOption;
import com.edu.domain.SurveyResult;
import com.edu.service.response.Result;

public interface SurveyService {

	Result<SurveyForm> getSurveyForm(Integer surveyId);

	Result submitSurveyForm(SurveyForm form);

	Survey getSurveyById(Integer surveyId);

	List<SurveyOption> getSurveyOptionList(Integer option_id);

	 Result<SurveyResult> calculateResult(Integer surveyId, Integer testId);
	
	Result<String> generateRandomData(Integer surveyId, Integer count);
}
