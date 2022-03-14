<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/13/2022
  Time: 9:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <c:forEach items="${list}" var="i">

    <tr>
      <td>${i.id}</td>
      <td>${i.name}</td>
      <td>${i.description}</td>
      <td>${i.price}</td>
      <td>${i.yearOfManufacture}</td>
      <td>${i.country}</td>
      <td>
        <a href="#">Edit</a>
        <a href="#">Delete</a>
      </td>

    </tr>
  </c:forEach>
  </body>
</html>
