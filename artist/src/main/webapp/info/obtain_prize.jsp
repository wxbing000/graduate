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

    <title>艺术家获奖管理</title>
    <link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css"/>
    <link rel="stylesheet" href="js/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/menu.js"></script>

    <!-- 加载ueditorjs开始 -->
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.all.min.js">

    </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/lang/zh-cn/zh-cn.js"></script>
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
            var a = UE.getEditor('container').getContentTxt();
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
        <li><a href="#">获奖经历管理</a></li>
    </ol>
</div>

<div id="first">
    <p id="add" align="right">添加获奖经历</p>
    <script>
        $(document).ready(function () {
            $("#add").click(function () {
                $("#third").show();
                $("#first").hide();
                $("#second").hide();
            });
        });
    </script>


    <table class="table table-bordered table-striped table-hover">
        <thead>
        <tr>
            <th>年份</th>
            <th colspan="3">获奖经历</th>
        </tr>
        </thead>

        <s:iterator value="#request.award" var="entity" status="st">
            <form action="deleteWinningExperience" method="post">
                <input id="id<s:property value="#st.count" />" type="hidden"
                       name="zhu" value="<s:property value="%{#entity[0]}" />"/>
                <tr>
                    <td style="width: 50px" id="year<s:property value="#st.count" />"><s:property
                            value="#entity[1]"/></td>
                    <td style="width: 750px"><s:property value="#entity[2]" escape="false"/></td>
                    <td style="width: 70px" id="change<s:property value="#st.count" />"><p>修改</p></td>
                    <td style="width: 70px"><input type="submit" value="删除"/></td>
                </tr>
            </form>
            <script>
                $(document)
                        .ready(
                        function () {
                            $(
                                    "#change<s:property value="#st.count" />")
                                    .click(
                                    function () {
                                        $("#first").hide();
                                        $("#third").hide();
                                        $("#second").show();

                                        var a = $(
                                                "#change<s:property value="#st.count" />")
                                                .prev()
                                                .html(); //获取获奖信息
                                        var b = $(
                                                "#year<s:property value="#st.count" />")
                                                .text(); //获取年代信息

                                        $("#niandai")
                                                .val(b); //设置年代信息
                                        UE
                                                .getEditor(
                                                'container')
                                                .execCommand(
                                                'insertHtml',
                                                a) //设置获奖信息
                                        $("#zhujian")
                                                .val(
                                                $(
                                                        "#id<s:property value="#st.count" />")
                                                        .val()); //设置主键
                                    })
                        });
            </script>
        </s:iterator>
    </table>

    <s:url id="url_pre" value="WinningExperience">
        <s:param name="pageNow" value="pageNow-1"></s:param>
    </s:url>

    <s:url id="url_next" value="WinningExperience">
        <s:param name="pageNow" value="pageNow+1"></s:param>
    </s:url>

    <s:url id="url_end" value="WinningExperience">
        <s:param name="pageNow" value="totalPage"></s:param>
    </s:url>

    <s:url id="url_start" value="WinningExperience">
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
    <form action="updateWinningExperience" method="post"
          onsubmit="return validate2();">
        <input type="hidden" id="zhujian" name="zhu"/> 年代：<input type="text"
                                                                 id="niandai" name="years"/>

        <p> 获奖经历：</p>
        <script id="container" name="experience" type="text/plain"></script>
        <script type="text/javascript">
            var editor = UE.getEditor('container');
        </script>
        <div class="col-md-3 col-md-offset-2">
            <input type="submit" class="btn btn-default" value="提交">
        </div>
    </form>
    <div class="col-md-3 col-md-offset-2">
        <p id="fanhui" class="btn btn-default">返回</p>
    </div>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#fanhui").click(function () {
                $("#first").show();
                $("#third").hide();
                $("#second").hide();

                //每次点击返回时清空所输入的内容
                UE.getEditor('container').setContent("");
            });
        });
    </script>
</div>

<div id="third">

    <form action="saveWinningExperience" method="post"
          onsubmit="return validate3();">
        年份：<input type="text" name="years"/>

        <p>获奖信息：</p>
        <script id="container3" name="experience" type="text/plain"></script>
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
