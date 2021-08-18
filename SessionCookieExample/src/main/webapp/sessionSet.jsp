<%--
  Created by IntelliJ IDEA.
  User: 사용자
  Date: 2021-08-18
  Time: 오전 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% session.setAttribute("name","Session Test!");
//메소드 안에 들어가는 값 : 인자(파라미터)
    session.setMaxInactiveInterval(7);
    //7초 뒤 세션이 만료되어 초기화%>  <!-- 스클립틀릿 -->
<script>
    location.href="sessionTest.jsp";
</script>



