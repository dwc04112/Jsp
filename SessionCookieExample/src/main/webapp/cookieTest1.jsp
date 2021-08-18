<%@ page import="java.net.CookieHandler" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie cookie = new Cookie ("name","hongkildong");  //쿠키 값 설정
    cookie.setMaxAge(600);  //쿠키의 만료시간
    //
    response.addCookie(cookie);
%>
<html>
<head>
    <title>Cookie Test</title>
</head>
<body>
<h2><%=cookie.getName()%></h2>
<h2><%=cookie.getValue()%></h2>
<h2><%=cookie.getMaxAge()%></h2>
<a href="cookieTest2.jsp">쿠키 값 불러오기</a>
</body>
</html>
