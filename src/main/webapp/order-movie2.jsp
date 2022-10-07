<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Receipt page</title>
</head>
<body>

<h3>Order Details - Thank you order processed!</h3>
<br>
Customer Name: <input type ="text" name = "name" value= "${customerToOrder.customerName}">
<br>
<br>
Item: <input type = "text" name = "title" value= "${itemToOrder.movieTitle}">
<br><br>
<button type="button" onclick="location.href='http://localhost:8080/week5assessment/index.html';">Go Back Home</button>



</body>
</html>