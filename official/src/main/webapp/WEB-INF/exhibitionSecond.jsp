<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>${request.userName}展览</title>
    <link rel="stylesheet" type="text/css" href="css/third.css">
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <script type="text/javascript" src="js/script.js"></script>
</head>
<body>
<!--导航条开始-->
<%@ include file="index_top.jsp" %>
<%--导航条结束--%>

<s:iterator value="#request.exhibitioninfo" var="info">

    <div class="content_title"><h2><s:property value="#info.exhibitName"/></h2></div>

    <!-- S container -->
    <div class="container_2">

        <div class="content1">
           <img src="<s:property value="#request.pictureUrl"/>">
        </div>

        <div>
            <table border="0" cellspacing="10">
                <tr>
                    <th style="width:100px">展览时间：</th>
                    <td><s:property value="#info.exhibitTime"/></td>
                </tr>
                <tr>
                    <th>展览城市：</th>
                    <td><s:property value="#info.exhibitArea"/></td>
                </tr>
                <tr>
                    <th>主办单位：</th>
                    <td><s:property value="#info.exhibitHost"/></td>
                </tr>
                <tr>
                    <th>承办单位：</th>
                    <td><s:property value="#info.exhibitSundertake"/></td>
                </tr>
                <tr>
                    <th>参展人员：</th>
                    <td><s:property value="#info.exhibitMember"/></td>
                </tr>
                <tr>
                    <th>展览备注：</th>
                    <td><s:property value="#info.exhibitRemark"/></td>
                </tr>
                <tr>
                    <th>展览介绍：</th>
                    <td><s:property value="#info.exhibitInfo"/></td>
                </tr>
            </table>
        </div>
    </div>
    <!-- E container_2 -->
</s:iterator>
<div class="container">
    <div class="midline">
        <div class="border"></div>
    </div>
</div>
</body>
</html>