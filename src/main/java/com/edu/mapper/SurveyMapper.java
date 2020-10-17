package com.edu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.edu.domain.Survey;
import com.edu.domain.SurveyOption;


@Mapper
public interface SurveyMapper {
	
    @Select("select * from survey where surveyId=#{surveyId}") 
    @ResultMap("SurveyResult")
	Survey getSurveyById(@Param("surveyId")Integer surveyId);
    
  
    @Select("select option_id from survey_option where survey_id=#{surveyId}") 
    @ResultMap("Survey_OptionResult")
    Integer getSurvey_OptionById(@Param("surveyId")Integer SurveyId);
    

    @Select("select * from surveyoption where optionId=#{option_id}") 
    @ResultMap("SurveyOptionResult")
    List<SurveyOption>  getSurveyOptionList(@Param("option_id") Integer option_id);
    
}
