<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"/>
    
     <style>
        
        table{
            background-color:#ffe4c4;
        }
        
        #errors
        {
        	color:red;
        }
    </style>
    
<header>
    
    
    
    
</header>    
<section>
<body>
    
    <center><h1>CLEANER DETAILS</h1></center>
    
    <center>
    <form:form class="form-group" action="addcleaner" modelAttribute="cleaner">
        
        <table class="cleanertable" cellspacing="10px" cellpadding="10px">
            
        <tr>
        <td>FirstName</td>
        <td><form:input path="firstName" id="errors"/></td>
        <td><form:errors path="firstName" id="errors"/></td>
        </tr>
            
        <tr>
        <td>LastName</td>
        <td><form:input path="lastName" /></td>
        <td><form:errors path="lastName" id="errors"/></td>
        </tr>
        
        <tr>
        <td>DOB</td>
        <td><form:input path="dob"/></td>
        <td><form:errors path="dob" id="errors"/></td>
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
           	<td><form:errors path="contactNumber" id="errors"/></td>
        </tr>
        
        <tr>
            <td>CleanerId</td>
            <td><form:input path="cleanerId" /></td>
            <td><form:errors path="cleanerId" id="errors"/></td>
        </tr>
            
        <tr>
            <td>Password</td>
            <td><form:input path="password" /></td>
            <td><form:errors path="password" id="errors"/></td>
        </tr>
             
        <tr>
           <td>Add Cleaner License Number</td>
           <td>
           <form:input path="license"/>
           </td>
           <td><form:errors path="license" id="errors"/></td>
        </tr>
            
            

        <tr>
           <td>Add Aadharcard Number</td>
           <td>
           <form:input path="aadharCard"/>
           </td>
           <td><form:errors path="aadharCard" id="errors"/></td>
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
</section>
</html>