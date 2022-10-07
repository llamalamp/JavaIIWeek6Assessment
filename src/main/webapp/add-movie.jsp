<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Fill in form or make another selection</h1>

<form action = "addMovieServlet" method="post">
Title: <input type ="text" name = "title">
Quantity: <input type = "text" name = "quantity">
<input type = "submit" value="Add Movie">
</form> <br />

<button type="button" onclick="location.href='http://localhost:8080/week5assessment/showAllMovies.jsp';">View Inventory</button>
<button type="button" onclick="location.href='http://localhost:8080/week5assessment/index.html';">Go Back Home</button>


</body>
</html>