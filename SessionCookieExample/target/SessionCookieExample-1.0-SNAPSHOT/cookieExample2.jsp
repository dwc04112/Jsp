<%--
  Created by IntelliJ IDEA.
  User: 사용자
  Date: 2021-08-18
  Time: 오전 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie cookie= new Cookie("language",request.getParameter("language"));
    cookie.setMaxAge(60*60*24);
    response.addCookie(cookie);
%>
<script>
    location.href="cookieExample1.jsp"
</script>
