<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Orders</title>
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

<table>
<tr>
<th>Customer ID</th>
<th>Movie ID</th>
</tr>
<c:forEach items="${requestScope.allItems}" var="currentitem">
<tr>
 <td>${currentitem.customer.customerName} &nbsp;  </td>
 <td>${currentitem.movie.movieTitle}</td>
 </tr>
</c:forEach>
</table>
<button type="button" onclick="location.href='http://localhost:8080/week5assessment/index.html';">Go Back Home</button>

</body>
</html>