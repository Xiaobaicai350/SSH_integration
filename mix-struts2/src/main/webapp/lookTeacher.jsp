<%@ taglib prefix="c" uri="/struts-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Xu
  Date: 2023/3/17
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看教师信息</title>
</head>
<h1>查看教师信息</h1>
<a href="addTeacher.jsp">添加教师</a>
<a href="findTeacher.jsp">修改教师信息</a>
<a href="deleteTeacher.jsp">删除教师信息</a>
<table border="1">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>部门</th>
    </tr>
    <s:iterator value="teachInfoList">
        <tr>
            <td><s:property value="id" /></td>
            <td><s:property value="name" /></td>
            <td><s:property value="sex" /></td>
            <td><s:property value="age" /></td>
            <td><s:property value="department" /></td>
        </tr>
    </s:iterator>
</table>

</html>
