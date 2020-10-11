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
	int selcetCountBySurveyId(Integer surveyId);
	
	//向survey_record表中添加记录；
	@Insert("Insert into survey_record values(default, #{surveyId}, #{stuId}, #{options})")
	int addRecord(SurveyRecord surveyRecord);
	
	//查询survey_record表中的同一survey_id的50条数据;
	@Select("select count(*) from survey_record where survey_id = #{surveyId}")
	List<SurveyRecord> selcetAllBySurveyId(Integer surveyId);
}
