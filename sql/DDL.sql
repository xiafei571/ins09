CREATE TABLE `survey` (
  `survey_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `survey_desc` varchar(14) DEFAULT NULL COMMENT '调查表说明',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`survey_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `options` (
  `option_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `option_desc` varchar(14) DEFAULT NULL COMMENT '选项说明',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`option_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8

CREATE TABLE `survey_option` (
  `survey_id` int(11) NOT NULL COMMENT '调查表id',
  `option_id` int(11) NOT NULL COMMENT '选项id',
  PRIMARY KEY (`survey_id`,`option_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `survey_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录编号',
  `survey_id` int(4) NOT NULL COMMENT '调查编号',
  `stu_id` int(10) NOT NULL COMMENT '学生编号',
  `options` varchar(10) NOT NULL COMMENT '学生选择的选项',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8