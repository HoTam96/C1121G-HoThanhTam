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
        <a href="HomPageFurama.jsp?action=users">Back Home</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="Employee?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Employee</h2>
            </caption>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email"  size="45"/>
                </td>
            </tr>
            <tr>
                <th>BirthDate:</th>
                <td>
                    <input type="text" name="birthday"  size="15"/>
                </td>
            </tr>

            <tr>
                <th>id_card:</th>
                <td>
                    <input type="text" name="idCard"  size="45"/>
                </td>
            </tr>

            <tr>
                <th>phone:</th>
                <td>
                    <input type="text" name="phone" size="45"/>
                </td>
            </tr>
            <tr>
                <th>address:</th>
                <td>
                    <input type="text" name="address" size="45"/>
                </td>
            </tr>
            <tr>
                <th>employeId:</th>
                <td>
                    <input type="text" name="employeeId" size="45"/>
                </td>
            </tr>
            <tr>
                <th>salary:</th>
                <td>
                    <input type="text" name="salary"  size="45"/>
                </td>
            </tr>
            <tr>
                <th>position</th>
                <td>
                    <select name="option1">
                        <c:forEach var="position" items="${position}">
                            <option value="${position.positionId}">${position.positionName}</option>
                        </c:forEach>
                    </select>
                </td>

            </tr>
            <tr>
                <th>Education Degree</th>
                <td>
                    <select name="option2">
                        <c:forEach items="${education}" var="i">
                            <option value="${i.educationDegreeId}">${i.educationDegreeName}</option>
                        </c:forEach>
                    </select>

                </td>

            </tr>
            <tr>
                <th>Division</th>
                <td>
                    <select name="option3">
                        <c:forEach items="${division}" var="i">
                            <option value="${i.divisionId}">${i.divisionName}</option>
                        </c:forEach>
                    </select>

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