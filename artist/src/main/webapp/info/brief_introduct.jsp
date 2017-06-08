<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>个人简介管理</title>
    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css"/>
    <link rel="stylesheet" href="js/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>

    <!-- 加载ueditorjs开始 -->
    <script type="text/javascript" charset="utf-8"
            src="<%=basePath%>ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="<%=basePath%>ueditor/ueditor.all.min.js">

    </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8"
            src="<%=basePath%>ueditor/lang/zh-cn/zh-cn.js"></script>
    <!-- 加载ueditorjs结束 -->

    <script type="text/javascript">
        $(document).ready(function () {
            $("#second").hide();
            $("#change").click(function () {
                $("#change").hide();
                $("#first").hide();
                $("#second").show();
            });
            $("#fanhui").click(function () {
                $("#change").show();
                $("#first").show();
                $("#second").hide();
            });
        });
    </script>

</head>

<body>
<%@include file="../top.jsp" %>
<%@include file="../left.jsp" %>
<div class="container-fluid">
    <ol class="breadcrumb">
        <li>您的当前位置</li>
        <li><a href="#">个人简介管理</a></li>
    </ol>
</div>
<hr color="#000000">

<!-- 如果数据库中存在艺术家个人简介则显示个人简介  -->
<s:if test="#request.introduct[0] != null">

    <div id="first" class="container">
        <s:property value="message"/>
        <s:property value="#request.introduct[0]" escape="false"/>
        <div class="col-md-2 col-lg-2 col-md-offset-5 col-lg-offset-5">
            <input id="change" type="button" class="btn btn-default" value="修改"/>
        </div>
    </div>

    <div id="second" class="container">
        <form action="insertIntroduct" method="post">

            <script id="container" name="info" type="text/plain"></script>
            <script type="text/javascript">
                var editor = UE.getEditor('container', {
                    initialFrameHeight: 200
                });
            </script>
            <br>

            <div class="col-md-3 col-md-offset-2">
                <input type="submit" class="btn btn-default" value="提交"/>
            </div>
        </form>
        <div class="col-md-3 col-md-offset-2">
            <input type="button" class="btn btn-default" value="返回" id="fanhui"/>
        </div>

    </div>

</s:if>
<!-- 如果数据库中不存在艺术家个人简介信息则直接显示输入框 -->
<s:elseif test="#request.introduct[0] == null">

    <form action="insertIntroduct" method="post">

        <script id="container2" name="info" type="text/plain"></script>
        <script type="text/javascript">
            var editor = UE.getEditor('container2', {
                initialFrameHeight: 200
            });
        </script>

        <input type="submit" value="提交"/>
    </form>

</s:elseif>


<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>
