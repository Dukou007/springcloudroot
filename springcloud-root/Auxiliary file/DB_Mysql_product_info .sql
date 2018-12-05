/*
Navicat MySQL Data Transfer

Source Server         : mysql57
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : clouddb01

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-10-12 09:28:22
*/
CREATE DATABASE clouddb01;
SET FOREIGN_KEY_CHECKS=0;


-- ----------------------------
-- Table structure for `product_info`
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info` (
`product_id`  varchar(32) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`product_name`  varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称' ,
`product_price`  decimal(8,2) NOT NULL COMMENT '单价' ,
`product_stock`  int(11) NOT NULL COMMENT '库存' ,
`product_description`  varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述' ,
`product_icon`  varchar(512) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '小图' ,
`product_status`  tinyint(3) NULL DEFAULT 0 COMMENT '商品状态,0正常1下架' ,
`category_type`  int(11) NOT NULL COMMENT '类目编号' ,
`create_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
`update_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
PRIMARY KEY (`product_id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci

;

-- ----------------------------
-- Records of product_info
-- ----------------------------
BEGIN;
INSERT INTO `product_info` VALUES ('11111', '海鲜', '1200.00', '100', '鲍鱼', 'http://www.ddd.jpg', '0', '5', '2018-08-25 13:48:12', '2018-10-11 20:15:11'), ('11112', '糖果', '1200.00', '97', '奶糖', 'http://www.ddd.jpg', '0', '2', '2018-08-25 13:52:11', '2018-10-11 20:17:23'), ('1234', '蔬菜', '2.50', '100', '苹果', 'http://www.ddd.jpg', '0', '3', '2018-08-24 22:41:14', '2018-10-11 20:17:06'), ('213', '饮料', '10.20', '100', '红牛', 'www.xxx.jpg', '0', '3', '2018-08-24 22:42:42', '2018-10-11 20:16:52');
COMMIT;
