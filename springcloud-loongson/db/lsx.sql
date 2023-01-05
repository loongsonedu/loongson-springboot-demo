/*
 Navicat Premium Data Transfer

 Source Server         : 118.190.158.156-myself
 Source Server Type    : MySQL
 Source Server Version : 100300
 Source Host           : 118.190.158.156:3306
 Source Schema         : lsx

 Target Server Type    : MySQL
 Target Server Version : 100300
 File Encoding         : 65001

 Date: 04/01/2023 22:35:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_dict
-- ----------------------------
DROP TABLE IF EXISTS `t_dict`;
CREATE TABLE `t_dict`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `type` int(10) NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_dict
-- ----------------------------

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` int(20) NOT NULL,
  `status` int(11) NULL DEFAULT NULL,
  `order_type` int(11) NULL DEFAULT NULL,
  `pay_status` int(11) NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `receivable` double(10, 2) NULL DEFAULT NULL,
  `real_price` decimal(10, 2) NULL DEFAULT NULL,
  `order_at` timestamp(6) NULL DEFAULT NULL,
  `create_at` timestamp(6) NULL DEFAULT NULL,
  `update_at` timestamp(6) NULL DEFAULT NULL,
  `deleted` int(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order
-- ----------------------------

-- ----------------------------
-- Table structure for t_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_order_detail`;
CREATE TABLE `t_order_detail`  (
  `id` int(20) NOT NULL,
  `order_id` int(20) NULL DEFAULT NULL,
  `tyre_id` int(20) NULL DEFAULT NULL,
  `tyre_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `tyre_year` int(10) NULL DEFAULT NULL,
  `tyre_num` int(10) NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `send_at` timestamp(6) NULL DEFAULT NULL,
  `sign_at` timestamp(6) NULL DEFAULT NULL,
  `pay_method` int(6) NULL DEFAULT NULL,
  `pay_at` timestamp(6) NULL DEFAULT NULL,
  `send_way` int(20) NULL DEFAULT NULL,
  `send_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `waybill_num` varbinary(50) NULL DEFAULT NULL,
  `customer_type` int(20) NULL DEFAULT NULL,
  `customer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `customer_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `create_at` timestamp(6) NULL DEFAULT NULL,
  `update_at` timestamp(6) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for t_repertory
-- ----------------------------
DROP TABLE IF EXISTS `t_repertory`;
CREATE TABLE `t_repertory`  (
  `id` int(20) NOT NULL,
  `tyre_id` int(20) NULL DEFAULT NULL,
  `tyre_year` int(20) NULL DEFAULT NULL,
  `total_num` int(20) NULL DEFAULT NULL,
  `sold_num` int(20) NULL DEFAULT NULL,
  `residue_num` int(20) NULL DEFAULT NULL,
  `update_at` timestamp(6) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_repertory
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL COMMENT 'ID',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '姓名',
  `phone` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `sex` int(3) NULL DEFAULT NULL,
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
