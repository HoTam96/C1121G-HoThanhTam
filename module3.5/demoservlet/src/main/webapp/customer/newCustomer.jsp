<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/12/2022
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới</title>
</head>
<body>
<h1><a href="list">List All Customer</a></h1>
<div align="center">
    <form action="create?" method="post">
        <table border="1" cellpadding="5">
            <caption>Add New Customer</caption>
            <tr>
                <th>Customer id</th>
                <td>
                    <c:if test="${message!=null}">
                        <p style="color: red">${message}</p>
                    </c:if>
                    <input type="text" name="id" size="45">
                </td>
            </tr>
            <tr>
                <th>Customer name</th>
                <td>
                    <input type="text" name="name" size="45" value="${customer.name}">
                </td>
            </tr>
            <tr>
                <th>Customer Phone</th>
                <td>
                    <input type="text" name="phone" size="45" value="${customer.phone}">
                </td>
            </tr>
            <tr>
                <th>Customer Email</th>
                <td>
                    <input type="text" name="email" size="45" value="${customer.email}">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="save">
                </td>
            </tr>


        </table>


    </form>


</div>


</body>
</html>
