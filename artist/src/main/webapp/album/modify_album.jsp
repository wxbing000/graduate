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

    <title>相册图片管理</title>
    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css"/>
    <link rel="stylesheet" href="js/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/layer/layer.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>

    <script type="text/javascript">
        //通过拍摄时间查询所有的相册信息
        function timeQuery(e) {
            //alert(e.value);
            if (e.value == "") {
                return false;
            }
            $.post("getPhotoByTime", {
                queryTime: e.value
            }, function (data, status) {
                var photo = data.photoList; //取到经处理返回的数据
                $("#show").html("");//清空div中的内容
                $("#show").html(setContent(photo));//向div中设置内容
            }, "json");
        }

        //通过相册分类查询所有的相册信息
        function categoryQuery(e) {
            //alert(e.value);
            if (e.value == "") {
                return false;
            }
            $.post("getPhotoByCategory", {
                queryCategory: e.value
            }, function (data, status) {
                var photo = data.photoList; //取到经处理返回的数据
                $("#show").html("");//清空div中的内容
                $("#show").html(setContent(photo));//向div中设置内容
            }, "json");
        }

        //通过拍摄时间查询所有的相册信息
        function titleQuery() {
            var name = $("#name").val();
            if (name == "") {
                alert("请输入要查询的照片的名称");
                return false;
            }
            $.post("getPhotoByTitle", {
                queryTitle: name
            }, function (data, status) {
                var photo = data.photoList; //取到经处理返回的数据
                $("#show").html("");//清空div中的内容
                $("#show").html(setContent(photo));//向div中设置内容
            }, "json");
        }

        //创建div中的内容 字符串方法
        function setContent(photo) {
            var content = "<table border='1'><tr><td>照片标题</td><td>照片</td><td>照片拍摄时间</td><td>照片说明</td><td>操作</td></tr>";
            for (var index = 0; index < photo.length; index++) {
                content += "<tr><td>"
                + photo[index].aaName
                + "</td>"
                + "<td><img src='" + photo[index].aaPath + "' height='230' width='230' /></td>"
                + "<td>"
                + photo[index].aaYear
                + "</td><td>"
                + photo[index].aaExplain
                + "</td>"
                + "<td><input type='button'id='"
                + photo[index].aaId
                + "' value='编辑' onclick='javascript:editPhoto(this);' />|<input type='button' value='删除' id='"
                + photo[index].aaId
                + "' onclick='javascript:delInfo(this); return false;' /></td></tr>";
            }
            content += "</table>";
            return content;
        }
    </script>

    <script type="text/javascript">
        //编辑艺术家相册中相片信息
        function editPhoto(s) {
            layer.open({
                type: 1,
                shade: 0,
                closeBtn: 2,
                content: $('#update'),
                skin: 'layui-layer-rim'
            });
            var tr = s.parentNode.parentNode;
            var title = tr.childNodes[0].innerHTML;//要编辑的照片的标题
            var photo = tr.childNodes[1].innerHTML;//要编辑的照片的图片
            var time = tr.childNodes[2].innerHTML; //要编辑的照片的时间
            var explain = tr.childNodes[3].innerHTML;//要编辑的照片的说明
            $("#pop_id").val(s.getAttribute("id"));//设置照片的所属的id
            $("#pop_year").val(time);//设置时间
            $("#pop_title").val(title);//设置标题
            $("#pop_explain").val(explain);//设置照片说明
        }

        //删除艺术家相册中相片信息
        function delInfo(e) {
            $.post("delPhotoInfo", {
                delInfoId: e.id
            }, function (data, status) {
                var obj = eval("(" + data + ")");
                var b = obj.delState;
                if (b == "1") {
                    //删除要删除的艺术家分类的父节点
                    e.parentNode.parentNode.remove();
                }
            });
        }

        //提交艺术家更新之后的相册图片信息
        function updateEdit() {
            //alert($("#pop_id").val() + $("#pop_category").val() + $("#pop_year").val() +
            //			$("#pop_title").val() + $("#pop_photo").val() + $("#pop_photo").val());
            alert($("#pop_form").serialize());
            $.post("updateAlbumInfo", {
                //		$("#pop_form").serialize()
            }, function (data, status) {
                //var obj = eval ("(" + data + ")");
                //var b = obj.delState;
                //	if( b== "1" ){
                //删除要删除的艺术家分类的父节点
                //		e.parentNode.parentNode.remove();
                //	}
            });
        }
    </script>

</head>

<body>
<%@include file="../top.jsp" %>
<%@include file="../left.jsp" %>

<div class="container" style="margin-top: 10%">
    <div class="col-md-6 col-md-offset-3">
        <form class="form">
            <div class="form-group" style="margin-bottom: 15px;">
                <label for="queryTime">拍摄时间 :</label>
                <select name="queryTime" onchange="javascript:timeQuery(this); return false;" id="queryTime">
                    <option value=""></option>
                    <s:iterator value="#request.years" var="entity">
                        <option value="<s:property value="#entity"/>">
                            <s:property value="#entity"/>
                        </option>
                    </s:iterator>
                </select>
                <br/>
                <label for="selectCategory">相册分类:</label>
                <select name="queryCategory" onchange="javascript:categoryQuery(this); return false;"
                        id="selectCategory">
                    <option value=""></option>
                    <s:iterator value="#request.category" var="entity">
                        <option value="<s:property value="#entity[0]"/>">
                            <s:property value="#entity[1]"/>
                        </option>
                    </s:iterator>
                </select>
                <br/>
                <label for="photoName">照片名称:</label>
                <input type="text" name="photoName" id="photoName" class="form-control"/>

                <div class="row" style="margin-top: 10px;">
                    <div class="col-md-4 col-lg-4 col-md-offset-4 col-lg-offset-4">
                        <input type="button" class="btn btn-default" onclick="javascript:titleQuery(); return false;"
                               value="提交"/>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>

<div id="show"></div>

<div id="update" style="display:none;">
    <form action="updateAlbumInfo" id="pop_form" method="post"
          enctype="multipart/form-data">
        <input type="hidden" name="albumId" id="pop_id" value=""/> 相片分类 <select
            name="categoryId" id="pop_category">
        <option value=""></option>
        <s:iterator value="#request.category" var="entity">
            <option value="<s:property value="#entity[0]"/>"><s:property
                    value="#entity[1]"/></option>
        </s:iterator>
    </select><br/> 相片拍摄的年代 <input type="text" name="year" id="pop_year"/><br/>
        相片的名称 <input type="text" name="name" id="pop_title"/><br/> 图片文件 <input
            type="file" name="photo" id="pop_photo"/><br/> 相片说明<input
            type="text" maxlength="100" name="explain" id="pop_explain"/><br/>
        <input type="submit" value="提交"/>
    </form>
</div>

<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>