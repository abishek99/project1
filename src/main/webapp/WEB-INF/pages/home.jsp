<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">WELCOME TO ROOM CLEANING</h1>
<form:form  action="" method="POST">
<table align="center">
	<tr>
	<td>Username</td>
	<td><input path="userName"/></td>
	</tr>
	
	<tr>
	<td>Password</td>
	<td><input path="password"/></td>
	</tr>

	<tr>
	<td><input type="submit" value="Login"></td>
	<td><input type="reset" value="cancel"></td>
	</tr>
	
	<tr>
	<td><a href="/signup">Signup</a></td>
	</tr>

</table>
</form:form>
</body>
</html>