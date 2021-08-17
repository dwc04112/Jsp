<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: 사용자
  Date: 2021-08-17
  Time: 오후 2:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>JDBC 연동 테스트 예제</title>
</head>
<body>
<h3>
    <%
        Connection conn = null;
        String driver="org.mariadb.jdbc.Driver";
        String url = "jdbc:mariadb://localhost:3306/dgd";
        Boolean connection = false;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "root", "0000");
            connection = true;
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    %>

    <% if(connection) { %>
    연결 하였음.
    <% } else { %>
    연결에 실패했음.
    <% } %>
</h3>

</body>
</html>
