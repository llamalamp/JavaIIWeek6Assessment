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

<form method = "post" action = "navigationServlet">
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

<input type = "submit" value = "edit" name="doThisToItem">
<input type = "submit" value = "delete" name="doThisToItem">
<input type="submit" value = "add" name = "doThisToItem">
</form>

</body>
</html>