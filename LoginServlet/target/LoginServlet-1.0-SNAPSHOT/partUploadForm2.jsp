<%--
  Created by IntelliJ IDEA.
  User: 사용자
  Date: 2021-08-24
  Time: 오전 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<h1>단일 파일 업로드 테스트</h1>
<form action="partUploadPro2" method="post" enctype="multipart/form-data">
  <label for="writer">작성자 : </label>
  <input type = "text" name = "writer" id="writer"><br>

  <label for="partFile1">업로드 파일1 : </label>
  <input type = "file" name = "partFile1" id="partFile1"><br>

  <label for="partFile2">업로드 파일2 : </label>
  <input type = "file" name = "partFile2" id="partFile2"><br>

  <input type = "submit" value = "다중업로드"/>
</form>
</body>
</html>
