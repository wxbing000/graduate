<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <title>${request.userName}展览</title>
    <link type="text/css" href="css/style.css" rel="stylesheet"/>
    <link type="text/css" href="css/common.css" rel="stylesheet">
    <link type="text/css" href="css/about_style.css" rel="stylesheet">
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
                    <span class="font1">展览</span>
                </div>
                <div class="ar_r2"></div>
            </div>
        </div>
    </div>
</div>
<!--小导航结束-->
<div class="paimai">

    <!--展览开始-->
    <s:iterator value="#request.exhibition" var="info">
        <div class="zhanlan">
            <div class="zhanlan_div">
                <div class="zhanlan_demo">
                    <img src="<s:property value="#info.pictureUrl"/>" width="100%" height="100%">
                </div>
                <div class="zhanlan_text_title">
                    <font><s:property value="#info.name"/></font>
                </div>
                <div class="zhanlan_text">
                    <span>地点：<s:property value="#info.place"/></span>
                    <span>时间：<s:property value="#info.time"/></span>
                <span>展览：<a href="exhibitioninfo?exhibitId=<s:property value="#info.id"/>"><s:property
                        value="#info.name"/></a></span>
                </div>
            </div>
        </div>
    </s:iterator>
    <!--展览结束-->
    <div class="zixun_footer">
        <div class="page" style=";margin:0 auto;">
            <div align="center">
                <s:if test="1 == #request.page.currentPage">
                    <a href="javaScript:void(0);">首页</a>
                </s:if>
                <s:else>
                    <a href="exhibition?currentPage=1&userNum=<s:property value="#request.userNum"/>">首页</a>
                </s:else>
                <s:if test="#request.page.hasPrePage">
                    <a href="exhibition?currentPage=${page.currentPage-1 }&userNum=${request.userNum}">上一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">上一页</a>
                </s:else>

                <a href="javaScript:void(0);" class="cur"><s:property value="#request.page.currentPage"/></a>

                <s:if test="#request.page.hasNextPage">
                    <a href="exhibition?currentPage=${page.currentPage+1 } &userNum=${request.userNum}">下一页</a>
                </s:if>
                <s:else>
                    <a href="javaScript:void(0);">下一页</a>
                </s:else>
                <s:if test="#request.page.totalPage == #request.page.currentPage">
                    <a href="javaScript:void(0);">尾页</a>
                </s:if>
                <s:else>
                    <a href="exhibition?currentPage=${page.totalPage }&userNum=${request.userNum}">尾页</a>
                </s:else>
            </div>
        </div>
    </div>

</div>
<%--<div class="introduce_nav2">--%>
    <%--<ul>--%>
        <%--<li><a href="javaScript:void(0);">关于我们</a></li>--%>
        <%--<li><a href="javaScript:void(0);">网站地图</a></li>--%>
        <%--<li><a href="javaScript:void(0);">版权说明</a></li>--%>
        <%--<li><a href="javaScript:void(0);">人才招聘</a></li>--%>
        <%--<li><a href="javaScript:void(0);">免责声明</a></li>--%>
        <%--<li><a href="javaScript:void(0);">版权说明</a></li>--%>
        <%--<li><a href="javaScript:void(0);">隐私权保护</a></li>--%>
        <%--<li><a href="javaScript:void(0);">友情链接</a></li>--%>
        <%--<li><a href="javaScript:void(0);">法律顾问</a></li>--%>
    <%--</ul>--%>
<%--</div>--%>
</body>
</html>