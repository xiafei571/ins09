package com.edu.service.survey.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.domain.SurveyForm;
import com.edu.domain.SurveyOption;
import com.edu.service.response.Result;
import com.edu.service.survey.SurveyService;
import com.google.common.collect.Lists;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Override
	public Result<SurveyForm> getSurveyForm(Integer surveyId) {
		//TODO  假数据，真正的要去数据库调用
		SurveyForm sf = new SurveyForm();
		SurveyOption s1 = new SurveyOption(surveyId, 1001, "計算理論");
		SurveyOption s2 = new SurveyOption(surveyId, 1002, "プログラム理論");
		SurveyOption s3 = new SurveyOption(surveyId, 1003, "数理論理学");
		SurveyOption s4 = new SurveyOption(surveyId, 1004, "プログラム言語論");
		SurveyOption s5 = new SurveyOption(surveyId, 1005, "ソフトウェア工学");
		SurveyOption s6 = new SurveyOption(surveyId, 1006, "形式手法");
		SurveyOption s7 = new SurveyOption(surveyId, 1007, "機械学習");
		SurveyOption s8 = new SurveyOption(surveyId, 1008, "自然言語処理");
		SurveyOption s9 = new SurveyOption(surveyId, 1009, "画像解析");
		SurveyOption s10 = new SurveyOption(surveyId, 1010, "並列アーキテクチャ");
		List<SurveyOption> options = Lists.newArrayList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
		sf.setOptions(options);
		sf.setSurveyId(surveyId);
		return new Result<SurveyForm>(sf);
	}

	@Override
	public Result submitSurveyForm(SurveyForm form) {
		//TODO 
		System.out.println(form);
		return new Result(0,"提交成功");
	}

}
