<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"/>

<body>
<h1 align="center">WELCOME TO ROOM CLEANING</h1>






<form:form action="login" method="POST" modelAttribute="login">
<table align="center">
<tr>
<td>Username</td>
<td><form:input path="userName" /> <form:errors path="userName"/></td>
</tr>

<tr>
<td>Password</td>
<td><form:input path="password" type="password"/></td>
</tr>
<tr>
<td>Login As :</td>
<td><form:select path="loginAs">

<option>Admin</option>
<option>User</option>
<option>Cleaner</option>

</form:select></td>
</tr>

<tr>
<td><input type="submit" value="Login" class="btn btn-primary"></td>
<td><input type="reset" value="cancel" class="btn btn-primary"></td>
</tr>

<tr>
<td><a href="/signup">Signup</a></td>
</tr>

</table>
</form:form>
</body>
</html>