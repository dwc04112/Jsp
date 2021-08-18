<%--
  Created by IntelliJ IDEA.
  User: 사용자
  Date: 2021-08-18
  Time: 오전 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name;
    if(session.getAttribute("name")!=null){     //session = 내장객체 : Jsp안에 내장된, 선언 필요없이 쓸수잇는 객체
        //NPE이 발생하지 않도록 null처리 (방어적 프로그래밍)
        name=(String)session.getAttribute("name");
    }else{
        name="세션값 없음";
    }
%>
<html>
<head>
    <title>Session Test</title>
</head>
<body>
<h2>세션테스트</h2>
<input type="button" onclick="location.href='sessionSet.jsp'"value="세션 값 저장">
<input type="button" onclick="location.href='sessionDel.jsp'"value="세션 값 삭제">
<input type="button" onclick="location.href='sessionInvalidate.jsp'"value="세션 값 초기화">
<h3><%=name %></h3>
</body>
</html>
