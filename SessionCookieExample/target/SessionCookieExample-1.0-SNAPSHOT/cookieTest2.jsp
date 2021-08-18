<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name="";
    String value="";
    String cookie = request.getHeader("Cookie");

    if(cookie!=null){
        Cookie cookies[]=request.getCookies();

        for(Cookie c : cookies){
            System.out.println("key = "+c.getName()+", value = "+c.getValue());
            if(c.getName().equals("name")){
                name=c.getName();
                value=c.getValue();
            }
        }
    }
%>
<html>
<head>
    <title>Cookie Test</title>
</head>
<body>
<h2>쿠키 이름 = <%=name%></h2>
<h2>쿠키 값 = <%=value%></h2>
</body>
</html>
