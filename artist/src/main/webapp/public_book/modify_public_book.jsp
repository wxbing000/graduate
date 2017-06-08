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
    <title>修改出版著作信息</title>
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

        .div_text_font span {
            width: 100%;
            float: left;
            height: 35px;
            line-height: 35px;
            padding-left: 10px;
        }

        .div_text:hover .div_text_title a {
            text-decoration: underline;
        }
    </style>


    <script type="text/javascript">
        function delBook(s, id) {
            $.post("delPublicBook", {
                iid: id
            }, function (data, status) {
                var obj = eval("(" + data + ")");
                var b = obj.delState;
                if (b == "1") {
                    //删除要删除的艺术家分类的父节点
                    s.parentNode.parentNode.remove();
                }
            });
        }

        function updateBook(id) {
            $("#bid").val(id);
            layer.open({
                type: 1,
                shade: 0,
                closeBtn: 2,
                area: ['500px', '500px'],
                content: $('#updateBook'),
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
        <li><a href="#">修改著作信息</a></li>
    </ol>
</div>

<div class="book">
    <dl class="dl">

        <s:iterator value="#request.publicBook" var="entity" status="st">

            <dt class="dt" id="eee">
            <div class="div_img" id="fff">
                <img src="<s:property value="#entity.bookPicturePath" />"/>
            </div>
            <div class="div_text" id="ccc">
                <div class="div_text_title">
                    <s:property value="#entity.bookName"/>
                </div>
                <div class="div_text_font" id="ddd">
                    <span><b>出版社：</b> <s:property value="#entity.bookPress"/></span>
                    <span><b>作者：</b> <s:property value="#entity.bookAuthor"/></span>
                    <span><b>所属类别:</b> <s:property value="#entity.bookCategory"/></span>
                    <span><b>开本:</b> <s:property value="#entity.bookSize"/></span>
                    <span><b>出版时间:</b> <s:property value="#entity.bookPublicatTime"/></span>
                    <span><b>印次:</b> <s:property value="#entity.bookImpression"/></span>
                    <span><b>ISBN:</b> <s:property value="#entity.bookIsbn"/></span>
                    <span><b>定价:</b> <s:property value="#entity.bookPricing"/></span>
                </div>
            </div>
            <div style="float: right;margin-right:40px" id="aaa">
                <input id="bbb" type="button" class="btn btn-default" value="编辑"
                       onclick="updateBook(<s:property value="#entity.bookId"/>);"/>
                <input type="button" class="btn btn-default" value="删除"
                       onclick="delBook(this,<s:property value="#entity.bookId"/>);"/>
            </div>
            </dt>

        </s:iterator>

    </dl>
</div>
<s:url id="url_pre" action="getPublicBook">
    <s:param name="pageNow" value="pageNow-1"></s:param>
</s:url>

<s:url id="url_next" action="getPublicBook">
    <s:param name="pageNow" value="pageNow+1"></s:param>
</s:url>

<s:url id="url_end" action="getPublicBook">
    <s:param name="pageNow" value="totalPage"></s:param>
</s:url>

<s:url id="url_start" action="getPublicBook">
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

<div id="updateBook" style="display:none;">
    <form action="updatePublicBook" method="post"
          enctype="multipart/form-data">
        <input type="hidden" name="iid" id="bid">
        书名：<input type="text" name="book_sm" id="sm" maxlength="60"/><br/>
        出版社：<input type="text" name="book_cbs" id="cbs" maxlength="60"/><br/>
        作者：<input type="text" name="book_zz" id="zz" maxlength="60"/><br/>
        编著：<input type="text" name="book_bz" id="bz" maxlength="60"/><br/>
        出版日期：<input type="text" name="book_date" id="rq" maxlength="30"/><br/>
        开本：<input type="text" name="book_kb" id="kb" maxlength="20"/><br/>
        印次：<input type="text" name="book_yc" id="yc" maxlength="30"/><br/>
        所属类别：<input type="text" name="book_lb" id="lb" maxlength="20"/><br/>
        定价：<input type="text" name="book_dj" id="dj" maxlength="10"/><br/>
        ISBN：<input type="text" name="book_isbn" id="isbn" maxlength="30"/><br/>
        内容提要：
        <script id="container1" name="book_zy" type="text/plain"></script>
        <script type="text/javascript">
            var editor = UE.getEditor('container1', {
                toolbars: [],
                autoHeightEnabled: true,
                autoFloatEnabled: true,
                initialFrameWidth: 500, //容器初始化宽度
                initialFrameHeight: 300, //初始化高度
                maximumWords: 800 //最长字符数
            });
        </script>
        目录：
        <script id="container2" name="book_mu" type="text/plain"></script>
        <script type="text/javascript">
            var editor = UE.getEditor('container2', {
                toolbars: [],
                autoHeightEnabled: true,
                autoFloatEnabled: true,
                initialFrameWidth: 500, //容器初始化宽度
                initialFrameHeight: 300, //初始化高度
                maximumWords: 1000 //最长字符数
            });
        </script>

        <input type="submit" value="提交">
    </form>
</div>


<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>
