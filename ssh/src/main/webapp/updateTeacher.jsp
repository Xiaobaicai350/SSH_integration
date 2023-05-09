<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Xu
  Date: 2023/3/17
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新教师信息</title>
</head>
<body>
<h1>更新教师信息</h1>
<form action="updateTeacher.action" method="post">
    教师编号：<input type="text" name="id" value="<s:property value='teachInfo.id'/>" readonly="true"/><br>
    姓名：<input type="text" name="name" value="<s:property value='teachInfo.name'/>"/><br>
    性别：<input type="text" name="sex" value="<s:property value='teachInfo.sex'/>"/><br>
    年龄：<input type="text" name="age" value="<s:property value='teachInfo.age'/>"/><br>
    部门：<input type="text" name="department" value="<s:property value='teachInfo.department'/>"/><br>
    <input type="submit" value="更新"/>
</form>
</body>
</html>
