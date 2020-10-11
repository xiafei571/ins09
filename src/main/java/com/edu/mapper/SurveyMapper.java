package com.edu.mapper;

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
    
  
    
    @Select("select * from survey") 
    @ResultMap("SurveyResult")
	Survey getSurveyList();
    
    
 
    
    @Select("select * from  where surveyId=#{surveyId}") 
    @ResultMap("SurveyOptionResult")
    SurveyOption getSurveyOptionById(@Param("surveyId")Integer Id);
    
		
}
