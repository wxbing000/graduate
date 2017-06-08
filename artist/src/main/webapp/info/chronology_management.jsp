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

    <title>艺术家年表管理</title>

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
            $("#third").hide();
        });
    </script>
    <script type="text/javascript">
        function validate3() {
            var a = UE.getEditor('container3').getContentTxt();
            if (a.length >= 300) {
                alert("您插入的数据过长！");
                return false;
            }
        }
        function validate2() {
            var a = UE.getEditor('container2').getContentTxt();
            if (a.length >= 300) {
                alert("您插入的数据过长！");
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
        <li><a href="#">个人年表管理</a></li>
    </ol>
</div>

<div id="frist">

    <s:property value="#request.message"/>

    <table class="table table-bordered table-striped table-hover"
           id="myTable">
        <thead>
        <tr>
            <th>年份</th>
            <th colspan="3">年表信息</th>
        </tr>
        </thead>

        <!-- 如果取到的数据为空则直接显示输入框 -->
        <s:if test="#request.chronologyList == null">

            <form action="" method="post">
                年代<input type=""/> 年表信息
                <script id="container1" name="info" type="text/plain"></script>
                <script type="text/javascript">
                    var editor = UE.getEditor('container1');
                </script>
                <input type="submit" value="提交"/>
            </form>

        </s:if>
        <!-- 如果取到的数据不为空则显示数据 -->
        <s:elseif test="#request.chronologyList != null">
        <p id="add" align="right">添加年表信息</p>
        <!-- 迭代显示查询结果 -->
        <s:iterator value="#request.chronologyList" var="entity" status="st">
        <tr>
            <td id="year1<s:property value="#st.count" />" style="width: 50px"><s:property
                    value="#entity[1]"/></td>
            <td id="xinxi1<s:property value="#st.count" />" style="width: 750px"><s:property
                    value="#entity[2]" escape="false"/></td>
                <%-- <td><p id="change<s:property value="#st.count" />">修改</p></td> --%>
            <td id="change<s:property value="#st.count" />" style="width: 70px"><p>修改</p></td>

            <form action="delChronology" method="post">
                <input type="hidden" name="artistId"
                       id="id<s:property value="#st.count" />"
                       value="<s:property value="#entity[0]" />">
                <td style="width: 70px"><input type="submit" value="删除"></td>
            </form>
            <script type="text/javascript">
                $(document)
                        .ready(
                        function () {
                            $(
                                    "#change<s:property value="#st.count" />")
                                    .click(
                                    function () {
                                        $("#frist")
                                                .hide();
                                        $("#second")
                                                .show();

                                        var a = $(
                                                "#year1<s:property value="#st.count" />")
                                                .text();//取到年代信息
                                        var b = $(
                                                "#xinxi1<s:property value="#st.count" />")
                                                .html();//取到年表信息
                                        var c = $(
                                                "#id<s:property value="#st.count" />")
                                                .val();//取到id信息

                                        $(
                                                "#niandai2")
                                                .val(
                                                a); //设置修改页面的年代信息
                                        UE
                                                .getEditor(
                                                'container2')
                                                .execCommand(
                                                'insertHtml',
                                                b);//设置年表信息
                                        $(
                                                "#zhujian2")
                                                .val(
                                                c);//设置主键信息

                                    });
                            $("#add").click(function () {
                                $("#frist").hide();
                                $("#second").hide();
                                $("#third").show();
                            });
                        });
            </script>
            </s:iterator>
            </s:elseif>

    </table>

    <s:url id="url_pre" value="getChronology">
        <s:param name="pageNow" value="pageNow-1"></s:param>
    </s:url>

    <s:url id="url_next" value="getChronology">
        <s:param name="pageNow" value="pageNow+1"></s:param>
    </s:url>

    <s:url id="url_end" value="getChronology">
        <s:param name="pageNow" value="totalPage"></s:param>
    </s:url>

    <s:url id="url_start" value="getChronology">
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
</div>

<div id="second">
    <form action="updateChronology" method="post"
          onsubmit="return validate2();">
        <input type="hidden" id="zhujian2" name="artistId"/> 年代：<input
            type="text" name="year" id="niandai2"/>

        <p>年表信息：</p>
        <script id="container2" name="info" type="text/plain"></script>
        <script type="text/javascript">
            var editor = UE.getEditor('container2', {
                initialFrameHeight: 200
            });
        </script>
        <div class="col-md-3 col-md-offset-2">
            <input type="submit" class="btn btn-default" value="提交"/>
        </div>
    </form>
    <div class="col-md-3 col-md-offset-2">
        <input type="button" class="btn btn-default" value="返回" id="fanhui"/>
    </div>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#fanhui").click(function () {
                $("#second").hide();
                $("#third").hide();
                $("#frist").show();

                //每次点击返回时清空所输入的内容
                UE.getEditor('container2').setContent("");
            });
        });
    </script>

</div>

<div id="third">

    <form action="saveChronology" method="post"
          onsubmit="return validate3();">
        年份：<input type="text" name="year"/> 年表信息：
        <script id="container3" name="info" type="text/plain"></script>
        <script type="text/javascript">
            var editor = UE.getEditor('container3');
        </script>
        <div class="col-md-3 col-md-offset-2">
            <input type="submit" class="btn btn-default" value="提交"/>
        </div>
    </form>
    <div class="col-md-3 col-md-offset-2">
        <input type="button" class="btn btn-default" value="返回" id="fanhui3"/>
    </div>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#fanhui3").click(function () {
                $("#second").hide();
                $("#third").hide();
                $("#frist").show();
            });
        });
    </script>

</div>


<%@include file="../bottom.jsp" %>
<script>
    navList(12);
</script>
</body>
</html>
