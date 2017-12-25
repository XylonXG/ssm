<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/17
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品详情</title>
</head>
<body>
<center>
    <strong>商品图片:</strong> <img src="${goods.goodsHttp}"><br><br>
    <strong>商品名称:</strong>${goods.goodsName}<br><br>
    <strong>商品价格:</strong>${goods.goodsPrice}￥<br><br>
    <strong>出厂时间:</strong>${goods.goodsCreateTime}<br><br>
    <strong>库存数量:</strong>255个<br><br>
    <a href="/selectAllGoods.action">返回</a>
</center>
</body>
</html>
