<%--
  Created by IntelliJ IDEA.
  User: 사용자
  Date: 2021-08-18
  Time: 오전 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%session.setAttribute("id",request.getParameter("id"));%>
<html>
<head>
    <title>Session Login</title>
</head>
<body>
<h3>로그인되었습니다</h3>
<h3>로그인 아이디 : <%=(String)session.getAttribute("id") %></h3>
<a href="sessionLogout.jsp">로그아웃</a>
</body>
</html>
