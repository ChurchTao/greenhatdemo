<%--
  Created by IntelliJ IDEA.
  User: jiacheng
  Date: 2017/7/20
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello world

<form action="/upload" method="post" enctype="multipart/form-data">
    照片：<input type="file" name="photo">
    <br/>
    <input type="submit" value="提交">

</form>
</body>
</html>
