<%--
  Created by IntelliJ IDEA.
  User: 사용자
  Date: 2021-08-23
  Time: 오후 5:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String subject = request.getParameter("subject");
    String filename1 = request.getParameter("filename1");
    String filename2 = request.getParameter("filename2");
    String origfilename1 = request.getParameter("origfilename1");
    String origfilename2 = request.getParameter("origfilename2");
%>
<html>
<head>
    <title>파일 업로드 확인 및 다운로드</title>
</head>
<body>
올린사람 : <%=name %><br>
제목 : <%=subject %><br>
파일명1 : <a href="file_down.jsp?file_name=<%=filename1 %>"><%=origfilename1 %></a><br>
파일명2 : <a href="file_down.jsp?file_name=<%=filename2 %>"><%=origfilename2 %></a><p>
</body>
</html>
