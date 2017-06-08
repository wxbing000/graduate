<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
	<div id="header">
		<div class="logo">中国艺术家官网后台</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><s:property value="#session.userRealNum"/></li>
				<!-- <li><a href="">修改密码</a></li> -->
				<li><a href="">退出</a></li>
			</ul>
		</div>
	</div>
	
	
