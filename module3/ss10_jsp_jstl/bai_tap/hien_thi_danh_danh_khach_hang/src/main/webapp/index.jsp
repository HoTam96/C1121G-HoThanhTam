<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/10/2022
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>danh sách khách hàng</title>
    <style>
        img {
            width: 100px;
            height: 100px;
        }

        table {
              width: 600px;
        }
        body{

            margin-left: 300px;
        }

    </style>
</head>
<body>
<h2 style="text-align: center">danh sách khách hàng</h2>
<table border="1">
    <tr>
        <th>name</th>
        <th>dayOfBirth</th>
        <th>address</th>
        <th>image</th>
    </tr>

    <c:forEach items="${l}" var="i">
        <tr>
            <td>${i.name}</td>
            <td>${i.dayOfBirth}</td>
            <td>${i.address}</td>
            <td><img src="${i.image}"></td>

        </tr>

    </c:forEach>



</table>


</body>
<script>

    
</script>
</html>
