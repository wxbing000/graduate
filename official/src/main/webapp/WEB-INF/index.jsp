<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>${request.userName}官方网站</title>
    <style type="text/css">
    </style>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" href="css/owl.carousel.css"/>
    <link type="text/css" rel="stylesheet" href="css/flexslider.css"/>
    <link type="text/css" rel="stylesheet" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/first.css"/>
    <link rel="stylesheet" type="text/css" href="css/iframe.css"/>

    <script language="javascript" type="text/javascript" src="js/ScrollPic.js"></script>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="js/owl.carousel.js"></script>
    <script type="text/javascript">
        $(function () {
            $('#owl-demo').owlCarousel({
                items: 1,
                navigation: true,
                navigationText: ["上一个", "下一个"],
                autoPlay: true,
                stopOnHover: true
            }).hover(function () {
                $('.owl-buttons').show();
            }, function () {
                $('.owl-buttons').hide();
            });
        });

    </script>
</head>
<body>

<!-- 顶部图片和导航 开始-->
<%@ include file="index_top.jsp" %>
<!-- 顶部图片和导航 结束 -->

<div class="main">

    <div class="main_l">
        <!-- 第一个轮播开始 -->
        <div id="owl-demo" class="owl-carousel">

            <s:iterator value="#request.lunbo" var="entity">

                <a class="item" href="javaScript:void(0);">
                    <img src="<s:property value='#entity.url'/>"/>
                    <span><s:property value="#entity.name"/></span>
                </a>

            </s:iterator>

        </div>
        <!-- 轮播第一个结束 -->

        <!-- 轮播第二个开始 -->
        <div style="border: 3px solid #000; width: 100%; float: left; margin: 10px auto"></div>
        <div class="callbacks_container">
            <strong>推荐作品</strong>
            <a href="photo?userNum=${request.userNum}" class="gd gi">更多</a>
        </div>
        <div class="di1">
            <div style="width:690px;height:220px; border: 0; background-color: #f5f5f5;">
                <iframe src="Pages/lunbo.jsp"
                        style="width:695px;height:250px; border: 0;"></iframe>
            </div>
        </div>
        <!-- 轮播第二个结束 -->


        <!-- 艺术家资讯开始 -->
        <div class="tj di2">
            <strong>艺术家资讯</strong><a class="gd di3" href="news?userNum=${request.userNum}">更多</a>
        </div>

        <s:iterator value="#request.news" var="news">
            <div class="di7">
                <br/>
                <a class="gd ai4" href="newsinfo?anId=<s:property value='#news.Id'/>"><strong>
                    <s:property value="#news.title"/></strong></a><br/>
                <br/>

                <p class="pi2"><s:property value="#news.Digest" escape="false"/>
                    <a href="newsinfo?anId=<s:property value='#news.Id'/>" class="ai3">详细</a>
                </p>
            </div>
        </s:iterator>
        <!-- 艺术家资讯结束  -->

        <!-- 展览开始 -->
        <div class="d11">
            <strong>相关展览</strong><a class="gd a10" href="exhibition?userNum=${request.userNum}">更多</a>
        </div>

        <div class="d12">
            <s:iterator value="#request.exhibitioninfo" var="exinfo">
                <div id="zl1" class="zl1">
                    <a href="exhibitioninfo?exhibitId=<s:property value="#exinfo.id"/>">
                        <img src="<s:property value="#exinfo.pictureUrl"/>"/>
                    </a>

                    <div class="zlx1">
                        <a href="exhibitioninfo?exhibitId=<s:property value='#exinfo.id'/>"
                           style="text-decoration:none;">
                            <span style="color:#000;">
                            展览:<s:property value="#exinfo.name"/>
                            </span>
                        </a><br/>
                            <%--<p>地点：<s:property value="#exinfo.place"/></p><br/>--%>
                            <%--<p>时间：<s:property value="#exinfo.time"/> </p>--%>
                    </div>

                </div>
            </s:iterator>
        </div>
        <!-- 展览结束 -->

        <!-- 著作开始 -->
        <div class="d20">
            <strong>出版著作</strong><a class="gd a10" href="book?userNum=${request.userNum}">更多</a>
        </div>

        <div class="d12">
            <s:iterator value="#request.bookList" var="entity">
                <div id="zl21" class="d22">
                    <a href="bookinfo?bookId=<s:property value='#entity.bookId'/>">
                        <div class="d23">
                            <img src="<s:property value='#entity.bookPicturePath'/>" class="m5"/>
                        </div>
                    </a>

                    <div class="zlx2">
                        <a href="bookinfo?bookId=<s:property value='#entity.bookId'/>"
                           style="text-decoration:none;">
                             <span style="color:#000;">
                                <s:property value="#entity.bookName"/>
                             </span>
                        </a>
                    </div>
                </div>


            </s:iterator>


        </div>
        <!-- 著作结束 -->

        <!-- 底部导航条开始 -->
        <%--<%@ include file="index_bottom.jsp" %>--%>
        <!-- 底部导航条结束 -->
    </div>


    <div class="main_r">
        <!-- 艺术家简介开始 -->
        <p class="p5">
            <strong class="fi2">艺术家简介</strong>
        </p>

        <div>
            <img class="d24" src="<s:property value="#request.userPicture"/>"/>
        </div>
        <div class="jj d25">
            <strong class="s4"><s:property value="#request.userName"/></strong>
            <hr/>
            <s:iterator value="#request.info" var="info">
                <font class="f4"><s:property value='#info.category'/>
                    <hr/>
                    <s:property value='#info.artistGradcollege'/>
                    <a href="introduce?userNum=${request.userNum}" class="a12">详细</a>
                    <hr/>
                    总访问人数：<s:property value="#info.artistTodayvis"/>
                    <hr/>
                    今日访问人数：<s:property value="#info.artistTodayvis"/>
                    <hr/>
                    <!-- JiaThis Button BEGIN -->
                    <div class="jiathis_style d26">
                        <span class="jiathis_txt s5">分享到：</span>
                        <a class="jiathis_button_qzone"></a>
                        <a class="jiathis_button_tsina"></a>
                        <a class="jiathis_button_tqq"></a>
                        <a class="jiathis_button_renren"></a>
                        <a class="jiathis_button_kaixin001"></a>
                        <a href="http://www.jiathis.com/share"
                           class="jiathis jiathis_txt jiathis_separator jtico jtico_jiathis"
                           target="_blank"></a>
                    </div>
                    <script type="text/javascript">
                        var jiathis_config = {
                            summary: "",
                            shortUrl: false,
                            hideMore: false
                        }
                    </script>
                    <script type="text/javascript"
                            src="http://v3.jiathis.com/code_mini/jia.js" charset="utf-8"></script>
                    <!-- JiaThis Button END -->
                </font>
            </s:iterator>
        </div>
        <!-- 艺术家年表 开始-->
        <p class="p5">
            <strong class="fi2">艺术家年表</strong><a href="introduce?userNum=${request.userNum}" class="a13">更多</a>
        </p>

        <div class="nb d27">

            <font class="f5">${request.chronology[0].acYear}</font><br/>
            ${request.chronology[0].acEvent}

            <hr/>

        </div>
        <!-- 艺术家年表 结束 -->

        <!-- 获奖记录 开始 -->

        <p class="p5">
            <strong class="fi2">获奖记录</strong><a href="introduce?userNum=${request.userNum}" class="a13">更多</a>
        </p>

        <div class="nb d27">

            <s:iterator value="#request.award" var="award">
                <font class="f5 "><s:property value="#award.aaYear"/></font><br/><s:property value="#award.aaEvent"
                                                                                             escape="false"/>
                <hr/>
            </s:iterator>
        </div>
        <!-- 获奖记录 结束 -->
        <!-- 艺术家风采 开始 -->

        <p class="p5">
            <strong class="fi2">艺术家风采</strong><a href="#" class="a13">更多</a>
        </p>

        <div class="nb d27">

            <!-- 代码部分begin -->
            <section id="section"> <!-- 图片播放功能 -->
                <div class="bannerPane">
                    <section class="slider">
                        <div class="flexslider">
                            <ul class="slides">
                                <li><a href="javascript:;"><img src="images/show-1.jpg"/></a></li>
                                <li><a href="javascript:;"><img src="images/show-2.jpg"/></a></li>
                                <li><a href="javascript:;"><img src="images/show-3.jpg"/></a></li>
                                <li><a href="javascript:;"><img src="images/show-4.jpg"/></a></li>
                            </ul>
                        </div>
                    </section>
                    <script type="text/javascript" src="js/jquery.min.js"></script>
                    <script type="text/javascript" src="js/jquery.mmenu.min.all.js"></script>
                    <script type="text/javascript" src="js/jquery.flexslider.js"></script>
                    <script type="text/javascript" src="js/o-script.js"></script>
                </div>
            </section>
            <!-- 代码部分end -->
        </div>
        <!-- 艺术家风采 结束 -->


    </div>

</div>
<%@ include file="index_bottom.jsp" %>


<script type="text/javascript">
    var scrollPic_02 = new ScrollPic();
    scrollPic_02.scrollContId = "ISL_Cont_1";
    scrollPic_02.arrLeftId = "turn_left";
    scrollPic_02.arrRightId = "turn_right";
    scrollPic_02.frameWidth = 580;
    scrollPic_02.pageWidth = 193;
    scrollPic_02.speed = 10;
    scrollPic_02.space = 10;
    scrollPic_02.autoPlay = true;
    scrollPic_02.autoPlayTime = 4;
    scrollPic_02.initialize();
</script>
</body>
</html>
