<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/16
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
</head>
<body>
<center>
    <form action="addGoods.action" method="post" enctype="multipart/form-data">
         商品名称:<input type="text" name="goodsName"><br><br>
         商品价格:<input type="text" name="goodsPrice"><br><br>
        出厂日期:<input type="date" name="goodsCreateTime"><br><br>
        商品图片:<input type="file" name="goodsPhoto"><br><br>
        <input type="submit" value="添加">
        <input type="reset" value="取消">
    </form>
</center>
</body>
</html>
