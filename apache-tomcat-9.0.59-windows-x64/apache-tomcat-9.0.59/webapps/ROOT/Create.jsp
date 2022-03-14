<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/13/2022
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">Create Product</h1>
<h2 style="text-align: center">
    <a href="product?">Back to Home</a>
</h2>
<c:if test="${message!=null}">
    <p style="color: red ; text-align: center;font-size: 18px">${message}</p>
</c:if>

<form method="post" action="product?action=create">
    <table align="center" border="1" cellpadding="5">
        <tr>
            <th>id</th>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name" value="${product.name}"></td>
        </tr>
        <tr>
            <th>Price</th>
            <td><input type="text" name="price" value="${product.price}"></td>
        </tr>
        <tr>
            <th>Description</th>
            <td><input type="text" name="description" value="${product.description}"></td>
        </tr>
        <tr>
            <th>YearOfManufacture</th>
            <td><input type="text" name="yearOfManufacture" value="${product.yearOfManufacture}"></td>
        </tr>
        <tr>
            <th>Country</th>
            <td><input type="text" name="country" value="${product.country}"></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center"><input type="submit"></td>
        </tr>

    </table>


</form>



</body>
</html>
