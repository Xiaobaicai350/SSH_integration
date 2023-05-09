<%--
  Created by IntelliJ IDEA.
  User: Xu
  Date: 2023/3/17
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找教师信息</title>
</head>
<body>
<h1>查找教师信息</h1>
<form action="findTeacher.action" method="post">
    请输入你要查找的教师编号：<input type="text" name="id"/><br>
    <input type="submit" value="查找"/>
</form>
</body>
</html>
