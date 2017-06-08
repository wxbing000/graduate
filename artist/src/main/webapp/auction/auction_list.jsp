<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <title>拍卖信息列表</title>
    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css"/>
    <link rel="stylesheet" href="js/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/layer/layer.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>

    <!-- 加载ueditorjs开始 -->
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.all.min.js">
    </script>
    <!-- 加载ueditorjs结束 -->

    <style type="text/css">
        .book {
            width: 100%;
            margin: 0 auto;
            float: left;
        }

        .dl {
            width: 100%;
            float: left;
        }

        .dt {
            width: 49%;
            float: left;
            height: 400px;
            border: #fff solid 2px;
        }

        .div_img {
            width: 50%;
            float: left;
        }

        .div_img img {
            width: 100%;
            height: 357px;
        }

        .div_text {
            width: 49%;
            margin-left: 1%;
            float: left;
            height: 357px;
            overflow: hidden;
        }

        .div_text_title {
            width: 100%;
            float: left;
            height: 36px;
            line-height: 36px;
        }

        .div_text_title a {
            font-size: 14px;
            font-weight: bold;
            line-height: 36px;
            padding-left: 10px;
        }

        .div_text_font {
            width: 100%;
            height: 221px;
            float: left;
        }

        .div_text_font font {
            width: 100%;
            float: left;
            height: 35px;
            line-height: 35px;
            padding-left: 10px;
        }

        .div_text:hover {
            /*background-image: url(art/IMG/B.jpg);*/
            background-repeat: repeat;
        }

        .div_text:hover .div_text_title a {
            text-decoration: underline;
        }
    </style>
    <script type="text/javascript">
        function delAuction(s, id) {
            $.post("delAuction", {
                id: id
            }, function (data, status) {
                var obj = eval("(" + data + ")");
                var b = obj.delState;
                if (b == "1") {
                    //删除要删除的艺术家分类的父节点
                    s.parentNode.parentNode.remove();
                }
            });
        }

        function updateAuction(s, id) {
            $("#bid").val(id);
            $("#bidd").val(id);
            layer.open({
                type: 1,
                shade: 0,
                closeBtn: 2,
                area: ['500px', '500px'],
                content: $('#updateAuction'),
                skin: 'layui-layer-rim'
            });

        }
    </script>
</head>

<body>
<%@include file="../top.jsp" %>
<%@include file="../left.jsp" %>
<div class="container-fluid">
    <ol class="breadcrumb">
        <li>您的当前位置</li>
        <li><a href="#">修改拍卖信息</a></li>
    </ol>
</div>

<div class="book">
    <dl class="dl">

        <s:iterator value="#request.allAuction" var="entity" status="st">
            <dt class="dt">
            <div class="div_img" id="fff">
                <img src="<s:property value="#entity.productImg" />"/>
            </div>
            <div class="div_text" id="ccc">
                <div class="div_text_title">

                </div>
                <div class="div_text_font" id="ddd">
                    <font><b>作品名称：</b> <s:property value="#entity.productName"/></font>
                    <font><b>作品分类：</b> <s:property value="#entity.productCategory"/></font>
                    <font><b>作品大小：</b> <s:property value="#entity.productSize"/></font>
                    <font><b>创作年代:</b> <s:property value="#entity.productYears"/></font>
                    <font><b>拍卖时间:</b> <s:property value="#entity.aaTime"/></font>
                    <font><b>拍卖公司名称:</b> <s:property value="#entity.aaAucompany"/></font>
                    <font><b>拍卖会名称:</b> <s:property value="#entity.aaName"/></font>
                    <font><b>拍卖专场:</b> <s:property value="#entity.aaSpeciallyName"/></font>
                </div>
            </div>
            <div style="float: right;margin-right:40px" id="aaa">
                <input id="bbb" type="button" class="btn btn-default" value="编辑"
                       onclick="updateAuction(this,<s:property value="#entity.aaId"/>);"/>
                <input type="button" class="btn btn-default" value="删除"
                       onclick="delAuction(this,<s:property value="#entity.aaId"/>);"/>
            </div>
            </dt>
            <input id="contents" type="hidden" value=<s:property value="#entity.aaExplain"/> />
        </s:iterator>

    </dl>
</div>
<s:url id="url_pre" action="allAuction">
    <s:param name="pageNow" value="pageNow-1"></s:param>
</s:url>

<s:url id="url_next" action="allAuction">
    <s:param name="pageNow" value="pageNow+1"></s:param>
</s:url>

<s:url id="url_end" action="allAuction">
    <s:param name="pageNow" value="totalPage"></s:param>
</s:url>

<s:url id="url_start" action="allAuction">
    <s:param name="pageNow" value="1"></s:param>
</s:url>

<nav>
    <ul class="pager">
        <s:if test="pageNow <=1">
            <li><s:a href="%{url_start}">首页</s:a></li>
        </s:if>
        <s:else>
            <li><s:a href="%{url_pre}">上一页</s:a></li>
        </s:else>
        <s:if test="pageNow >= totalPage">
            <li><s:a href="%{url_end}">末页</s:a></li>
        </s:if>
        <s:else>
            <li><s:a href="%{url_next}">下一页</s:a></li>
        </s:else>
    </ul>
</nav>

<div></div>

<div id="updateAuction" style="display:none;">
    <form action="updateAuction" method="post" enctype="multipart/form-data">
        <input type="hidden" name="artAuction.aaId" id="bid">
        <input type="hidden" name="id" id="bidd">
        作品名：<input type="text" name="artAuction.productName" id="zpm" maxlength="60"/><br/>
        作品分类：
        <select name="artAuction.productCategory" id="fl">
            <option value="静态画">静态画</option>
            <option value="山水画">山水画</option>
        </select><br/>
        作品尺寸：<input type="text" name="artAuction.productSize" id="cc" maxlength="60"/><br/>
        创作年代：<input type="text" name="artAuction.productYears" id="nd" maxlength="60"/><br/>
        拍卖时间：<input type="text" name="artAuction.aaTime" id="sj" maxlength="60"/><br/>
        拍卖公司名称：<input type="text" name="artAuction.aaAucompany" id="gsmc" maxlength="30"/><br/>
        拍卖会名称：<input type="text" name="artAuction.aaName" id="hmc" maxlength="20"/><br/>
        拍卖专场：<input type="text" name="artAuction.aaSpeciallyName" id="zc" maxlength="30"/><br/>
        拍卖会说明:<br/>
        <textarea name="artAuction.aaExplain" maxlength="100" cols="25" rows="4"></textarea>
        <%--<script id="container2" name="artAuction.aaExplain"
                type="text/plain" id="hsm"></script>
        <script type="text/javascript">
            var editor = UE.getEditor('container2', {
                toolbars: [],
                autoHeightEnabled: true,
                autoFloatEnabled: true,
                initialFrameWidth: 500, //容器初始化宽度
                initialFrameHeight: 300, //初始化高度
                maximumWords: 100 //最长字符数
            });
        </script>
--%>
        <br/>
        <input type="submit" value="提交">
    </form>
</div>

<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>
