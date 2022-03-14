<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/14/2022
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">detail Product</h1>
<form>
    <table align="center" border="1" cellpadding="5">
        <tr>
            <th>id</th>
            <td><input type="text" name="id" value="${product.id}"></td>
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
    </table>


</form>

</body>
</html>
