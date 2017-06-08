<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>${request.userName}官方网站</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/style.css" />
<link type="text/css" rel="stylesheet" href="css/common.css" />
</head>

<body>
	<!-- 顶部图片和导航 开始-->
	<%@ include file="index_top.jsp"%>
	<!-- 顶部图片和导航 结束 -->
	<div style="border:2px solid #000; float:left; width:100%;"></div>
	<div class="mainbody" style="margin-top: 0;">
		<div class="dh">
			<div class="bt">
				<div class="bt2">
					<div class="ar_m1" id="ar_m1">
						<a href="#">齐梦慧首页</a>
					</div>
					<div class="ar_r1" id="ar_r1"></div>
					<div class="ljr">
						<div class="ar_l"></div>
						<div class="ar_m2">
							<span class="font1">作品</span>
						</div>
						<div class="ar_r2"></div>
					</div>
				</div>
			</div>
		</div>
		<!--左部分内容-->
		<div class="works_left">
			<div class="year">
				<div class="title">年份</div>
				<div class="con" style="background-color: #fff;">
					<ul>
						<li>年份</li>
					</ul>
					<span>2001</span> <span>2001</span> <span>2001</span> <span>2001</span>
					<span>2001</span> <span>2001</span>
				</div>
			</div>
			<div class="all">
				<div class="title">全部分类</div>
				<div class="con">
					<ul>
						<li>抽象画(51篇)</li>
						<li>抽象画(51篇)</li>
						<li>抽象画(51篇)</li>
						<li>抽象画(51篇)</li>
					</ul>
				</div>
			</div>
			<div class="work_one">
				<div class="title">认证作品</div>
				<div class="con">
					<ul>
						<li>拍卖真迹</li>
					</ul>
				</div>
			</div>
			<div class="work_two">
				<div class="title">鉴证备案作品</div>
				<div class="con">
					<ul>
						<li>鉴证备案作品</li>
					</ul>
				</div>
			</div>
		</div>
		<!--右部分内容-->
		<div class="works_right">
			<div class="time">
				<!--搜索栏开始-->
				<div class="search_area"
					style="width: 100%; border: 0; float: left; margin: 0;">
					<div class="time" style="width: 44%;">
						时间：<input type="date" style="width: 120px;">-<input
							type="date" style="width: 120px;">
					</div>
					<div class="btn" style="width: 13%; margin-top: 15px;">
						<input type="submit" value="确定" />
					</div>
					<div class="search" style="width: 43%; margin-top: 8px;">
						<input type="text" placeholder="请输入关键词" /> <select
							style="margin-top: 2px;">
							<option value="1">1</option>
							<option value="1">1</option>
						</select> <input type="button" value="搜索" class="search_btn"
							style="float: right; margin-top: 8px;">
					</div>
				</div>
				<!--搜索栏结束-->
			</div>
			<div class="rank">
				<span>排序：</span>
				<ul>
					<li>默认</li>
					<li>最新上传</li>
				</ul>
			</div>
			<div class="zhanlan_div">
				<div class="zhanlan_demo">
					<img src="img/banner2.jpg">
				</div>
				<div class="zhanlan_text">
					<div class="title">放飞的心</div>
					<span>2007年作</span> <span>12.00*23.00cm</span>
				</div>
			</div>
			<div class="zhanlan_div">
				<div class="zhanlan_demo">
					<img src="img/banner2.jpg">
				</div>
				<div class="zhanlan_text">
					<div class="title">放飞的心</div>
					<span>2007年作</span> <span>12.00*23.00cm</span>
				</div>
			</div>
			<div class="zhanlan_div">
				<div class="zhanlan_demo">
					<img src="img/banner2.jpg">
				</div>
				<div class="zhanlan_text">
					<div class="title">放飞的心</div>
					<span>2007年作</span> <span>12.00*23.00cm</span>
				</div>
			</div>
			<div class="zhanlan_div">
				<div class="zhanlan_demo">
					<img src="img/banner2.jpg">
				</div>
				<div class="zhanlan_text">
					<div class="title">放飞的心</div>
					<span>2007年作</span> <span>12.00*23.00cm</span>
				</div>
			</div>
			<div class="zhanlan_div">
				<div class="zhanlan_demo">
					<img src="img/banner2.jpg">
				</div>
				<div class="zhanlan_text">
					<div class="title">放飞的心</div>
					<span>2007年作</span> <span>12.00*23.00cm</span>
				</div>
			</div>
			<!--底部页码部分开始-->
			<div class="zixun_footer">
				<div style=" width:80%;;margin:0 auto;">
					<div class="zixun_footer_div">
						<a href="#"><font>首页</font></a>
					</div>
					<div class="zixun_footer_div">
						<a href="#"><font>上一页</font></a>
					</div>
					<div class="zixun_footer_num" id="zixun_first">
						<a href="#"><font>1</font></a>
					</div>
					<div class="zixun_footer_num">
						<a href="#"><font>2</font></a>
					</div>
					<div class="zixun_footer_num">
						<a href="#"><font>3</font></a>
					</div>
					<div class="zixun_footer_num">
						<a href="#"><font>4</font></a>
					</div>
					<div class="zixun_footer_num">
						<a href="#"><font>5</font></a>
					</div>
					<div class="zixun_footer_div">
						<a href="#"><font>后一页</font></a>
					</div>
					<div class="zixun_footer_div">
						<a href="#"><font>尾页</font></a>
					</div>
				</div>
			</div>
			<!--底部页码部分结束-->
		</div>
	</div>
</body>
</html>

