<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"/>
    
     <style>
        
        table{
            background-color:#ffe4c4;
        }
        
    </style>
  
<body>
    
    <center><h1>USER DETAILS</h1></center>
    
    <center>
    <form:form class="form-group" action="cleanersignup" modelAttribute="user">
        
        <table class="cleanertable" cellspacing="10px" cellpadding="10px">
            
        <tr>
        <td>FirstName</td>
        <td><form:input path="firstName" /></td>
        </tr>
            
        <tr>
        <td>LastName</td>
        <td><form:input path="lastName" /></td>
        </tr>
        
        <tr>
        <td>DOB</td>
        <td><form:input path="dob" /></td>
        </tr>
            
        <tr> 
        <td>Gender</td>
            <td>Male
            <form:radiobutton path="gender" value="Male" />
            Female
            <form:radiobutton path="gender" value="Female" />
            </td>
        </tr>  
            
        <tr>
            <td>ContactNumber</td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        
        <tr>
            <td>CleanerId</td>
            <td><form:input path="userId" /></td>
        </tr>
            
        <tr>
            <td>Password</td>
            <td><form:input path="password" /></td>
        </tr>
        
        <tr>
        	<td>roleStatus</td>
        	<td><form:input path="roleStatus"/></td>
        </tr>
        
        <tr>
        <td>
            <input type="submit" class="btn btn-primary">
        </td>
        </tr>
        
    </table>
    </form:form>
    </center>
</body>
</html>