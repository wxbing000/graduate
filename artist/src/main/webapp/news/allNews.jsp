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
    <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>
    <style type="text/css">
        table tr {
            text-align: center;
        }

        table tr td {
            width: 200px;
            height: 30px;
        }
    </style>
</head>


<body>
<%@include file="../top.jsp" %>
<%@include file="../left.jsp" %>

<div class="container-fluid">
    <ol class="breadcrumb">
        <li>您的当前位置</li>
        <li><a href="#">查看所有资讯</a></li>
    </ol>
</div>
<s:property value="message"/>
<div align="center">
    <table border="1">
        <tr>
            <td>ID</td>
            <td>主题</td>
            <td>时间</td>
            <td></td>
        </tr>
        <s:iterator value="#request['allNew']" id="e">
            <tr>
                <td><s:property value="#request.e.anId"/></td>
                <td><a
                        href='newsDetail?newsId=<s:property value="#request.e.anId"/>'><s:property
                        value="#request.e.newsName"/></a></td>

                <td><s:property
                        value="%{getText('{0,date,yyyy-MM-dd HH:mm}',{#request.e.newsTime})}"/></td>

                <td>
                    <form action="delNew" method="post">
                        <input type="hidden" name="newsId"
                               value="<s:property value="#request.e.anId" />"> <input
                            type="submit" value="删除">
                    </form>
                </td>
            </tr>
        </s:iterator>

    </table>
</div>
<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>
