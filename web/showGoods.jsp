<%--
  Created by IntelliJ IDEA.
  User: Monologue-XG
  Date: 2017/12/16
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品信息</title>
</head>
<body>
<center>
<table border="2px" cellspacing="2px">
    <caption>商品信息</caption>
    <thead>
        <tr>
            <th>id</th>
            <th>商品名称</th>
            <th>商品价格</th>
            <th>出厂时间</th>
            <th>操 作</th>
        </tr>
    </thead>
    <c:forEach items="${list}" var="goods">
        <tr>
            <th>${goods.id}</th>
            <th>${goods.goodsName}</th>
            <th>${goods.goodsPrice}</th>
            <th>${goods.goodsCreateTime}</th>
            <th><a href="/selectGoodsById.action?Gid=${goods.id}">详情</a>|<a href="/deleteGoodsById.action?id=${goods.id}">删除</a></th>
        </tr>
    </c:forEach>
</table>
</center>
</body>
</html>
