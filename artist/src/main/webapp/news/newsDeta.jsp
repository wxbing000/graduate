<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

    <title>查看所有资讯</title>
    <link rel="stylesheet" href="js/bootstrap/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css"/>
    <script type="text/javascript" src="<%=basePath%>js/layer.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>
    <link type="text/css" rel="stylesheet" href="css/news/singlestyle.css"/>
    <link type="text/css" rel="stylesheet" href="css/news/style.css"/>
</head>
<body>
<%@include file="../top.jsp" %>
<%@include file="../left.jsp" %>

<div class="container-fluid">
    <ol class="breadcrumb">
        <li>您的当前位置</li>
        <li><a href="#">资讯内容</a></li>
    </ol>
</div>

<h2 align="center">
    <s:property value="#request.aNew.newsName"/>
</h2>
<h4 align="right">
    <s:property
            value="%{getText('{0,date,yyyy-MM-dd HH:mm}',{#request.aNew.newsTime})}"/>
</h4>
<s:property value="#request.aNew.newsContent" escape="false"/>

<%--
        <div class="main">
        <div class="noticemain">
            <!--标题部分-->
            <div class="bt">
                <div class="bt1">
                    <font>消息详情</font>
                </div>

            </div>
            <!--新闻部分-->
            <div class="new_title">
                <div align="center" class="new_title_font">
                    <s:property value="#request.aNew.newsName />
                </div>
            </div>
            <div class="new_info">
                <br /> <br />
                <div align="center" class="info_font">
                    <s:property value="#request.aNew.newsTime" />|
                    <s:property value="#request.aNew.newsAuthor" />
                </div>
            </div>
            <div class="new_main">
                <div class="new_main_font">
                    <p>
                        <s:property value="#request.aNew.newsContent" escape="false" />
                    </p>
                    <br>
                </div>
            </div>
        </div>
    </div> --%>


<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>
