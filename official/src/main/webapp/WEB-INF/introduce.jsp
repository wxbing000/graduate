<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <title><s:property value="#request.userName"/>${request.userName}官方网站</title>
    <script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="css/about_style.css"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <script type="text/javascript" src="js/jquery.smint.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('.subMenu').smint({
                'scrollSpeed': 1000
            });
        });
    </script>
</head>
<body>
<!-- 顶部图片和导航 开始-->
<%@ include file="index_top.jsp" %>
<!-- 顶部图片和导航 结束 -->

<div class="dh">
    <div class="bt">
        <div class="bt2">
            <div class="ar_m1" id="ar_m1">
                <a href="index?userNum=${request.userNum}">${request.userName}首页</a>
            </div>
            <div class="ar_r1" id="ar_r1"></div>
            <div class="ljr">
                <div class="ar_l"></div>
                <div class="ar_m2">
                    <span class="font1">艺术家介绍</span>
                </div>
                <div class="ar_r2"></div>
            </div>
        </div>
    </div>
</div>
<div style="width:1200px;margin:0 auto;">
    <div style="width:100px;height:10px;float:left;"></div>

    <div class="main">

        <%--左侧列表--%>
        <div id="sub" class="subMenu" style="width:200px;float:left;position:relative;top:10px;">
            <ul>
                <li><a id="jianjie" class="dha" href="#"><font
                        class="dhfont">简介</font><img class="imgarr" src="img/ar.png"/></a></li>
                <li><a id="toyear" class="dha" href="#"><font
                        class="dhfont">年表</font><img class="imgarr" src="img/ar.png"/></a></li>
                <li><a id="toprize" class="dha" href="#"><font
                        class="dhfont">获奖</font><img class="imgarr" src="img/ar.png"/></a></li>
            </ul>
        </div>


        <div class="main_r">
            <div id="tabs1" class="tabs1">
                <div id="tabs1tab1" class="tab1button_active">中文</div>
            </div>
            <div class="tab1main">
                <div id="tab1main1" class="tab1main1">
                    <p style="margin:20px 20px;font-size:20px;font-weight:900;">${request.userName}</p>

                    <!--  -->
                    <img src="img/2014102015301658433.jpg"
                         style="width:250px;float:right;margin:20px 50px;"/>

                    <!--  -->
                    <p style="margin:20px 20px;font-size:15px;line-height:25px;">
                        ${request.introduce }
                    </p>

                </div>

            </div>
        </div>
        <div class="main_r2">
            <div id="year" class="title_class">
                <font class="title_font">年表</font>
            </div>
            <div id="tabs2" class="tabs1">
                <div id="tabs2tab1" class="tab1button_active">中文</div>
                <!-- <div id="tabs2tab2" class="tab1button">English</div> -->
            </div>
            <div class="tab1main">
                <div id="tab2main1" class="tab1main1">
                    <table class="table1" width="790px" border="1" cellpadding="10" cellspacing="0">
                        <s:iterator value="#request.chronology" var="entity">
                            <tr>
                                <td class="td_l"><s:property escape="false" value="#entity.acYear"/></td>
                                <td class="td_r"><s:property escape="false" value="#entity.acEvent"/></td>
                            </tr>

                        </s:iterator>

                    </table>
                </div>
                <!-- <div id="tab2main2" class="tab1main2">
                    <div style="width:50px;margin:50px auto;">No&nbsp;&nbsp;Data</div>
                </div> -->
            </div>


        </div>
        <!-- <div class="main_r3">
            <div id="art_style" class="title_class">
                <font class="title_font">艺术风格</font>
            </div>
        </div> -->
        <div class="main_r2">
            <div id="prize" class="title_class">
                <font class="title_font">获奖</font>
            </div>
            <div id="tabs3" class="tabs1">
                <div id="tabs3tab1" class="tab1button_active">中文</div>
                <!-- <div id="tabs3tab2" class="tab1button">English</div> -->
            </div>

            <div class="tab3main">
                <div id="tab3main1" class="tab1main1">
                    <table class="table1" width="790px" border="1" cellpadding="10"
                           cellspacing="0">
                        <s:iterator value="#request.award" var="entity">
                            <tr>
                                <td class="td_l"><s:property escape="false" value="#entity.aaYear"/></td>
                                <td class="td_r"><s:property escape="false" value="#entity.aaEvent"/></td>
                            </tr>
                        </s:iterator>
                    </table>
                </div>
            </div>

        </div>
    </div>

    <div class="introduce_nav2">
        <ul>
            <li><a href="#">关于我们</a></li>
            <li><a href="#">网站地图</a></li>
            <li><a href="#">版权说明</a></li>
            <li><a href="#">人才招聘</a></li>
            <li><a href="#">免责声明</a></li>
            <li><a href="#">版权说明</a></li>
            <li><a href="#">隐私权保护</a></li>
            <li><a href="#">友情链接</a></li>
            <li><a href="#">法律顾问</a></li>
        </ul>
    </div>
