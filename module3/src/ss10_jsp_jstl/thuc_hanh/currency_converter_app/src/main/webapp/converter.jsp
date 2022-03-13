<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/10/2022
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>converter.jsp</title>
</head>
<body>
<%
float rate = Float.parseFloat(request.getParameter("rate"));
float usd = Float.parseFloat(request.getParameter("usd"));
    float vnd = rate * usd;

%>
<h1>Rate: <%=rate%></h1>
<h1>usd: <%=usd%></h1>
<h1>usd: <%=vnd%></h1>
</body>
</html>
