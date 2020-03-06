<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center" border="1">
<tr>
<th>firstName</th>
<th>lastName</th>
<th>dob</th>
<th>contactNumber</th>
<th>gender</th>
<th>userId</th>
<th>password</th>
</tr>


<tr>
<td>${user.firstName}</td>
<td>${user.lastName}</td>
<td>${user.dob}</td>
<td>${user.contactNumber}</td>
<td>${user.gender}</td>
<td>${user.userId}</td>
<td>${user.password}</td>
</tr>



</table>

<br><br>

<h2 align="center"><a href="updateUser">Update Profile</a></h2>

</body>
</html>