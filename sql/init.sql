/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 13/04/2022 14:11:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ik_dynamic_dic
-- ----------------------------
DROP TABLE IF EXISTS `ik_dynamic_dic`;
CREATE TABLE `ik_dynamic_dic`  (
  `lexicon_id` bigint(8) NOT NULL AUTO_INCREMENT COMMENT '词库id',
  `lexicon_text` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '词条关键词',
  `lexicon_type` int(1) NOT NULL DEFAULT 0 COMMENT '0扩展词库 1停用词库',
  `lexicon_status` int(1) NOT NULL DEFAULT 0 COMMENT '词条状态 0正常 1暂停使用',
  `del_flag` int(1) NOT NULL DEFAULT 0 COMMENT '作废标志 0正常 1作废',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`lexicon_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1120 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'ES远程扩展词库表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ik_dynamic_dic
-- ----------------------------
INSERT INTO `ik_dynamic_dic` VALUES (1114, '本草刚目1', 0, 0, 0, '2022-04-12 18:02:40');
INSERT INTO `ik_dynamic_dic` VALUES (1115, '测试999', 0, 0, 0, '2022-04-13 11:42:52');
INSERT INTO `ik_dynamic_dic` VALUES (1116, '777感冒灵', 0, 0, 0, '2022-04-13 11:42:56');
INSERT INTO `ik_dynamic_dic` VALUES (1117, '你猜我猜不猜', 0, 0, 0, '2022-04-13 11:43:09');
INSERT INTO `ik_dynamic_dic` VALUES (1118, '的', 0, 0, 0, '2022-04-13 11:43:18');
INSERT INTO `ik_dynamic_dic` VALUES (1119, '啊', 0, 0, 0, '2022-04-13 11:43:25');

SET FOREIGN_KEY_CHECKS = 1;
