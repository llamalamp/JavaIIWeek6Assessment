<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit movie screen</title>
</head>
<body>

<form action = "editMovieServlet" method="post">
Store: <input type ="text" name = "title" value= "${itemToEdit.movieTitle}">
<br>
<br>
Item: <input type = "text" name = "quantity" value= "${itemToEdit.quantity}">
<br><br>
<input type = "hidden" name = "id" value="${itemToEdit.ID}">
<input type = "submit" value="Save">
</form>

</body>
</html>