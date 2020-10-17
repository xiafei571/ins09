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
	
    @Select("select * from survey where survey_id=#{surveyId}") 
    @ResultMap("surveyResult")
	Survey getSurveyById(@Param("surveyId")Integer surveyId);
    
    @Select("select s.survey_id, o.option_id, o.option_desc, o.gmt_create, o.gmt_modified from survey s " + 
    		"left join survey_option so on s.survey_id = so.survey_id " + 
    		"left join options o on so.option_id = o.option_id " + 
    		"where s.survey_id = #{surveyId}") 
    @ResultMap("surveyOptionResult")
    List<SurveyOption>  getSurveyOptionList(@Param("surveyId") Integer surveyId);
    
}
