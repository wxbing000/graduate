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
            $.post("deleteExhibitin", {
                exhibitionId: id
            }, function (data, status) {
                //删除要删除的艺术家分类的父节点
                s.parentNode.parentNode.remove();
            });
        }

        function updateAuction(id) {
            $("#bid").val(id);
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
        <li><a href="#">修改展览信息</a></li>
    </ol>
</div>

<div class="book">
    <dl class="dl">

        <s:iterator value="#request.exhibitions" var="entity" status="st">
            <dt class="dt" id="eee">
            <div class="div_img" id="fff">
                <img src="<s:property value="#entity.exhibitionPicture" />"/>
            </div>
            <div class="div_text" id="ccc">
                <div class="div_text_title">
                </div>
                <div class="div_text_font" id="ddd">
                    <font><b>展览名称：</b> <s:property value="#entity.exhibitName"/></font>
                    <font><b>展览时间：</b> <s:property value="#entity.exhibitTime"/></font>
                    <font><b>展览地点：</b> <s:property value="#entity.exhibitArea"/></font>
                    <font><b>主办方:</b> <s:property value="#entity.exhibitHost"/></font>
                </div>
            </div>
            <div style="float: right;margin-right:40px" id="aaa">
                <input id="bbb" type="button" class="btn btn-default" value="编辑"
                       onclick="updateAuction(<s:property value="#entity.exhibitId"/>);"/>
                <input type="button" class="btn btn-default" value="删除"
                       onclick="delAuction(this,<s:property value="#entity.exhibitId"/>);"/>
            </div>
            </dt>
        </s:iterator>

    </dl>
</div>
<s:url id="url_pre" action="getAllExhibition">
    <s:param name="pageNow" value="pageNow-1"></s:param>
</s:url>

<s:url id="url_next" action="getAllExhibition">
    <s:param name="pageNow" value="pageNow+1"></s:param>
</s:url>

<s:url id="url_end" action="getAllExhibition">
    <s:param name="pageNow" value="totalPage"></s:param>
</s:url>

<s:url id="url_start" action="getAllExhibition">
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
    <form action="updateExhibition" method="post">
        <input type="hidden" name="artistExhibition.exhibitId" id="bid">
        展览名称：<input type="text" name="artistExhibition.exhibitName"  maxlength="60"/><br/>
        展览地点：<input type="text" name="artistExhibition.exhibitArea" maxlength="60"/><br/>
        展览简介：<input type="text" name="artistExhibition.exhibitInfo"  maxlength="60"/><br/>
        主办单位：<input type="text" name="artistExhibition.exhibitHost" maxlength="60"/><br/>
        参展人员：<input type="text" name="artistExhibition.exhibitMember" maxlength="30"/><br/>
        承办单位：<input type="text" name="artistExhibition.exhibitSundertake"  maxlength="20"/><br/>
        协办单位：<input type="text" name="artistExhibition.exhibitJoin"  maxlength="30"/><br/>
        展览时间：<input type="text" name="artistExhibition.exhibitTime"  maxlength="30"/><br/>
        展览备注—展览备注限制在200字以内:<br/>
        <textarea name="artistExhibition.exhibitRemark" maxlength="100" cols="25" rows="4"></textarea>
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
