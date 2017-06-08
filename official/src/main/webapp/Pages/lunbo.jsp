<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html html>
<head>
    <title>JS实现的图片横向滚动展示</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312">
    <style type="text/css">
        .Mayi_index_anli {
            width: 100%;
            height: 303px;
            background-repeat: repeat-x;
            padding-top: 10px;
            text-align: center;
            float: left;
        }

        .Anli_01 {
            width: 660px;
            height: 303px;
        }

        .Anli_01_02 {
            width: 660px;
            height: 303px;
            float: left;
        }

        .Anli_01_02_01 {
            height: 36px;
            background-position: 0px 1px;
            background-repeat: no-repeat;
            text-align: left;
            float: left;
        }

        .Anli_01_02_01_01 {
            height: 36px;
            line-height: 36px;
            width: 600px;
            text-align: left;
            padding-left: 10px;
            font-size: 14px;
            color: #c40000;
            float: left;
        }

        .Anli_01_02_01_02 {
            height: 36px;
            line-height: 36px;
            width: 321px;
            text-align: left;
            font-size: 14px;
            color: #c40000;
            float: left;
            padding-right: 10px;
        }

        .Anli_01_02_01_02 a {
            line-height: 36px;
            text-align: left;
            font-size: 12px;
            color: #c40000;
            float: right;
            text-align: right;
        }

        .Anli_left {
            height: 210px;
            width: 20px;
            margin-top: 0px;
            padding-left: 10px;
            float: left;
            background-image: url(../images/le.png);
            background-repeat: no-repeat;
            background-position: center;
            cursor: pointer;
        }

        .Anli_pic {
            height: 180px;
            width: 580px;
            margin-top: 20px;
            float: left;
            padding-left: 5px;
        }

        .Anli_right {
            height: 210px;
            width: 20px;
            margin-left: 5px;
            margin-top: 0px;
            float: left;
            background-image: url(../images/ri.png);
            background-position: center;
            background-repeat: no-repeat;
            cursor: pointer;
        }

        a.green:visited, a.green:link {
            color: #c40000;
        }

        a.green:hover {
            color: #c40000;
        }

        a.green:active {
            color: #c40000;
        }

        .box {
            width: 183px;
            height: 170px;
            float: left;
            margin: 0px 5px;
            padding-top: 5px;
            font-size: 12px;
        }

        .box a.imgBorder:link, .box a.imgBorder:visited {
            border: #CCCCCC solid 1px;
            width: 177px;
            height: 137px;
            padding: 2px;
            display: block;
        }

        .box a.imgBorder:hover {
            border: #c40000 solid 1px;
            padding: 2px;
            width: 177px;
            height: 137px;
            display: block;
        }

        .anli_box_title {
            text-decoration: none;
            width: 128px;
            height: 30px;
            font-size: 12px;
            line-height: 30px;
            padding-left: 15px;
            color: #000;
        }

        .anli_box_title:hover {
            color: #c40000;
            text-decoration: underline;
        }
    </style>
    <script language="javascript" type="text/javascript" src="../js/ScrollPic.js"></script>
</head>
<body>
<!--把下面代码加到<body>与</body>之间-->
<div class="Anli_left" id="turn_left"></div>
<div class="Anli_pic">
    <div class="blk_29">
        <div id="ISL_Cont_1">


			<%--<s:iterator value="#request.recommend" var="entity">--%>
					<%----%>
				 <%--<div class="box">--%>
	           		<%--<a class="imgBorder" href="<s:property value='#entity.goodNum' />" >--%>
	           		<%--<img src="<s:property value='#entity.url'/>" height="137" border="0" /></a>--%>
	           		<%--<a href="#" class="anli_box_title" style="margin-left:40px;"><s:property value="#entity.name"/></a>--%>
	       		 <%--</div>--%>
						<%----%>
			<%--</s:iterator>        --%>


                <div class="box">
                    <a class="imgBorder" href="#"><img src="../images/m01.jpg" width="177" height="137" border="0"></a>
                    <a href="#" class="anli_box_title" style="margin-left:40px;">大岳排空</a>
                </div>
                <div class="box">
                    <a class="imgBorder" href="#"><img src="../images/m02.jpg" width="177" height="137" border="0"></a>
                    <a href="#" class="anli_box_title" style="margin-left:40px;">大道之行</a>
                </div>
                <div class="box">
                    <a class="imgBorder" href="#"><img src="../images/m03.jpg" width="177" height="137" border="0"></a>
                    <a href="#" class="anli_box_title" style="margin-left:40px;">大道庄严</a>
                </div>
                <div class="box">
                    <a class="imgBorder" href="#"><img src="../images/m04.jpg" width="177" height="137" border="0"
                                                       alt="品类营销机构"></a>
                    <a href="#" class="anli_box_title" style="margin-left:60px;">书法</a>
                </div>

            
            <!-- <div class="box">
                <a class="imgBorder" href="#"><img src="../images/m02.jpg" width="177" height="137" border="0"></a>
                <a href="#" class="anli_box_title" style="margin-left:40px;">大道之行</a>
            
         -->
            </div>
    </div>
</div>
<div class="Anli_right" id="turn_right"></div>
<script language=javascript type="text/javascript">
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
