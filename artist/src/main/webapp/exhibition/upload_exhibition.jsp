<%@ page language="java" pageEncoding="UTF-8" %>
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

    <title>添加拍卖信息</title>

    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css"/>
    <link rel="stylesheet" href="js/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>

    <!-- 加载ueditorjs开始 -->
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript">
        function validateImage() {
            if ($("#exhibition_photo").val() == "") {
                alert("请添加展览图片");
                return false;
            }
            if($("#remark").val().length >= 200){
                alert("请检查备注的长度");
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
        <li><a href="#">添加展览信息</a></li>
    </ol>
</div>
${message}
<div class="container">
    <div class="col-md-6 col-md-offset-3">
        <form class="form" action="uploadExhibition" method="post" enctype="multipart/form-data"
              onsubmit="return validateImage();">
            <div class="form-group" style="margin-bottom: 15px;">
                <label>展览名称：</label>
                <input type="text" class="form-control" name="artistExhibition.exhibitName">
                <label >展览地点：</label>
                <input type="text" class="form-control" name="artistExhibition.exhibitArea">
                <label>展览简介：</label>
                <input type="text" class="form-control" name="artistExhibition.exhibitInfo">
                <label>主办单位：</label>
                <input type="text" class="form-control" name="artistExhibition.exhibitHost">
                <label>参展人员：</label>
                <input type="text" class="form-control" name="artistExhibition.exhibitMember">
                <label>承办单位：</label>
                <input type="text" class="form-control" name="artistExhibition.exhibitSundertake" >
                <label>协办单位：</label>
                <input type="text" class="form-control" name="artistExhibition.exhibitJoin">
                <label>展览备注—展览备注限制在200字以内：</label>
                <textarea class="form-control" name="artistExhibition.exhibitRemark" rows="3" id="remark" ></textarea>
                <label>展览时间：</label>
                <input type="text" class="form-control" name="artistExhibition.exhibitTime">
                <label>展览图片：</label>
                <input type="file" name="picture" id="exhibition_photo">
                <input type="submit" class="btn btn-default" style="text-align: center" value="添加"/>
            </div>
        </form>
    </div>
</div>

<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>