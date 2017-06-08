<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>登录艺术家官网</title>
    <link type="text/css" href="css/login.css" rel="stylesheet">
</head>

<body>
<div class="login">
    <h1>艺术家网站后台</h1>

    <form action="loginValidate" method="post">
        <input type="text" name="userName" placeholder="账号" required/>
        <input type="password" name="pass" placeholder="密码" required/>
        <button type="submit">
            <span>登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</span>
        </button>
    </form>
</div>
</body>
</html>
