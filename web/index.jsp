<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/22
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="user/findAll">查询全部</a><br>
  <a href="user/addUser?username=1122&password=1122">添加</a><br>
  <a href="user/updateUser?username=1111&password=1111&id=2">修改（我给固定了，可改）</a><br>
  <a href="user/findById?id=2">通过ID查询（我给固定了，可改）</a><br>
  <a href="user/delete?id=11">删除（我给固定了，可改）</a><br>
  <a href="user/findOne/2">findOne/{id}</a><br>
  </body>
</html>
