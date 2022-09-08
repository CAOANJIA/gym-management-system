/*
 Navicat Premium Data Transfer

 Source Server         : zy1
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : gym_management_system

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 08/09/2022 11:34:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admId` int NOT NULL COMMENT '管理员工号',
  `admName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员姓名',
  `admAc` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员账号',
  `admPw` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员密码',
  `admRo` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色',
  `admSt` int NULL DEFAULT NULL COMMENT '账户是否冻结',
  `insertTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '加入时间',
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`admId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, '徐涛', '1001', '123456', '运营', 0, '2022-09-06 12:08:39', '2022-09-06 12:08:39', NULL);

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill`  (
  `rcId` int(10) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT '记录编号',
  `userId` int NULL DEFAULT NULL COMMENT '记录用户编号',
  `rcType` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '记录类型',
  `rcAmount` int NULL DEFAULT NULL COMMENT '记录分数（金额）',
  `insertTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '插入时间',
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`rcId`) USING BTREE,
  INDEX `bill1`(`userId`) USING BTREE,
  CONSTRAINT `bill1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of bill
-- ----------------------------
INSERT INTO `bill` VALUES (0000000001, 202256100, '充值', 100, '2022-09-07 21:16:03', NULL, NULL);
INSERT INTO `bill` VALUES (0000000002, 202256100, '充值', 100, '2022-09-07 21:57:27', NULL, NULL);
INSERT INTO `bill` VALUES (0000000003, 202256100, '充值', 100, '2022-09-07 21:58:32', NULL, NULL);
INSERT INTO `bill` VALUES (0000000004, 202256100, '充值', 100, '2022-09-07 22:12:22', NULL, NULL);
INSERT INTO `bill` VALUES (0000000005, 202256100, '充值', 100, '2022-09-07 22:23:24', NULL, NULL);

-- ----------------------------
-- Table structure for class_order
-- ----------------------------
DROP TABLE IF EXISTS `class_order`;
CREATE TABLE `class_order`  (
  `appId` int NOT NULL AUTO_INCREMENT COMMENT '预约编号',
  `userId` int NULL DEFAULT NULL COMMENT '预约用户',
  `trId` int NULL DEFAULT NULL COMMENT '预约教练',
  `courseId` int NULL DEFAULT NULL COMMENT '预约课程',
  `insertTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '插入时间',
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`appId`) USING BTREE,
  INDEX `order1`(`trId`) USING BTREE,
  INDEX `order2`(`courseId`) USING BTREE,
  INDEX `order3`(`userId`) USING BTREE,
  CONSTRAINT `order1` FOREIGN KEY (`trId`) REFERENCES `coach` (`trId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order2` FOREIGN KEY (`courseId`) REFERENCES `class_table` (`courseId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of class_order
-- ----------------------------

-- ----------------------------
-- Table structure for class_table
-- ----------------------------
DROP TABLE IF EXISTS `class_table`;
CREATE TABLE `class_table`  (
  `courseId` int NOT NULL DEFAULT 0 COMMENT '课程编号',
  `courseName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称',
  `trId` int NULL DEFAULT NULL COMMENT '课程教练',
  `courseBegin` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开始时间',
  `courseEnd` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '结束时间',
  `coursePrice` int NULL DEFAULT NULL COMMENT '使用器材',
  `eqId` int NULL DEFAULT NULL COMMENT '课程价格',
  `insertTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '插入时间',
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`courseId`) USING BTREE,
  INDEX `table1`(`trId`) USING BTREE,
  INDEX `table2`(`eqId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of class_table
-- ----------------------------
INSERT INTO `class_table` VALUES (1231, '12412', 1241, '2022年12月10日10:00:00', '2022年12月10日11:00:00', 100, 2141, '2022-09-07 00:00:00', '2022-09-07 00:00:00', 'as123');

-- ----------------------------
-- Table structure for coach
-- ----------------------------
DROP TABLE IF EXISTS `coach`;
CREATE TABLE `coach`  (
  `trId` int NOT NULL COMMENT '教练编号',
  `trName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教练姓名',
  `trGender` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教练性别',
  `introduction` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教练简介',
  `trAc` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教练用户账号',
  `trPw` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教练用户密码',
  `trPh` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教练电话',
  `insertTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '插入时间',
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`trId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of coach
-- ----------------------------
INSERT INTO `coach` VALUES (1, '王一楠', 'M', '撒打算', '123412', '123456', '13812345678', '2022-09-07 08:42:35', '2022-09-07 00:04:22', '阿萨');

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment`  (
  `eqId` int NOT NULL AUTO_INCREMENT COMMENT '器材编号',
  `eqName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '器材名称',
  `eqIns` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '器材说明',
  `eqNumber` int NOT NULL COMMENT '器材数量',
  `insertTime` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '购入时间',
  `updateTime` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上次检修时间',
  `expiryTime` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '有效期',
  `instruction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '使用说明',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`eqId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 202213647 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES (202213646, '杠铃', '阿萨大', 100, '2022-9-1', '2022-9-1', '2023-9-1', '阿三大苏打', '123');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `cmId` int NOT NULL AUTO_INCREMENT COMMENT '留言编号',
  `userId` int NULL DEFAULT NULL COMMENT '留言用户编号',
  `cmContent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言内容',
  `insertTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '插入时间',
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`cmId`) USING BTREE,
  INDEX `message1`(`userId`) USING BTREE,
  CONSTRAINT `message1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (2, 202256100, '1235', '2022-09-07 21:25:36', NULL, NULL);
INSERT INTO `message` VALUES (3, 202256100, '124124', '2022-09-07 21:25:56', NULL, NULL);
INSERT INTO `message` VALUES (4, 202256100, 'asdasdasd', '2022-09-07 21:26:06', NULL, NULL);
INSERT INTO `message` VALUES (5, 202256100, '124124', '2022-09-07 21:26:11', NULL, NULL);
INSERT INTO `message` VALUES (6, 202256100, '124124', '2022-09-07 21:26:15', NULL, NULL);
INSERT INTO `message` VALUES (7, 202256100, '214124', '2022-09-07 21:26:20', NULL, NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userId` int NOT NULL COMMENT '用户编号',
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `userGender` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户性别',
  `userAc` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号',
  `userPw` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `userPh` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户电话',
  `userPt` int NULL DEFAULT NULL COMMENT '用户积分',
  `insertTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '插入时间',
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `startTime` date NULL DEFAULT NULL COMMENT '开始时间',
  `endTime` date NULL DEFAULT NULL COMMENT '截止时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`userId`) USING BTREE,
  INDEX `userName`(`userName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (202256100, '徐涛', 'M', '202256100', '123456', '13812345678', 900, '2022-09-06 00:00:00', '2022-09-08 09:23:24', '2022-09-06', '2022-09-06', 'as123');

SET FOREIGN_KEY_CHECKS = 1;
