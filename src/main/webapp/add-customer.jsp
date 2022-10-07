<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Add customer screen</h1>
<form action = "addCustomerServlet" method="post">
Name: <input type ="text" name = "name">
<br><br>
City: <input type = "text" name = "city">
<br><br>
State: <input type = "text" name = "state">
<input type = "submit" value="Add Customer">
</form> <br />

<br>
<a href = "index.html">Home</a>
<br>
<a href = "showAllCustomersServlet">View all customers</a>

</body>
</html>