修改之后：


<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

<title>相册分类管理</title>
<link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css" />
<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/menu.js"></script>

<script type="text/javascript">
     var e_tr = null;
     var cl = "";
     function doExec(e, delId){ //根据id删除数据库中的相册分类信息
          $.post("delCategory", {
               id : delId
          }, function(data, status) {
               var obj = eval ("(" + data + ")");
               var b = obj.delState;
               if( b== "1" ){
                    //删除要删除的艺术家分类的父节点
                    e.parentNode.parentNode.remove();
               }
          });
     }
     function doEdit(s, id, tr_id){
          cancelEdit(); 
          var tr = s.parentNode.parentNode; 
          e_tr = tr;
          var td = tr.childNodes[1];
          trid = tr_id;
          text = td.innerHTML; //原值
          td.innerHTML = '<form action="updateCategory" method="post" id="jsform">'
               +' <input type="text" name="category" id="present" value="' + text + '" maxlength=30/>'
               +' <input type="hidden" name="id" value="'+ id +'" /> '
               +' <input type="submit" value="保存"/>'
               +' <input type="button" value="取消" onclick="javascript:cancelEdit();return false;" /></form>';
     }
     function cancelEdit() {
          /* if (e_tr) {
          var op = document.getElementById("present"); //输入框中的值。即修改后的值
          var text = op.value;
          alert(text);
          op.parentNode.parentNode.innerHTML = text;
          e_tr = null;
         }  */
         if (e_tr) {
              var form = document.getElementById("jsform");
              form.parentNode.removeChild(form);
              document.getElementById(trid).innerHTML = text;
              e_tr = null;
            }
       //html中哪个
     }
     
</script>

<style type="text/css">
table tr {
	text-align: center;
}

table tr td {
	width: 200px;
	height: 30px;
}
</style>
</head>

<body>
	<%@include file="../top.jsp"%>
	<%@include file="../left.jsp"%>


	<div id="first" style="margin-top: 7%;margin-left: 20px">
		<s:property value="#request.message" />
		<table border="1px" align="center" id="tab">
			<tr>
				<td>类别</td>
				<td>图片数量</td>
				<td>操作</td>
			</tr>

			<!-- 使用DOM解析时表格中的一行中的代码必须在同一行！！！！  -->
			<s:iterator value="#request.categoryList" var="entity" status="st">
				<tr>
					<td id="TR<s:property value="#st.index"/>"><s:property
							value="#entity[1]" /></td>
					<td><s:property value="#entity[2]" /></td>
					<td><input type="button" value="编辑"
						onclick="javascript:doEdit(this, <s:property value="#entity[0]" />,'TR<s:property value="#st.index"/>');return false;" />
						<input type="button" value="删除"
						onclick="javascript:doExec(this, <s:property value="#entity[0]" />);return false;" />
					</td>
				</tr>
			</s:iterator>
		</table>

		<br />

		<form action="albumCategoryMange" method="post">
			<div style="text-align:center;">
				<input type="text" name="category" placeholder="输入您的分类名称" size="60"
					maxlength="30" height="25"/> <input type="submit" value="添加分类" />
			</div>
		</form>
	</div>

	<%@include file="../bottom.jsp"%>
	<script>
          navList(12);
     </script>
</body>
</html>
