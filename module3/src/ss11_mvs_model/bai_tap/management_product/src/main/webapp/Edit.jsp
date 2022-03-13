<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/13/2022
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">Edit Product</h1>
<h2 style="text-align: center">
    <a href="product?">Back to Home</a>
</h2>

<form method="post" action="product?action=edit">
    <table align="center" border="1" cellpadding="5">
        <tr>
            <th>id</th>
            <td><input type="hidden" name="id" value="${item.id}"></td>
        </tr>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name" value="${item.name}"></td>
        </tr>
        <tr>
            <th>Price</th>
            <td><input type="text" name="price" value="${item.price}"></td>
        </tr>
        <tr>
            <th>Description</th>
            <td><input type="text" name="description" value="${item.description}"></td>
        </tr>
        <tr>
            <th>YearOfManufacture</th>
            <td><input type="text" name="yearOfManufacture" value="${item.yearOfManufacture}"></td>
        </tr>
        <tr>
            <th>Country</th>
            <td><input type="text" name="country" value="${item.country}" ></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center"><input type="submit" value="save"></td>
        </tr>

    </table>


</form>


</body>
</html>
