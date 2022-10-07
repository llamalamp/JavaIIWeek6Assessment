<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show all Customers</title>

<style>
<!--https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro-->
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 50%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

</head>
<body>

<form method = "post" action = "customerNavigationServlet">
<table>
<tr>
<th>Select</th>
<th>ID</th>
<th>Name</th>
<th>City</th>
<th>State</th>
</tr>
<c:forEach items="${requestScope.allItems}" var="currentitem">
<tr>
 <td><input type="radio" name="id" value="${currentitem.customerId}"></td>
 <td>${currentitem.customerId} &nbsp;  </td>
 <td>${currentitem.customerName}</td>
 <td>${currentitem.city}</td>
 <td>${currentitem.state}</td>
 </tr>
</c:forEach>
</table>

<input type = "submit" value = "delete" name="doThisToItem">
<input type="submit" value = "order" name = "doThisToItem">

</form>
<br>
<button type="button" onclick="location.href='http://localhost:8080/week5assessment/index.html';">Go Back Home</button>
</body>
</html>