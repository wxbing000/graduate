<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>${request.userName}出版著作</title>
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
                    <span class="font1">出版著作</span>
                </div>
                <div class="ar_r2"></div>
            </div>
        </div>
    </div>
</div>
<!--小导航结束-->
<div class="book">
    <!--book_div开始-->
    <s:iterator value="#request.allBook" var="entity">
        <div class="book_div">
            <div class="div_img"><img src="<s:property value='#entity.bookPicturePath'/>"/></div>
            <div class="div_text">
                <div class="div_text_title"><a href="bookinfo?bookId=<s:property value='#entity.bookId'/>"><s:property
                        value='#entity.bookName'/></a></div>
                <div class="div_text_font">
                    <font>出版社：<s:property value='#entity.bookPress'/></font>
                    <font>作者：<s:property value='#entity.bookPublicatTime'/></font>
                    <font>所属类别：<s:property value='#entity.bookCategory'/></font>
                    <font>定价：<s:property value='#entity.bookPricing'/></font>
                </div>
            </div>
        </div>
    </s:iterator>
    <!--book_div结束-->
    <!--底部页码部分开始-->
    <div class="zixun_footer">
        <div class="page" style=";margin:0 auto;">
            <div align="center">
                <s:if test="1 == #request.page.currentPage">
                    <a href="javaScript:void(0);">首页</a>
                </s:if>
                <s:else>
                    <a href="book?currentPage=1&userNum=<s:property value="#request.userNum"/>">首页</a>
                </s:else>

                <s:if test="#request.page.hasPrePage">
                    <a href="book?currentPage=${page.currentPage-1 }&userNum=${request.userNum}">上一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">上一页</a>
                </s:else>

                <a href="javaScript:void(0);" class="cur"><s:property value="#request.page.currentPage"/></a>

                <s:if test="#request.page.hasNextPage">
                    <a href="book?currentPage=${page.currentPage+1 } &userNum=${request.userNum}">下一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">下一页</a>
                </s:else>

                <s:if test="#request.page.totalPage == #request.page.currentPage">
                    <a href="javaScript:void(0);">尾页</a>
                </s:if>
                <s:else>
                    <a href="book?currentPage=${page.totalPage }&userNum=${request.userNum}">尾页</a>
                </s:else>
            </div>
        </div>
    </div>
    <!--底部页码部分结束-->
</div>

</body>
</html>
