/*
 Navicat MySQL Data Transfer

 Source Server         : fa
 Source Server Version : 50716
 Source Host           : localhost
 Source Database       : WLKS

 Target Server Version : 50716
 File Encoding         : utf-8

 Date: 05/01/2017 15:30:07 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_node`
-- ----------------------------
DROP TABLE IF EXISTS `t_node`;
CREATE TABLE `t_node` (
  `id` varchar(255) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `iconCls` varchar(255) DEFAULT NULL,
  `pid` varchar(255) DEFAULT NULL,
  `text` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_node`
-- ----------------------------
BEGIN;
INSERT INTO `t_node` VALUES ('100', 'admin/order', 'icon_multiorders', null, '订单管理'), ('101', 'admin/order/list', null, '100', '订单处理'), ('200', 'admin/ruku', null, null, '入库管理');
COMMIT;

-- ----------------------------
--  Table structure for `t_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `onumber` varchar(255) NOT NULL,
  `orderDate` date NOT NULL,
  `money` float(30,0) NOT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES ('1', '123', '123');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
