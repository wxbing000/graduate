<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>${request.userName}</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
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
                    <span class="font1">拍卖行情</span>
                </div>
                <div class="ar_r2"></div>
            </div>
        </div>
    </div>
</div>
<!--小导航结束-->
<div class="paimai">
    <div class="paimai_top">
        <ul>
            <li>贾又福拍卖纪录</li>
        </ul>
    </div>
    <s:iterator value="#request.AuctionList" var="AuctionList">
        <div class="paimai_text_tupian">
            <div class="tupian_demo">
                <div class="tupian_div">
                    <img src="<s:property value='#AuctionList.productImg'/>"/>
                </div>
                <div class="tupian_text">
                    <font id="font">作品名：<s:property value='#AuctionList.productName'/>
                        <%--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value='#AuctionList.productCategory'/>--%>
                    </font>
                    <font>作品尺寸：<s:property value='#AuctionList.productSize'/></font>
                    <font>创作年代：<s:property value='#AuctionList.productYears'/></font>
                    <font>拍卖时间：<s:property value='#AuctionList.aaTime'/></font>
                    <font>拍卖会：<s:property value='#AuctionList.aaName'/></font>
                    <font>拍卖公司：<s:property value='#AuctionList.aaAucompany'/></font>
                    <font>估价：<s:property value='#AuctionList.aaBargainPrice'/></font>
                </div>
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
                    <a href="auction?currentPage=1&userNum=<s:property value="#request.userNum"/>">首页</a>
                </s:else>

                <s:if test="#request.page.hasPrePage">
                    <a href="auction?currentPage=${page.currentPage-1 }&userNum=${request.userNum}">上一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">上一页</a>
                </s:else>

                <a href="javaScript:void(0);" class="cur"><s:property value="#request.page.currentPage"/></a>

                <s:if test="#request.page.hasNextPage">
                    <a href="auction?currentPage=${page.currentPage+1 } &userNum=${request.userNum}">下一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">下一页</a>
                </s:else>

                <s:if test="#request.page.totalPage == #request.page.currentPage">
                    <a href="javaScript:void(0);">尾页</a>
                </s:if>
                <s:else>
                    <a href="auction?currentPage=${page.totalPage }&userNum=${request.userNum}">尾页</a>
                </s:else>
            </div>
        </div>
    </div>

</div>

</body>
</html>
