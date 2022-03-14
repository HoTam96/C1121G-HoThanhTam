<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/13/2022
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<h1 style="text-align: center">Management Product</h1>
<h2 style="text-align: center">
    <a href="Create.jsp?">Create new Prodcut</a>
    <a href="product?">Get List All Product</a>
</h2>
<c:if test="${message!=null}">
    <p style="color: red;text-align: center;font-size: 18px">${message}</p>
</c:if>
<form style="text-align: center" action="product?action=search" method="post">
    <input type="text" name="search" size="45">
    <input type="submit" value="tìm kiếm">
</form>

<table align="center" border="1" cellpadding="5">
    <caption style="font-weight: bold;font-size: 18px">Management Product</caption>
<thead>


    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>YearOfManufacture</th>
        <th>Country</th>
        <th>Action</th>
    </tr>
</thead>
    <tbody>
    <c:forEach items="${list}" var="i">

        <tr>
            <td>${i.id}</td>
            <td><a href="product?action=view&id=${i.id}">${i.name}</a></td>
            <td>${i.description}</td>
            <td>${i.price}</td>
            <td>${i.yearOfManufacture}</td>
            <td>${i.country}</td>
            <td>
                <a href="product?action=edit&id=${i.id}">Edit</a>
                <a href="product?action=delete&id=${i.id}">Delete</a>
            </td>

        </tr>
    </c:forEach>

    </tbody>

</table>




</body>
</html>
