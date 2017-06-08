<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>上传相册图片</title>
    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css"/>
    <link rel="stylesheet" href="js/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>

</head>

<body>
<%@include file="../top.jsp" %>
<%@include file="../left.jsp" %>

<div class="container" style="margin-top: 10%">
    <div class="col-md-6 col-md-offset-3">


        <s:property value="#request.message"/>
        <form action="uploadAlbumPhoto" method="post" class="form" enctype="multipart/form-data">
            <div class="form-group">

                <label for="fl">相册分类:</label>
                <select id="fl" name="categoryId">
                    <s:iterator value="#request.category" var="entity">
                        <option value="<s:property value="#entity[0]" />">
                            <s:property value="#entity[1]"/>
                        </option>
                    </s:iterator>
                </select>
                </br>
                <label for="year">相片拍摄的年代 </label>
                <input type="text" name="year" class="form-control" id="year"/>
                <label for="name">相片的名称 </label>
                <input type="text" name="name" class="form-control" id="name"/>
                <label for="photo">图片文件</label>
                <input type="file" name="photo" id="photo"/>
                <label for="explain"> 相片说明</label>
                <input type="text" name="explain" class="form-control" id="explain"/>

                <div class="row" style="margin-top: 10px;">
                    <div class="col-md-4 col-lg-4 col-md-offset-4 col-lg-offset-4">
                        <button type="submit" class="btn btn-default">提交</button>
                    </div>
                </div>
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
