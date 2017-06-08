<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>${request.userName}官方网站</title>
    <link href="css/style.css" type="text/css" rel="stylesheet"/>
    <link type="text/css" rel="stylesheet" href="css/common.css"/>

</head>
<body>
<!-- 顶部图片和导航 开始-->
<%@ include file="index_top.jsp" %>
<!-- 顶部图片和导航 结束 -->
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
                    <span class="font1">相册</span>
                </div>
                <div class="ar_r2"></div>
            </div>
        </div>
    </div>
</div>
<!--选择器开始-->
<div class="selectNumberScreen">

    <div id="selectList" class="screenBox screenBackground">

        <dl class="listIndex" attr="terminal_brand_s">
            <dt>拍摄年代：</dt>
            <dd>
                <a href="photo?userNum=<s:property value='#request.userNum'/>" values2="" values1="" attrval="zte中兴">全部年份</a>
                <s:iterator value="#request.albunyear" var="albunyear">
                    <a href="photoByYear?userNum=<s:property value='#request.userNum'/>&year=<s:property value='#albunyear'/>"
                       values2="" values1="" attrval="apple">
                        <s:property value='#albunyear'/></a>
                </s:iterator>
            </dd>
        </dl>
        <dl class="listIndex" attr="terminal_os_s">
            <dt>相册分类：</dt>
            <dd>
                <a href="photo?userNum=<s:property value='#request.userNum'/>" values2="" values1=""
                   attrval="ios">全部相册</a>
                <s:iterator value="#request.albuncategory" var="albuncategory">

                    <a href="photoByCategory?userNum=<s:property value='#request.userNum'/>&aacId=<s:property value='#albuncategory.aacId'/>"
                       values2="" values1="" attrval="android">
                        <s:property value='#albuncategory.aacName'/></a>
                </s:iterator>
            </dd>
        </dl>

    </div>


</div>
<!--选择器结束-->
<!--主内容开始-->
<div class="paimai_text_tupian">
    <s:iterator value="#request.allalbun" var="allalbun">
        <div class="tupian_demo" style="margin-left:1%;">
            <div class="tupian_div">
                <img src="<s:property value='#allalbun.aaPath'/>"/>
            </div>
            <div class="tupian_text">
                <font id="font"><s:property value='#allalbun.aaName'/></font>
                <font>年代：<s:property value='#allalbun.aaYear'/></font>
                <font>简介：<s:property value='#allalbun.aaExplain'/></font>
            </div>
        </div>
    </s:iterator>

    <div class="zixun_footer">
        <div class="page" style=";margin:0 auto;">
            <div align="center">
                <s:if test="1 == #request.page.currentPage">
                    <a href="javaScript:void(0);">首页</a>
                </s:if>
                <s:else>
                    <a href="photo?currentPage=1&userNum=<s:property value="#request.userNum"/>">首页</a>
                </s:else>

                <s:if test="#request.page.hasPrePage">
                    <a href="photo?currentPage=${page.currentPage-1 }&userNum=${request.userNum}">上一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">上一页</a>
                </s:else>

                <a href="javaScript:void(0);" class="cur"><s:property value="#request.page.currentPage"/></a>

                <s:if test="#request.page.hasNextPage">
                    <a href="photo?currentPage=${page.currentPage+1 } &userNum=${request.userNum}">下一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">下一页</a>
                </s:else>

                <s:if test="#request.page.totalPage == #request.page.currentPage">
                    <a href="javaScript:void(0);">尾页</a>
                </s:if>
                <s:else>
                    <a href="photo?currentPage=${page.totalPage }&userNum=${request.userNum}">尾页</a>
                </s:else>
            </div>
        </div>
    </div>

</div>

</body>
</html>
