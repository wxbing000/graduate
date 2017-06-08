<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">

    <title>发表资讯</title>

    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css"/>
    <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>
    <link rel="stylesheet" href="js/bootstrap/bootstrap.min.css">
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.all.min.js"></script>
    <!-- 加载ueditorjs结束 -->
    <script type="text/javascript">
        function submitNotice() {
            if (confirm("确认提交？")) {
                $("#notice").submit();
            } else {
                return false;
            }
        }
    </script>
</head>

<body>
<%@include file="../top.jsp" %>
<%@include file="../left.jsp" %>

<div class="container-fluid">
    <ol class="breadcrumb">
        <li>您的当前位置</li>
        <li><a href="#">发表资讯</a></li>
    </ol>
</div>
<div class="container">
    <form id="notice" action="addNews" method="post"
          enctype="multipart/form-data" class="form-horizontal col-md-6">

        <div class="form-group">
            <label class="control-label col-md-4">资讯主题:</label>

            <div class="col-md-8">
                <input type="text" class="form-control" name="newsTitle"
                       placeholder="资讯主题">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-4">资讯来源:</label>

            <div class="col-md-8">
                <input type="text" class="form-control" name="NewsResource"
                       placeholder="资讯来源">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-4">资讯摘要:</label>

            <div class="col-md-8">
                <textarea name="newsDigest" class="form-control" placeholder="资讯摘要" rows="4"></textarea>
            </div>
        </div>


        <div class="container">
            <label>资讯内容：</label>

            <div class="row" style="z-index:-1">
                <div class="col-md-12" style="margin-top:20px;">
                    <script id="newsContent" name="newsContent" type="text/plain"
                            style="height:200px;">
                    </script>
                    <script type="text/javascript">
                        var ue = UE.getEditor("newsContent");
                    </script>
                </div>
            </div>
        </div>

        <div style="margin-left:500px">
            <input type="button" class="btn btn-default" value="提交"
                   onclick="submitNotice();">
        </div>
    </form>
</div>

<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>
