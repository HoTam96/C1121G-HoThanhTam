<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/12/2022
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Customer Management Application</title>
  </head>
  <body>

  <h1 style="text-align: center">Customer Management</h1>

  <h2 style="text-align: center">
    <a href="new?">Add New Customer</a>
    <a href="#">List All Customer</a>
  </h2>
  <div align="center">
    <table border="1" cellpadding="5">
      <caption><h2>List of Customer</h2></caption>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Phone</th>
        <th>Emai</th>
        <th>Action</th>
      </tr>
      <c:forEach items="${list}" var="i">
        <tr>
          <td>${i.id}</td>
          <td>${i.name}</td>
          <td>${i.phone}</td>
          <td>${i.email}</td>
          <td>
            <a href="edit?id=${i.id}">Edit</a>
            <a href="delete?id=${i.id}">Delete</a>
          </td>


        </tr>



      </c:forEach>



    </table>


  </div>

  </body>
</html>
