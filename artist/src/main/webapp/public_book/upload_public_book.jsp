<%@ page language="java" pageEncoding="UTF-8" %>
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
    <title>上传出版著作信息</title>
    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css"/>
    <link rel="stylesheet" href="js/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>

    <!-- 加载ueditorjs开始 -->
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.all.min.js"></script>
    <!-- 加载ueditorjs结束 -->

    <script type="text/javascript">
        function validateImage() {
            if ($("#book_photo").val() == "") {
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
        <div class="container-fluid">
            <ol class="breadcrumb">
                <li>您的当前位置</li>
                <li><a href="#">发表著作信息</a></li>
            </ol>
        </div>
    </ol>
</div>

<div class="container col-md-6 col-md-offset-3">
    <%--<div class="col-md-6 col-md-offset-3">--%>
    <s:property value="message"/>
    <form name="form1" action="uploadPublicBook" method="post" enctype="multipart/form-data" class="form"
          onsubmit="return validateImage();">

        <div class="form-group" style="margin-bottom: 15px;">
            <label for="name">书名：</label>
            <input type="text" class="form-control" name="book_sm" placeholder="请填写书名">
            <label for="compile">编著：</label>
            <input type="text" class="form-control" name="book_bz" placeholder="编著">
            <label for="author">作者：</label>
            <input type="text" class="form-control" name="book_zz" placeholder="作者">
        </div>
        <div class="form-group" style="margin-bottom: 15px;">
            <label for="price">定价：</label>
            <input type="text" class="form-control" name="book_dj" placeholder="定价"> <label
                for="version">开本：</label>
            <input type="text" class="form-control" name="book_kb" placeholder="开本"> <label
                for="edition">印次：</label>
            <input type="text" class="form-control" name="book_yc" placeholder="印次">
        </div>
        <div class="form-group" style="margin-bottom: 15px;">
            <label for="captial">出版社:</label>
            <input type="text" placeholder="出版社" name="book_cbs" class="form-control">
            <label for="time"> 出版日期:</label>
            <input type="date" placeholder="出版日期" name="book_date" class="form-control">
            <label for="sbn">ISBN:</label>
            <input type="text" name="book_isbn" class="form-control" placeholder="ISBN">
            <label for="cate">所属类别：</label>
            <input type="text" name="book_lb" class="form-control" placeholder="所属类别">
            <label for="file">书籍图片：</label>
            <input type="file" name="book_tp" id="book_photo">
        </div>


        <%--<div style="margin-top:60%;margin-left: 20px">--%>
        <div class="form-group" style="margin-bottom: 15px;">
            <label for="container1">内容提要：</label>

            <script id="container1" name="book_zy" type="text/plain"></script>
            <script type="text/javascript">
                var editor1 = UE.getEditor('container1');
            </script>

            <label for="container2">目录：</label>
            <script id="container2" name="book_mu" type="text/plain"></script>
            <script type="text/javascript">
                var editor2 = UE.getEditor('container2');
            </script>
        </div>

        <%--</div>--%>

        <div class="form-group" style="margin-bottom: 15px;">
            <div class="row">
                <div class="col-md-2 col-lg-2 col-md-offset-5 col-lg-offset-5">
                    <button type="submit" class="btn btn-default">提交</button>
                </div>
            </div>
        </div>
    </form>

</div>

<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>

