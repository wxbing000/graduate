/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : jpw

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-08-24 15:41:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for artist_album
-- ----------------------------
DROP TABLE IF EXISTS `artist_album`;
CREATE TABLE `artist_album` (
  `aa_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_num` int(11) NOT NULL COMMENT '用户编码',
  `aac_id` int(11) DEFAULT NULL COMMENT '相册分类id',
  `aa_path` varchar(100) NOT NULL COMMENT '图片在服务器上的路径',
  `aa_year` varchar(10) DEFAULT NULL COMMENT '图片拍摄年代时间（仅年份）',
  `aa_name` varchar(60) DEFAULT NULL COMMENT '相片的名称',
  `aa_explain` varchar(300) DEFAULT NULL COMMENT '拍摄（图片）说明',
  PRIMARY KEY (`aa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8 COMMENT='艺术家相册图片信息';

-- ----------------------------
-- Table structure for artist_album_category
-- ----------------------------
DROP TABLE IF EXISTS `artist_album_category`;
CREATE TABLE `artist_album_category` (
  `aac_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_num` int(11) NOT NULL COMMENT '用户编码',
  `aac_name` varchar(100) DEFAULT NULL COMMENT '相册分类名称',
  PRIMARY KEY (`aac_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='艺术家相册分类表';

-- ----------------------------
-- Table structure for artist_auction
-- ----------------------------
DROP TABLE IF EXISTS `artist_auction`;
CREATE TABLE `artist_auction` (
  `aa_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_num` int(11) NOT NULL COMMENT '艺术家编码',
  `product_name` varchar(300) DEFAULT NULL COMMENT '作品名称',
  `product_category` varchar(200) DEFAULT NULL COMMENT '作品分类',
  `product_size` varchar(200) DEFAULT NULL COMMENT '作品尺寸',
  `product_years` varchar(100) DEFAULT NULL COMMENT '创作年代',
  `product_img` varchar(200) DEFAULT NULL COMMENT '作品图片路径',
  `aa_time` varchar(200) DEFAULT NULL COMMENT '拍卖时间',
  `aa_aucompany` varchar(60) DEFAULT NULL COMMENT '拍卖公司名称',
  `aa_name` varchar(200) DEFAULT NULL COMMENT '拍卖会名称',
  `aa_bargain_price` decimal(10,2) DEFAULT NULL COMMENT '成交价',
  `aa_estimat_price` decimal(10,2) DEFAULT NULL COMMENT '估价',
  `aa_specially_name` varchar(200) DEFAULT NULL COMMENT '拍卖专场',
  `aa_explain` varchar(200) DEFAULT NULL COMMENT '拍卖会说明--拍卖会说明限制在100字以内',
  PRIMARY KEY (`aa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='艺术家拍卖行情信息';

-- ----------------------------
-- Table structure for artist_award
-- ----------------------------
DROP TABLE IF EXISTS `artist_award`;
CREATE TABLE `artist_award` (
  `aa_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_num` int(11) NOT NULL COMMENT '用户编码',
  `aa_year` varchar(10) DEFAULT NULL COMMENT '年份',
  `aa_event` varchar(1000) DEFAULT NULL COMMENT '艺术家获奖信息',
  `aa_url` varchar(60) DEFAULT NULL COMMENT '艺术家作品链接',
  PRIMARY KEY (`aa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='艺术家获奖信息表';

-- ----------------------------
-- Table structure for artist_book
-- ----------------------------
DROP TABLE IF EXISTS `artist_book`;
CREATE TABLE `artist_book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_num` int(11) NOT NULL COMMENT '用户编码',
  `book_press` varchar(60) DEFAULT NULL COMMENT '书籍出版社',
  `book_name` varchar(60) DEFAULT NULL COMMENT '书籍名称',
  `book_publicat_time` varchar(30) DEFAULT NULL COMMENT '书籍出版日期',
  `book_pricing` varchar(10) DEFAULT NULL COMMENT '书籍定价',
  `book_content` text COMMENT '书籍内容简介—简介内容限制在300字以内',
  `book_catalogue` text COMMENT '目录',
  `book_category` varchar(20) DEFAULT NULL COMMENT '所属类别',
  `book_isbn` varchar(30) DEFAULT NULL COMMENT 'ISBN',
  `book_impression` varchar(30) DEFAULT NULL COMMENT '印次',
  `book_author` varchar(60) DEFAULT NULL COMMENT '作者',
  `book_writer` varchar(60) DEFAULT NULL COMMENT '编著',
  `book_size` varchar(20) DEFAULT NULL COMMENT '开本',
  `book_picture_path` varchar(100) NOT NULL COMMENT '书籍图片路径',
  `book_show_state` int(11) NOT NULL COMMENT '当前著作否显示在个人主页：1代表显示在个人主页、0表示不显示在个人主页',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8 COMMENT='艺术家出版著作信息表';

-- ----------------------------
-- Table structure for artist_chronology
-- ----------------------------
DROP TABLE IF EXISTS `artist_chronology`;
CREATE TABLE `artist_chronology` (
  `ac_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_num` int(11) NOT NULL COMMENT '用户编码',
  `ac_year` varchar(10) NOT NULL COMMENT '年份',
  `ac_event` varchar(1000) NOT NULL COMMENT '艺术家创作经历--艺术家创作经历限制在200字以内',
  PRIMARY KEY (`ac_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='艺术家创作经历年';

-- ----------------------------
-- Table structure for artist_exhibition
-- ----------------------------
DROP TABLE IF EXISTS `artist_exhibition`;
CREATE TABLE `artist_exhibition` (
  `exhibit_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_num` int(11) DEFAULT NULL COMMENT '用户编号',
  `exhibit_name` varchar(60) NOT NULL COMMENT '展览名称',
  `exhibit_area` varchar(60) DEFAULT NULL COMMENT '展览地点',
  `exhibit_info` text COMMENT '展览简介',
  `exhibit_host` varchar(100) DEFAULT NULL COMMENT '主办单位',
  `exhibit_member` varchar(150) DEFAULT NULL COMMENT '参展人员',
  `exhibit_sundertake` varchar(100) DEFAULT NULL COMMENT '承办单位',
  `exhibit_join` varchar(100) DEFAULT NULL COMMENT '协办单位',
  `exhibit_remark` varchar(300) DEFAULT NULL COMMENT '展览备注—展览备注限制在200字以内',
  `exhibit_time` varchar(100) DEFAULT NULL COMMENT '展览时间',
  `exhibition_picture` varchar(255) DEFAULT NULL COMMENT '展览图片',
  PRIMARY KEY (`exhibit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='展览信息表';

-- ----------------------------
-- Table structure for artist_info
-- ----------------------------
DROP TABLE IF EXISTS `artist_info`;
CREATE TABLE `artist_info` (
  `artist_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_num` int(11) NOT NULL COMMENT '用户编码',
  `artist_introduct` varchar(4000) DEFAULT NULL COMMENT '艺术家个人简介--艺术家个人简介限制在500字以内',
  `artist_gradcollege` varchar(60) DEFAULT NULL COMMENT '毕业院校',
  `artist_todayvis` int(11) DEFAULT NULL COMMENT '艺术家个人主页今日访问量',
  `artist_historyvis` int(11) DEFAULT NULL COMMENT '艺术家个人主页历史访问量',
  `category` varchar(20) NOT NULL COMMENT '艺术家的类别',
  `artist_state` varchar(10) NOT NULL COMMENT '艺术家官网是否开通----艺术家官网状态：0表示为开通，1表示已经提交申请，2表示已经通过审核',
  PRIMARY KEY (`artist_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='艺术家详细信息表';

-- ----------------------------
-- Table structure for artist_leave
-- ----------------------------
DROP TABLE IF EXISTS `artist_leave`;
CREATE TABLE `artist_leave` (
  `al_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_num` int(11) NOT NULL COMMENT '艺术家编码',
  `al_name` varchar(60) NOT NULL COMMENT '留言人姓名',
  `al_time` datetime NOT NULL COMMENT '留言时间',
  `al_content` varchar(5000) NOT NULL COMMENT '留言内容--留言内容限制在200字以内',
  PRIMARY KEY (`al_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='艺术家留言板信息表';

-- ----------------------------
-- Table structure for artist_leave_r
-- ----------------------------
DROP TABLE IF EXISTS `artist_leave_r`;
CREATE TABLE `artist_leave_r` (
  `alr_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `al_id` int(11) NOT NULL COMMENT '用户给艺术家留言表外键',
  `alr_name` varchar(60) NOT NULL COMMENT '回复留言人姓名',
  `alr_time` datetime NOT NULL COMMENT '回复留言时间',
  `alr_content` varchar(200) NOT NULL COMMENT '回复留言内容',
  PRIMARY KEY (`alr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='艺术家留言板回复信息表';

-- ----------------------------
-- Table structure for artist_news
-- ----------------------------
DROP TABLE IF EXISTS `artist_news`;
CREATE TABLE `artist_news` (
  `an_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `userNum` int(11) DEFAULT NULL,
  `news_name` varchar(100) DEFAULT NULL COMMENT '资讯名称',
  `news_time` datetime DEFAULT NULL COMMENT '资讯时间',
  `news_digest` varchar(500) DEFAULT NULL COMMENT '资讯摘要—内容限制在200字以内',
  `news_content` text COMMENT '资讯内容',
  `news_resource` varchar(200) DEFAULT NULL COMMENT '资讯来源',
  `news_author` varchar(100) DEFAULT NULL COMMENT '资讯作者',
  `news_state` int(11) DEFAULT NULL COMMENT '资讯审核状态--0是未审核状态，1是已通过审核状态',
  `news_position` int(11) DEFAULT NULL,
  PRIMARY KEY (`an_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='新闻资讯表';

-- ----------------------------
-- Table structure for artist_recommend
-- ----------------------------
DROP TABLE IF EXISTS `artist_recommend`;
CREATE TABLE `artist_recommend` (
  `ar_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
  `user_num` int(11) DEFAULT NULL COMMENT '艺术家编码',
  `recommend_type` varchar(20) DEFAULT NULL COMMENT '推荐类型',
  `recommend_num` int(11) DEFAULT NULL COMMENT '推荐数据的编码',
  `recommend_position` int(11) DEFAULT NULL COMMENT '推荐产品或新闻的位置，从上到下依次为1-5',
  `recommend_order` int(11) DEFAULT NULL COMMENT '推荐作品的排列顺序',
  PRIMARY KEY (`ar_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='艺术家官网首页推荐';

-- ----------------------------
-- Table structure for artist_top
-- ----------------------------
DROP TABLE IF EXISTS `artist_top`;
CREATE TABLE `artist_top` (
  `at_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_num` int(11) DEFAULT NULL COMMENT '艺术家编码',
  `at_path` varchar(255) DEFAULT NULL COMMENT '图片的路径',
  `at_name` varchar(255) DEFAULT NULL COMMENT '图片的名称',
  PRIMARY KEY (`at_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='艺术家官网首页顶部图片';

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_num` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id(作品编号)',
  `gc_id` int(11) DEFAULT NULL COMMENT '商品分类编号',
  `user_num` int(11) DEFAULT NULL COMMENT '用户编码',
  `shopkeeper_num` int(11) DEFAULT NULL,
  `goods_name` varchar(60) DEFAULT NULL COMMENT '商品名称',
  `goods_type` int(11) DEFAULT NULL COMMENT '商品类型（全新0、二手1）',
  `awc_id` int(11) DEFAULT NULL COMMENT '作家自己对作品的分类编号',
  `goods_leave` int(11) DEFAULT NULL COMMENT '商品库存量',
  `goods_price` decimal(10,2) DEFAULT NULL COMMENT '售价',
  `goods_describe` varchar(200) DEFAULT NULL COMMENT '商品的简单描述（卖点限制在200字以内）',
  `goods_content` varchar(100) DEFAULT NULL COMMENT '商品的详细描述',
  `goods_replace` int(11) DEFAULT NULL COMMENT '商品是否置换0表示不置换，1表示置换',
  `goods_audit` int(11) DEFAULT NULL COMMENT '商品、藏品审核状态--0未审核，1已审核通过。',
  `goods_sold` int(11) DEFAULT NULL COMMENT '商品是否销售--0表示不销售，1表示销售。',
  `goods_sold_online` int(11) DEFAULT NULL COMMENT '商品是否支持在线支付--0表示不支持，1表示支持',
  `goods_add_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '商品添加时间',
  `goods_donate` int(11) DEFAULT NULL COMMENT '商品是否捐赠',
  `goods_donate_p` float DEFAULT NULL COMMENT '商品捐赠比例',
  `fw_id` int(11) DEFAULT NULL COMMENT '商品物流模板id',
  `goods_area` varchar(20) DEFAULT NULL COMMENT '商品所属地区',
  `goods_local` varchar(60) DEFAULT NULL COMMENT '商品采购地',
  PRIMARY KEY (`goods_num`)
) ENGINE=InnoDB AUTO_INCREMENT=10000013 DEFAULT CHARSET=utf8 COMMENT='在售商品信息表';

-- ----------------------------
-- Table structure for goods_album
-- ----------------------------
DROP TABLE IF EXISTS `goods_album`;
CREATE TABLE `goods_album` (
  `ga_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `goods_num` int(11) NOT NULL COMMENT '商品编号',
  `ga_oldname` varchar(255) NOT NULL COMMENT '图片原名称',
  `ga_name` varchar(255) NOT NULL COMMENT '图片名称',
  `ga_path` varchar(100) NOT NULL COMMENT '图片路径',
  `ga_main` int(11) DEFAULT '0' COMMENT '商品主图标识 1主图 0不是主图',
  PRIMARY KEY (`ga_id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8 COMMENT='商品图片表';

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_num` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增的无意义的id（用户编码）',
  `user_name` varchar(60) NOT NULL COMMENT '用户登录的账号名称（15个字符以内）',
  `user_phone` varchar(20) DEFAULT NULL COMMENT '用户的手机号码',
  `user_email` varchar(60) DEFAULT NULL COMMENT '用户的邮箱号码',
  `user_passwd` varchar(60) NOT NULL COMMENT '用户登录密码',
  `user_role` int(11) NOT NULL COMMENT '用户的角色代码普通用户为4、艺术家为3、商家为2、管理员为1',
  `user_real_name` varchar(20) DEFAULT NULL COMMENT '用户的真实姓名',
  `user_sex` varchar(5) DEFAULT NULL COMMENT '用户的性别',
  `user_birthday` date DEFAULT NULL COMMENT '出生年月',
  `user_birthplace` varchar(80) DEFAULT NULL COMMENT '籍贯',
  `user_reg_time` datetime NOT NULL COMMENT '注册时间',
  `user_picture` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `user_status` varchar(36) NOT NULL COMMENT '账户状态 1 已激活 未激活时存储32位激活码',
  PRIMARY KEY (`user_num`)
) ENGINE=InnoDB AUTO_INCREMENT=100018 DEFAULT CHARSET=utf8 COMMENT='用户信息表';
