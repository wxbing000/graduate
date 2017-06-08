<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <title><s:property value="#request.userName"/>${request.userName}官方网站</title>
    <script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="css/about_style.css"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <script type="text/javascript" src="js/jquery.smint.js"></script>
</head>
<body>
<!-- 顶部图片和导航 开始-->
<%@ include file="index_top.jsp" %>
<!-- 顶部图片和导航 结束 -->
<!--小导航开始-->
<div class="dh" style="border-bottom: 3px solid #000;">
    <div class="bt">
        <div class="bt2">
            <div class="ar_m1" id="ar_m1">
                <a href="index?userNum=${userNum}">${userName}首页</a>
            </div>
            <div class="ar_r1" id="ar_r1"></div>
            <div class="ljr">
                <div class="ar_l"></div>
                <div class="ar_m2">
                    <span class="font1">资讯</span>
                </div>
                <div class="ar_r2"></div>
            </div>
        </div>
    </div>
</div>
<!--小导航结束-->
<div class="zixun">

    <!--右部分内容开始-->
    <s:iterator value="#request.newsList" var="entity">
        <div class="huayu">

            <div class="huayu_title">
                <div class="huayu_title_left"><font><a href="newsinfo?anId=<s:property value='#entity.anId'/>">
                    <s:property value="#entity.newsName"/></a></font></div>
                <div class="huayu_title_min"><font><s:property value='#entity.newsAuthor'/></font></div>
                <div class="huayu_title_right"><font><s:property value='#entity.newsTime'/></font></div>
            </div>
            <hr/>
            <div class="huayu_text">
                <div class="huayu_text_top">
                    <s:property value='#entity.newsDigest' escape="false"/>
                    <a href="newsinfo?anId=<s:property value='#entity.anId'/>">详细</a>
                </div>
            </div>

        </div>
    </s:iterator>
    <!--底部页码部分开始-->

    <div class="zixun_footer">
        <div class="page" style=";margin:0 auto;">
            <div align="center">
                <s:if test="1 == #request.page.currentPage">
                    <a href="javaScript:void(0);">首页</a>
                </s:if>
                <s:else>
                    <a href="news?currentPage=1&userNum=<s:property value="#request.userNum"/>">首页</a>
                </s:else>

                <s:if test="#request.page.hasPrePage">
                    <a href="news?currentPage=${page.currentPage-1 }&userNum=${request.userNum}">上一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">上一页</a>
                </s:else>

                <a href="javaScript:void(0);" class="cur"><s:property value="#request.page.currentPage"/></a>

                <s:if test="#request.page.hasNextPage">
                    <a href="news?currentPage=${page.currentPage+1 } &userNum=${request.userNum}">下一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">下一页</a>
                </s:else>

                <s:if test="#request.page.totalPage == #request.page.currentPage">
                    <a href="javaScript:void(0);">尾页</a>
                </s:if>
                <s:else>
                    <a href="news?currentPage=${page.totalPage }&userNum=${request.userNum}">尾页</a>
                </s:else>
            </div>
        </div>
    </div>

    <!--底部页码部分结束-->
</div>
<!--右部分内容结束-->

</div>

</body>
</html>

