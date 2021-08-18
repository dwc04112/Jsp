<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%session.setAttribute("id",request.getParameter("id"));
    String id = request.getParameter("id");
    System.out.println("입력받은 id : " +id);%>
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
