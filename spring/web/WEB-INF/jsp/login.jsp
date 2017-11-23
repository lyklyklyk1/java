<%--
  Created by IntelliJ IDEA.
  User: Sarkuler
  Date: 2017/11/23
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="login.html" method="post">
        <p>
            用户名:<input type="text" name="uname" id="">
        </p>
        <p>
            密码:<input type="password" name="upasswd">
        </p>
        <p>
            <input type="submit">
        </p>
    </form>
    <font color="red">
        ${error }
    </font>
</body>
</html>
