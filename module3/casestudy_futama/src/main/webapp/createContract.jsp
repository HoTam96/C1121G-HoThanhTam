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
    <form method="post" action="Contract?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Contract</h2>
            </caption>
            <tr>
                <th>contractId:</th>
                <td>
                    <input type="" name="id" id="id" value="${id}" size="45"/>
                    <p style="color: red">${message}</p>
                </td>
            </tr>

            <tr>
                <th>startDate :</th>
                <td>
                    <input type="date" name="startDate" value="${startDate}"  size="15"/>
                </td>
            </tr>

            <tr>
                <th>endDate:</th>
                <td>
                    <input type="date" name="endDate" value="${endDate}" size="45"/>
                </td>
            </tr>

            <tr>
                <th>contract Deposit:</th>
                <td>
                    <input type="text" name="Deposit" value="${deposit}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>total Money:</th>
                <td>
                    <input type="text" name="totalMoney" value="${totalMoney}" size="45"/>
                </td>
            </tr>
<%----%>

            <tr>
                <th>Employee</th>
                <td>
                    <select name="employee">
                        <c:forEach var="i" items="${employee}">
                            <c:choose>
                                <c:when test="${i.getId()==employee1.getId()}">
                                    <option value="${i.getId()}" selected>${i.getName()}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${i.getId() }">${i.getName()}</option>
                                </c:otherwise>
                            </c:choose>

                        </c:forEach>
                    </select>
                </td>
            </tr>


            <tr>
                <th>customer</th>
                <td>
                    <select name="customer">
                        <c:forEach items="${customer}" var="i">
                            <c:choose>
                                <c:when test="${i.getId()==customer1.getId()}">
                                    <option value="${i.getId() }" selected>${i.getName()}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${i.getId() }">${i.getName()}</option>
                                </c:otherwise>
                            </c:choose>

                        </c:forEach>
<%--                        <option value="${i.getId()}">${i.getName()}</option>--%>
                    </select>

                </td>

            </tr>
            <tr>
                <th>Service</th>
                <td>
                    <select name="service">
                        <c:forEach items="${service}" var="i">
                            <c:choose>
                                <c:when test="${i.getServiceId()==service1.getServiceId()}">
                                    <option value="${i.getServiceId()}" selected>${i.getServiceName()}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${i.getServiceId()}">${i.getServiceName()}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
<%--                    <option value="${i.getServiceId()}">${i.getServiceName()}</option>--%>
                </td>

            </tr>




<%--            --%>
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