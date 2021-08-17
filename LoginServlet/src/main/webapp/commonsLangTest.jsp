<%@ page import="org.apache.commons.lang3.StringUtils" %><%--
  Created by IntelliJ IDEA.
  User: 사용자
  Date: 2021-08-17
  Time: 오후 2:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //java코드 쓰는 공간
    //pom.xml 으로 가져온 commons-langs 의 라이브러리들을 여기서도 쓸 수 있나?
    String input = "123123";
    boolean result = StringUtils.isNumeric(input);
%>
<h2>잘도나? <%=result%></h2>

</body>
</html>
