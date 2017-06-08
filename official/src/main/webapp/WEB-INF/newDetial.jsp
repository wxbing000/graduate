<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title><s:property value="#request.userName"/>${request.userName}官方网站</title>
    <script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="css/about_style.css"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <style type="text/css">
        a:visited {
            color: red;
        }
    </style>
    <script type="text/javascript" src="js/jquery.smint.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('.subMenu').smint({
                'scrollSpeed': 1000
            });
        });
    </script>
</head>
<body>
<!-- 顶部图片和导航 开始-->
<%@ include file="index_top.jsp" %>
<!-- 顶部图片和导航 结束 -->
<div class="zixun">


    <!-- 咨询详情开始 -->
    <s:iterator value="#request.newsinfo" var="info">
        <div class="content container_1">
            <div class="content_head">
                <h2><s:property value="#info.newsName"/></h2>

                <p style="float: left;">
                    <span> 来源：<s:property value="#info.newsResource"/></span>
                    <span>作者:<s:property value="#info.newsAuthor"/>&nbsp;&nbsp;</span>
                    <span>时间：<s:date name="#info.newsTime" format="yyyy-MM-dd HH:MM:SS"/></span>
                </p>
            </div>

            <div class="line_dashed">

            </div>

            <div class="content_main">

                <div id="maintext">
                    <p><s:property value="#info.newsContent" escape="false"/></p>
                </div>
            </div>
        </div>
    </s:iterator>

    <!-- 咨询详情结束 -->


    <!--底部页码部分开始-->
    <%--<s:iterator>--%>
        <%--<div class="zixun_footer">--%>
            <%--<div style=" width:80%;;margin:0 auto;">--%>
                <%--<tr>--%>
                    <%--<td colspan="5" align="center">--%>
                        <%--<s:if test="#request.page.hasPrePage">--%>
                            <%--<a href="news.action?currentPage=1&userNum=<s:property value="#request.userNum"/>">首页</a>--%>
                            <%--<a href="news.action?currentPage=${page.currentPage-1 }&userNum=${request.userNum}">上一页</a>--%>
                        <%--</s:if>--%>
                        <%--<s:else>首页 上一页</s:else>--%>
                        <%--<s:if test="#request.page.hasNextPage">--%>
                            <%--<a href="news.action?currentPage=${page.currentPage+1 } &userNum=${request.userNum}">下一页</a>--%>
                            <%--<a href="news.action?currentPage=${page.totalPage }&userNum=${request.userNum}">尾页</a>--%>
                        <%--</s:if>--%>
                        <%--<s:else>下一页 尾页</s:else>&nbsp;&nbsp;&nbsp;&nbsp;--%>
                        <%--当前为第<s:property value="#request.page.currentPage"/>页--%>
                        <%--每页共<s:property value="#request.page.everyPage"/>条--%>
                        <%--共<s:property value="#request.page.totalPage"/>页--%>
                    <%--</td>--%>

                <%--</tr>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</s:iterator>--%>
    <!--底部页码部分结束-->
</div>
<!--右部分内容结束-->

</div>

</body>
</html>

