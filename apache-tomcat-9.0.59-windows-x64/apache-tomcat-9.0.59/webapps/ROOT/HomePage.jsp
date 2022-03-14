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

    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

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
    <table border="1" id="example" class="table table-striped table-bordered">
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

                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" onclick="getId(${i.id})"
                            data-bs-target="#exampleModal">
                      delete
                    </button>


                </td>

            </tr>
        </c:forEach>

        </tbody>

    </table>

<!-- Button trigger modal -->


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="/product?action=delete" >
                <input  name="id" id="idDelete">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    ...
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">ok</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script>
    $(document).ready(function () {
        $('#example').DataTable();
    });
</script>
<script>
    function getId(id) {
        document.getElementById("idDelete").value = id;
    }

</script>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

</html>
