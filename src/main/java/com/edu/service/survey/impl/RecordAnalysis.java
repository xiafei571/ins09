package com.edu.service.survey.impl;

import java.util.List;
import java.util.Map;

import com.edu.domain.SurveyRecord;

abstract class RecordAnalysis {

	/**
	 * 根据记录计算分配结果 每个选项id 对应n个学生， 对应规则为: count(students)<=count(options) 时，
	 * 根据学生第一志愿即可 count(students)>count(options)时，每个option_id 对应
	 * count(students)/count(options) +-1 个学生 例：50名学生，10个选项，那么最终计算结果是 每个选项对应4-6名学生
	 * 后台打印最终的总score
	 * 
	 * @param recordList
	 * @param scores     依次为学生获得第几志愿的幸福度，默认为[5,3,1,0] 第一志愿5分，三个志愿都未选上0分
	 * @return {"option_id" : [student_id1, student_id2, student_id3, student_id4,
	 *         student_id5]}
	 */
	abstract Map<String, List<Integer>> cal_record(List<SurveyRecord> recordList, int scores[]);

}
