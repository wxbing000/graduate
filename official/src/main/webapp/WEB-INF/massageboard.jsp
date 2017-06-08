<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <title>留言</title>
    <link type="text/css" href="css/style.css" rel="stylesheet"/>
    <link type="text/css" href="css/common.css" rel="stylesheet">
</head>

<body>
<!--导航条开始-->
<%@ include file="index_top.jsp" %>
<!--导航条结束-->
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
                    <span class="font1">留言</span>
                </div>
                <div class="ar_r2"></div>
            </div>
        </div>
    </div>
</div>
<!--小导航结束-->
<!--留言板页面开始-->

<div class="lyb">
    <s:iterator value="#request.leaveList" var="entity">
        <div class="lyb_text">
            <div class="lyb_text_info">
                <div class="lyb_text_info_title">
                    <div class="lyb_text_info_title_name"><font><s:property value='#entity.alName'/></font></div>
                    <div class="lyb_text_info_title_time"><font><s:property value='#entity.alTime'/></font></div>
                </div>
                <div class="lyb_text_info_text"><font><s:property value='#entity.alContent'/></font></div>
            </div>
        </div>
    </s:iterator>
<%--</div>--%>
<form action="fabiaoleave" method="post">
    <div class="post">
        <div>
            <h2>我要评论</h2>
        </div>

        <textarea cols="80" rows="5" name="alContent"></textarea>

        <div>
            <input type="text" hidden="hidden" name="userNum" value=<s:property value='#request.userNum'/>>
            <input type="text" placeholder="匿名" class="input_top" name="alName">
            <input type="submit" value="评论" class="button">
        </div>
        <p class="small">注：网友评论只供表达个人看法，并不代表本网站同意其看法或者证实其描述</p>
    </div>
</form>
<!--底部页码部分开始-->
<div class="zixun_footer">
    <div class="page" style=";margin:0 auto;">
        <div align="center">
            <s:if test="1 == #request.page.currentPage">
                <a href="javaScript:void(0);">首页</a>
            </s:if>
            <s:else>
                <a href="leave?currentPage=1&userNum=<s:property value="#request.userNum"/>">首页</a>
            </s:else>

            <s:if test="#request.page.hasPrePage">
                <a href="leave?currentPage=${page.currentPage-1 }&userNum=${request.userNum}">上一页</a>
            </s:if>
            <s:else>
                <a href="javaScript:void(0);">上一页</a>
            </s:else>

            <a href="javaScript:void(0);" class="cur"><s:property value="#request.page.currentPage"/></a>

            <s:if test="#request.page.hasNextPage">
                <a href="leave?currentPage=${page.currentPage+1 } &userNum=${request.userNum}">下一页</a>
            </s:if>
            <s:else>
                <a href="javaScript:void(0);">下一页</a>
            </s:else>

            <s:if test="#request.page.totalPage == #request.page.currentPage">
                <a href="javaScript:void(0);">尾页</a>
            </s:if>
            <s:else>
                <a href="leave?currentPage=${page.totalPage }&userNum=${request.userNum}">尾页</a>
            </s:else>
        </div>
    </div>
</div>
<!--底部页码部分结束-->

</div>
<!--留言板页面结束-->
</body>
</html>

