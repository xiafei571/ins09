package com.edu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.edu.domain.SurveyRecord;



@Mapper
public interface SurveyRecordMapper {
	
	//查询survey_record表中的同一survey_id的数据有多少条;
	@Select("select count(record_id) from survey_record where survey_id = #{surveyId}")
	Integer selcetCountBySurveyId(Integer surveyId);
	
	//向survey_record表中添加记录；
	@Insert("insert into survey_record values(default, #{surveyId}, #{stuId}, #{options}, now(), now())")
	Integer addRecord(SurveyRecord surveyRecord);
	
	//查询survey_record表中的同一survey_id的50条数据;
	@Select("select record_id recordId, survey_id surveyId, stu_id stuId, options from survey_record where survey_id = #{surveyId}")
	List<SurveyRecord> selcetAllBySurveyId(Integer surveyId);
}
