<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/11/2022
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <h1>SIMPLE CALCULATOR</h1>

<form action="calculator" method="get">
  <label>First operand :</label>
  <input type="number" name="firstOperand" value="213"><br>
  <label> operator : </label>
   <select name="calculate">
      <option value="+">+</option>
    <option value="-">-</option>
    <option value="*">*</option>
    <option value="/">/</option>
  </select><br>

  <label>Second operand :</label>
  <input type="number" name="secondOperand" value="546"></br>
  <input type="submit" value="Calculate">

</form>
  <p>kêt quả là : ${rs}</p>

  </body>
</html>
