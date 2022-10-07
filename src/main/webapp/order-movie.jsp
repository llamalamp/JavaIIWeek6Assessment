<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show all Movies</title>

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

Customer Name: <input type ="text" name = "name" value= "${customerToOrder.customerName}">
Customer ID: <input type ="text" name = "cid" value= "${customerToOrder.customerId}">

<br><br>



<table>
<tr>
<th>Select</th>
<th>ID</th>
<th>Title</th>
<th>QTY</th>
</tr>
<c:forEach items="${requestScope.allItems}" var="currentitem">
<tr>
 <td><input type="radio" name="id" value="${currentitem.ID}"></td>
 <td>${currentitem.ID} &nbsp;  </td>
 <td>${currentitem.movieTitle}</td>
 <td>${currentitem.quantity}</td>
 </tr>
</c:forEach>
</table>

<input type="submit" value = "Place Order" name = "doThisToItem">
</form>

<button type="button" onclick="location.href='http://localhost:8080/week5assessment/index.html';">Go Back Home</button>

</body>
</html>