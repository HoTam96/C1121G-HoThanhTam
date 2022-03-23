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
    <form method="post" action="Employee?action=edit">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Edit Employee</h2>
            </caption>
            <tr>
                <th>employeId:</th>
                <td>
                    <input type="hidden" name="employeeId" value="${employee.id}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" id="name" value="${employee.name}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>User Email:</th>
                <td>
                    <input type="text" name="email" value="${employee.email}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>BirthDate:</th>
                <td>
                    <input type="text" name="birthday" value="${employee.birthDay}"  size="15"/>
                </td>
            </tr>

            <tr>
                <th>id_card:</th>
                <td>
                    <input type="text" name="idCard" value="${employee.id_card}"  size="45"/>
                </td>
            </tr>

            <tr>
                <th>phone:</th>
                <td>
                    <input type="text" name="phone" value="${employee.phone}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>address:</th>
                <td>
                    <input type="text" name="address" value="${employee.address}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>salary:</th>
                <td>
                    <input type="text" name="salary" value="${employee.salary}"  size="45"/>
                </td>
            </tr>
            <tr>
                <th>position</th>
                <td>
                    <select name="position">
                        <c:forEach var="i" items="${position}">
                            <c:choose>
                                <c:when test="${i.positionId == employee.positionId.positionId}">
                                    <option value="${i.positionId}" selected>${i.positionName}</option>
<%--                                    <option value="${educationDegree.getId()}" selected>${educationDegree.getName()}</option>--%>
                                </c:when>
                                <c:otherwise>
                                    <option value="${i.positionId}">${i.positionName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>

                </td>

            </tr>
            <tr>
                <th>Education Degree</th>
                <td>
                    <select name="education">
                        <c:forEach var="education" items="${education}">
                            <c:choose>
                                <c:when test="${education.educationDegreeId == employee.educationDegreeId.educationDegreeId}">
                                    <option value="${education.educationDegreeId}" selected>${education.educationDegreeName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${education.educationDegreeId}">${education.educationDegreeName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>

                </td>

            </tr>
            <tr>
                <th>Division</th>
                <td>
                    <select name="division">
                        <c:forEach var="division" items="${division}">
                            <c:choose>
                                <c:when test="${division.divisionId == employee.divisionId.divisionId}">
                                    <option value="${division.divisionId}" selected>${division.divisionName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${division.divisionId}">${division.divisionName}</option>
                                </c:otherwise>
                            </c:choose>
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