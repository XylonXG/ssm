<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/16
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户登录</title>
  </head>
  <body>
  <center>
    <form action="userLogin.action" method="post">
      用户名:<input type="text" name="name">
      <br><br>
      密 码:<input type="password" name="password">
      <br><br>
      <input type="submit" value="登录">
      <input type="reset" value="重置">
    </form>
  </center>
  </body>
</html>
