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
    <form method="post" action="Customer?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Contract</h2>
            </caption>
            <tr>
                <th>contractId:</th>
                <td>
                    <input type="text" name="id" id="id" value="${id}" size="45"/>
                </td>
            </tr>

            <tr>
                <th>startDate :</th>
                <td>
                    <input type="text" name="startDate" value="${code}"  size="15"/>
                </td>
            </tr>

            <tr>
                <th>endDate:</th>
                <td>
                    <input type="text" name="endDate" value="${name}" size="45"/>
                </td>
            </tr>

            <tr>
                <th>contract Deposit:</th>
                <td>
                    <input type="text" name="Deposit" value="${birthDay}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>total Money:</th>
                <td>
                    <input type="text" name="totalMoney" value="${gender}" size="45"/>
                </td>
            </tr>
<%----%>

            <tr>
                <th>Employee</th>
                <td>
                    <select name="employee">
                        <c:forEach var="i" items="${employeeList}">
                            <option value="${i.getEmployeId()}">${i.getName()}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>


            <tr>
                <th>customer</th>
                <td>
                    <select name="customerList">
                        <c:forEach items="${customerList}" var="i">
                            <option value="${i.getId()}">${i.getName()}</option>
                        </c:forEach>
                    </select>

                </td>

            </tr>
            <tr>
                <th>Service</th>
                <td>
                    <select name="service">
                        <c:forEach items="${serviceList}" var="i">
                            <option value="${i.getServiceId()}">${i.getServiceName()}</option>
                        </c:forEach>
                    </select>

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