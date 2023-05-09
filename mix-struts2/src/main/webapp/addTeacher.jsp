<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加教师信息</title>
</head>
<body>
<h2>添加教师信息</h2>
<form action="addTeacher.action" method="post">
    <label>编号：</label>
    <input type="text" name="id"><br><br>
    <label>姓名：</label>
    <input type="text" name="name" required><br><br>
    <label>性别：</label>
    <input type="radio" name="sex" value="男" required>男
    <input type="radio" name="sex" value="女" required>女<br><br>
    <label>年龄：</label>
    <input type="number" name="age"><br><br>
    <label>部门：</label>
    <input type="text" name="department"><br><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
