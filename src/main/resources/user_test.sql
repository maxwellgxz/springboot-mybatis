/*
Navicat MySQL Data Transfer

Source Server         : 192.168.20.14
Source Server Version : 50627
Source Host           : 192.168.20.14:3306
Source Database       : shiro

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2018-09-12 17:09:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_test
-- ----------------------------
DROP TABLE IF EXISTS `user_test`;
CREATE TABLE `user_test` (
  `userid` varchar(50) NOT NULL COMMENT '用户id',
  `account` varchar(50) DEFAULT NULL COMMENT '账号',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
