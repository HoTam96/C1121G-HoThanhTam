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
                <h2>Add New Customer</h2>
            </caption>
            <tr>
                <th>Customer Id:</th>
                <td>
                    <p>${message1}</p>
                    <input type="text" name="id" id="name" value="${id}" size="45"/>
                </td>
            </tr>

            <tr>
                <th>customer code:</th>
                <td>
                    <p>${message2}</p>
                    <input type="text" name="code" value="${code}"  size="15"/>
                </td>
            </tr>

            <tr>
                <th>name:</th>
                <td>
                    <input type="text" name="name" value="${name}" size="45"/>
                </td>
            </tr>

            <tr>
                <th>birthDay:</th>
                <td>
                    <input type="text" name="birthDay" value="${birthDay}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>gender:</th>
                <td>
                    <input type="text" name="gender" value="${gender}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>id_card:</th>
                <td>
                    <input type="text" name="idCard" value="${idCard}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>phone:</th>
                <td>
                    <input type="text" name="phone"   value="${phone}" size="45"/>
                </td>
            </tr>
            <tr>
            <tr>
                <th>email:</th>
                <td>
                    <input type="text" name="email"  value="${email}"  size="45"/>
                </td>
            </tr>
            <tr>
            <tr>
                <th>address:</th>
                <td>
                    <input type="text" name="address" value="${address}"   size="45"/>
                </td>
            </tr>
            <tr>
                <th>Type Customer</th>
                <td>
                    <select name="typeCustomer">
                        <c:if test="${typeCustomer1!=null}">
                            <c:forEach var="i" items="${typeCustomer}">
                                <c:choose>
                                    <c:when test="${i.customerTypeId == typeCustomer1.customerTypeId}">
                                        <option  value="${i.customerTypeId}" selected>${i.customerTypeName}</option>
                                    </c:when>
                                    <c:otherwise>
                                        <option value="${i.customerTypeId}">${i.customerTypeName}</option>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </c:if>

                        <c:forEach var="i" items="${typeCustomer}">
                            <option value="${i.customerTypeId}">${i.customerTypeName}</option>
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