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
    <form method="post" action="Service?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Service</h2>
            </caption>
            <tr>
                <th>Service Id:</th>
                <td>
                    <input type="text" name="serviceId" id="name"  size="45"/>
                    <p style="color: red">${message}</p>
                </td>
            </tr>
            <tr>
                <th>Service Name:</th>
                <td>
                    <input type="text" name="serviceName" value="${serviceName}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Area:</th>
                <td>
                    <input type="text" name="area" value="${area}" size="15"/>
                </td>
            </tr>

            <tr>
                <th>Rental Cost:</th>
                <td>
                    <input type="text" name="rentalCost" value="${rentalCost}" size="45"/>
                </td>
            </tr>

            <tr>
                <th>People Max:</th>
                <td>
                    <input type="text" name="peopleMax" value="${peopleMax}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Standard Room:</th>
                <td>
                    <input type="text" name="standardRoom" value="${standardRoom}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Description other:</th>
                <td>
                    <input type="text" name="description" value="${description}" size="45"/>
                </td>
            </tr>


            <c:if test="${id==1}">
                <tr>
                    <th>area Pool:</th>
                    <td>
                        <input type="text" name="areaPool" value="${areaPool}" size="45"/>
                    </td>
                </tr>
            </c:if>


            <c:if test="${!(id==3)}">
                <tr>
                    <th>Number floor:</th>
                    <td>
                        <input type="text" name="numberFloor" value="${numberFloor}" size="45"/>
                    </td>
                </tr>
            </c:if>


            <tr>
                <th>service Type</th>
                <td>
<%--                    <c:forEach items="${serviceType}" var="i">--%>
<%--                        <c:if test="${i.getServiceTypeId()==id}">--%>
                            <input hidden name="id" value="${id}"  size="45"/>
<%--                        </c:if>--%>
<%--                    </c:forEach>--%>
                </td>
            </tr>

            <tr>
                <th>rent Type</th>
                <td>
                    <select name="rentType">
                        <c:forEach var="i" items="${rentType}">
                            <c:choose>
                                <c:when test="${i.getRentTypeId()==rentType1.rentTypeId}">
                                    <option value="${i.getRentTypeId()}" selected>${i.getRentTypeName() }</option
                                </c:when>
                                <c:otherwise>
                                    <option value="${i.getRentTypeId()}">${i.getRentTypeName() }</option>
                                </c:otherwise>
                            </c:choose>

                        </c:forEach>
                    </select>
                </td>

            </tr>
            <tr>

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