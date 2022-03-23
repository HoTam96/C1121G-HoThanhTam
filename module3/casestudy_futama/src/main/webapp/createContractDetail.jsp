<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User FURAMA MANAGEMENT</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="HomPageFurama.jsp?action=user">Back Home</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="Detail?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Customer</h2>
            </caption>

            <tr>
                <th>contractId :</th>
                <td>
                    <select name="contractId">
                        <c:forEach var="i" items="${list}">
                            <option value="${i.getContractId()}">${i.getContractId()}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>

            <tr>
                <th>Attach service name:</th>
                <td>
                <select name="Attach">
                <c:forEach var="i" items="${listAttach}">
                    <option value="${i.getId()}">${i.getName()}</option>
                </c:forEach>
                </select>
                </td>
            </tr>


            <tr>
                <th>quantity:</th>
                <td>
                    <input type="text" name="quantity"   size="45"/>
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>