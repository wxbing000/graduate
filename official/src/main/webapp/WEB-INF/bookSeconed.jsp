<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>${request.userName}出版著作</title>
    <link rel="stylesheet" type="text/css" href="css/all.css">
    <link rel="stylesheet" type="text/css" href="css/second.css">

    <script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="css/about_style.css"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" type="text/css" href="css/common.css">

</head>
<body>
<!--导航条开始-->
<%@ include file="index_top.jsp" %>
<!--导航条结束-->
<div class="main_body container">
    <div class="kuang">
        <div class="road_nav">
            <a href="#">
                <span class="road_nav_1">${request.userName}首页</span>
                <span class="road_nav_2"></span>
            </a>
            <a href="#">
                <span class="road_nav_3"></span>
                <span class="road_nav_1">出版著作</span>
                <span class="road_nav_2"></span>
            </a>
        </div>
        <!-- E road_nav -->
    </div>
    <s:iterator value="#request.bookInfo" var="entity">
        <div class="content container">
            <img src="<s:property value='#entity.bookPicturePath'/>"/>

            <div class="intro">
                <h3><s:property value='#entity.bookName'/></h3>

                <p class="p1">出版社：<s:property value='#entity.bookPress'/></p>

                <p class="p1">作者：<s:property value='#entity.bookAuthor'/></p>

                <p class="p1">开本：<s:property value='#entity.bookSize'/></p>

                <p class="p1">类别：<s:property value='#entity.bookCategory'/></p>

                <p class="p1">定价：<s:property value='#entity.bookPricing'/></p>

                <p class="p1">ISBN：<s:property value='#entity.bookIsbn'/></p>
            </div>
        </div>
        <!-- E content -->
    </s:iterator>

</div>
<!-- E main_body结束 -->

<div class="bottom_nav" >
    <div class="container" >
        <ul>
            <li style="float:left;"><a href="#">关于我们·</a></li>
            <li style="float:left;"><a href="#">联系我们·</a></li>
            <li style="float:left;"><a href="#">网站地图·</a></li>
            <li style="float:left;"><a href="#">版权说明·</a></li>
            <li style="float:left;"><a href="#">免责声明·</a></li>
            <li style="float:left;"><a href="#">专家顾问·</a></li>
            <li style="float:left;"><a href="#">法律顾问</a></li>
        </ul>
    </div>
</div>


</body>
</html>