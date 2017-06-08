<%@ page language="java" pageEncoding="UTF-8" %>
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
            if ($("#product_photo").val() == "") {
                alert("请添加著作图片");
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
        <li><a href="#">添加拍卖信息</a></li>
    </ol>
</div>

<div class="container">
    <div class="col-md-6 col-md-offset-3">
        <form class="form" action="addAuction" method="post" enctype="multipart/form-data"
              onsubmit="return validateImage();">
            <div class="form-group" style="margin-bottom: 15px;">
                <label for="name">作品分类：</label> <select name="artAuction.productCategory">
                <option value="静态画">静态画</option>
                <option value="山水画">山水画</option>
            </select> <br>
                <label for="name">作品名称：</label>
                <input type="text" class="form-control" name="artAuction.productName">
                <label for="name">作品大小：</label>
                <input type="text" class="form-control" name="artAuction.productSize"> <label for="name">作品年份：</label>
                <input type="text" class="form-control" name="artAuction.productYears">
                <label for="name">拍卖公司名称：</label>
                <input type="text" class="form-control" name="artAuction.aaAucompany">
                <label for="p_name">拍卖会名称：</label>
                <input type="text" class="form-control" name="artAuction.aaName">
                <label for="time">拍卖时间：</label>
                <input type="date" class="form-control" name="artAuction.aaTime">
                <label for="name">成交价：</label>
                <input type="text" class="form-control" name="artAuction.aaBargainPrice">
                <label for="name">估价：</label>
                <input type="text" class="form-control" name="artAuction.aaEstimatPrice">
                <label for="name">拍卖专场：</label>
                <input type="text" class="form-control" name="artAuction.aaSpeciallyName">
                <label for="name">拍卖会简要说明：</label>
                <input type="text" class="form-control" name="artAuction.aaExplain">
                <label for="file">作品图片：</label>
                <input type="file" name="tp" id="product_photo">
                <input type="submit" class="btn btn-default" value="添加"/>
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