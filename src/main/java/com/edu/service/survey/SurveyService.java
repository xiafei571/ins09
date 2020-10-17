package com.edu.service.survey;

import java.util.List;
import com.edu.domain.Survey;
import java.util.Map;
import com.edu.domain.SurveyForm;
import com.edu.domain.SurveyOption;
import com.edu.service.response.Result;

public interface SurveyService {

	Result<SurveyForm> getSurveyForm(Integer surveyId);

	Result submitSurveyForm(SurveyForm form);

	Survey getSurveyById(Integer surveyId);

	Integer getSurvey_OptionById(Integer SurveyId);

	List<SurveyOption> getSurveyOptionList(Integer option_id);

	Map<String, List<Integer>> calculateResult(Integer surveyId);
}
