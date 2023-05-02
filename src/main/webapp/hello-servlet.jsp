<%--
  Created by IntelliJ IDEA.
  User: Компьютер
  Date: 02.05.2023
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello servlet</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%
            String name = request.getParameter("name");
        %>
        <%= "Hello, " + name%>
    </p>
</body>
</html>
