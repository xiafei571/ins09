-- 初始化 survey数据
INSERT INTO setsu1019.survey
(survey_id, survey_desc, gmt_create, gmt_modified)
VALUES(1, '选课意向调查', '2020-10-10 05:23:04.000', '2020-10-10 05:23:04.000');
-- 初始化 options数据
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(1, '計算理論', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(2, 'プログラム理論', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(3, '数理論理学', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(4, 'プログラム言語論', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(5, 'ソフトウェア工学', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(6, '形式手法', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(7, '機械学習', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(8, '自然言語処理', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(9, '画像解析', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
INSERT INTO setsu1019.`options`
(option_id, option_desc, gmt_create, gmt_modified)
VALUES(10, '並列アーキテクチャ', '2020-10-10 05:28:46.000', '2020-10-10 05:28:46.000');
-- 初始化关联数据
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 1);
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 2);
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 3);
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 4);
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 5);
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 6);
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 7);
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 8);
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 9);
INSERT INTO setsu1019.survey_option
(survey_id, option_id)
VALUES(1, 10);
-- 查询测试
select s.survey_id, s.survey_desc, o.option_id, o.option_desc from survey s 
left join survey_option so on s.survey_id = so.survey_id
left join options o on so.option_id = o.option_id
where s.survey_id = 1