</div>


<script>

    $('#tab1main2').hide();
    $('#tabs1').find('div').click(function () {
        $('#tabs1').find('.tab1button_active').attr('class', 'tab1button');
        $(this).attr('class', 'tab1button_active');
    });
    $('#tabs1tab1').click(function () {
        $('#tab1main2').hide();
        $('#tab1main1').show();
    });
    $('#tabs1tab2').click(function () {
        $('#tab1main1').hide();
        $('#tab1main2').show();
    });
    <!--tab2-->
    $('#tab2main2').hide();
    $('#tabs2').find('div').click(function () {
        $('#tabs2').find('.tab1button_active').attr('class', 'tab1button');
        $(this).attr('class', 'tab1button_active');
    });
    $('#tabs2tab1').click(function () {
        $('#tab2main2').hide();
        $('#tab2main1').show();
    });
    $('#tabs2tab2').click(function () {
        $('#tab2main1').hide();
        $('#tab2main2').show();
    });

    $('#para2').hide();
    $('#hidebutton1').click(function () {
        if ($('#para2').is(':hidden')) {
            $('#para2').slideDown(200);
            $('#hidebutton1').text("<<收起");
        } else {
            $('#para2').slideUp(200);
            $('#hidebutton1').text("展开>>");
        }
    });
    <!--tab3-->
    $('#tab3main2').hide();
    $('#tabs3').find('div').click(function () {
        $('#tabs3').find('.tab1button_active').attr('class', 'tab1button');
        $(this).attr('class', 'tab1button_active');
    });
    $('#tabs3tab1').click(function () {
        $('#tab3main2').hide();
        $('#tab3main1').show();
    });
    $('#tabs3tab2').click(function () {
        $('#tab3main1').hide();
        $('#tab3main2').show();
    });
    <!--导航及跳转-->
    $('#sub').find('a').click(function () {
        $(".imgarr").css("display", "none");
        $(".dha_ac").attr('class', 'dha');
        $(this).children(".imgarr").css("display", "block");
        $(this).attr('class', 'dha_ac')
    });
    $('#jianjie').click(function () {
        $("html,body").animate({
            scrollTop: $("#tabs1").offset().top
        }, 500);
    });
    $('#toyear').click(function () {
        $("html,body").animate({
            scrollTop: $("#year").offset().top
        }, 500);
    });
    $('#toart_style').click(function () {
        $("html,body").animate({
            scrollTop: $("#art_style").offset().top
        }, 500);
    });
    $('#toprize').click(function () {
        $("html,body").animate({
            scrollTop: $("#prize").offset().top
        }, 500);
    });

    $('#totop').hide();
    if ($(window).scrollTop() != 0) {
        $('#totop').show(500);
    }

    $(window).scroll(function () {
        if ($(window).scrollTop() != 0) {
            $('#totop').show(500);
        } else {
            $('#totop').slideUp(500);
        }
        var scro = 500 + $(window).scrollTop();
        $('#totop').css('top', scro);
    });
    $('#totop').click(function () {
        $("html,body").animate({
            scrollTop: $("#top").offset().top - 10
        }, 500);
    });
</script>
</body>
</html>

