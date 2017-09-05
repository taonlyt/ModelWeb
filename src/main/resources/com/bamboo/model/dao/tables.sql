/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  luotao
 * Created: 2017-9-5
 */

CREATE TABLE `table_attr` (
  `TABLE_ID` int(11) NOT NULL,
  `ATTR_ID` varchar(45) NOT NULL,
  `ATTR_VALUE` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`TABLE_ID`,`ATTR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `table_def` (
  `TABLE_ID` int(11) NOT NULL COMMENT '表ID',
  `TABLE_NAME` varchar(128) DEFAULT NULL COMMENT '表名称',
  `TABLE_NAME_CN` varchar(45) DEFAULT NULL COMMENT '表中文名称',
  `DB_TYPE` varchar(1) DEFAULT NULL COMMENT '数据库类型',
  `CREATOR` varchar(45) DEFAULT NULL,
  `CREATE_DATE` date DEFAULT NULL,
  PRIMARY KEY (`TABLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `table_field` (
  `TABLE_ID` int(11) NOT NULL,
  `TABLE_NAME` varchar(45) NOT NULL,
  `FIELD_NAME` varchar(45) NOT NULL,
  `FIELD_SEQ` int(11) DEFAULT NULL,
  `FIELD_NAME_CN` varchar(200) DEFAULT NULL,
  `FIELD_DATA_TYPE` varchar(45) DEFAULT NULL,
  `FIELD_COMMENT` varchar(2000) DEFAULT NULL,
  `FIELD_SECURITY_TYPE` varchar(2) DEFAULT NULL COMMENT '安全分类',
  `FIELD_SENSITIVE_LEVEL` varchar(45) DEFAULT NULL COMMENT '安全等级',
  `FIELD_FUZZY_CODE` varchar(45) DEFAULT NULL COMMENT '字段值模糊化编码，即脱敏ID。',
  PRIMARY KEY (`TABLE_ID`,`TABLE_NAME`,`FIELD_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `table_kind_attr` (
  `DB_TYPE` varchar(10) NOT NULL,
  `ATTR_ID` varchar(45) NOT NULL,
  `ATTR_NAME` varchar(45) NOT NULL,
  `ATTR_VALUE` varchar(45) DEFAULT NULL COMMENT '数据库类型属性默认值',
  PRIMARY KEY (`DB_TYPE`,`ATTR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;