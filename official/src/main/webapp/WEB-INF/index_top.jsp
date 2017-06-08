<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<div id="wrap_top">
		<img src="${request.topPictureUrl.atPath}" />
		<div class="wrap_zuozhe_demo"></div>
		<div class="wrap_zuozhe">
			<font style="font-size:24px; float:left; margin-right:10px;">${request.userName}</font>
			<font style="font-size:18px; float:left; line-height:36px;">官方网站</font><br />
		</div>
	</div>
	<div class="nav">
		<div class="nav_wrap">
			<ul>
				<li class="nav_wrap_add"><a id="index_css" href="index?userNum=${request.userNum}">首页</a></li>

				<li><a id="introuduce_css" href="introduce?userNum=${request.userNum}">艺术家介绍</a></li>

				<%-- <li><a href="works?userNum=${request.userNum}">作品</a></li> --%>

				<li><a id="exhibition_css" href="exhibition?userNum=${request.userNum}">展览</a></li>

				<li><a id="market_css" href="auction?userNum=${request.userNum}">拍卖行情</a></li>

				<li><a id="news_css" href="news?userNum=${request.userNum}">资讯</a></li>

				<li><a id="album_css" href="photo?userNum=${request.userNum}">相册</a></li>

				<li><a id="book_css" href="book?userNum=${request.userNum}">出版著作</a></li>

				<li><a id="board_css" href="leave?userNum=${request.userNum}">留言板</a></li>

				
				
			</ul>
		</div>
	</div>
	<script type="text/javascript">
	window.onload = function() {
	//var index = 0;
	var nav_wrap = document.getElementsByClassName('nav_wrap');
    var ul = nav_wrap[0].getElementsByTagName("ul");
    var lis = ul[0].getElementsByTagName("li");
    
    for (var i = 0,len=lis.length; i < len; i++) {
    	//lis[i].index = i;
        lis[i].onclick = function () {
            for (var j=0; j<len; j++) {
            	lis[j].className="";
            }
            this.className="nav_wrap_add";
        }
    }
	}
	</script>