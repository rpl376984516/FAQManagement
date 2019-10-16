/*
 Navicat MySQL Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3306
 Source Schema         : faqmanagement

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 16/10/2019 14:55:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for classes
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '类别编号',
  `cname` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '类别名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO `classes` VALUES (1, 'Java');
INSERT INTO `classes` VALUES (2, 'C#/.Net');
INSERT INTO `classes` VALUES (3, '数据库');
INSERT INTO `classes` VALUES (4, 'Lunix');
INSERT INTO `classes` VALUES (5, 'C语言');

-- ----------------------------
-- Table structure for faqs
-- ----------------------------
DROP TABLE IF EXISTS `faqs`;
CREATE TABLE `faqs`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '问题编号',
  `title` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标题',
  `createdate` date NULL DEFAULT NULL COMMENT '添加时间',
  `content` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '内容',
  `classid` int(10) NULL DEFAULT NULL COMMENT '类别编号（对应类别表的主键）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of faqs
-- ----------------------------
INSERT INTO `faqs` VALUES (1, 'Java如何配置PATH环境变量', '2012-11-12', '简简单单啦', 1);
INSERT INTO `faqs` VALUES (2, '如何安装配置IIS', '2012-10-19', '小意思啦', 2);
INSERT INTO `faqs` VALUES (3, '左外链接的SQL怎么写', '2012-08-10', '不懂就百度啦', 3);
INSERT INTO `faqs` VALUES (4, '如何理解指针', '2012-12-17', '随缘理解', 5);
INSERT INTO `faqs` VALUES (5, 'JavaWeb开发的常用服务有哪些', '2019-10-15', '一大堆', 1);

SET FOREIGN_KEY_CHECKS = 1;
