<%--  Created by IntelliJ IDEA.
  User: Компьютер
  Date: 03.05.2023
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
  <%@ page import="com.gingermadfire.javaeelearning.test.Cart" %>

  <% Cart cart = (Cart) session.getAttribute("cart");%>

  <p>Наименование: <%= cart.getName()%></p>
  <p>Количество: <%= cart.getQuantity()%></p>
</body>
</html>
