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
    
        <style>
        
            table{
                background-color:#FFE4C4;
                }

        </style>


<body> 
<center><h1>SERVICE BOOKING</h1></center>
<form:form action="serviceadded" modelAttribute="service" method="POST">
<center>
        <table cellspacing="10px" cellpadding="10px">
            
            <tr>
            <td>Roomcount</td>
            <td><form:input path="RoomCount"/></td>
            </tr>
            
            
            <tr>
                <td><b>Address</b></td>
            </tr>
            
            <tr>
               <td>Street</td>
               <td><form:input path="street"/></td>
            </tr>
            
            <tr>
            <td>City</td>
               <td><form:input path="city"/></td>
            </tr>
            <tr>
  
                        
            <tr>
               <td>Pincode</td>
               <td><form:input path="pincode"/></td>
            </tr>
            

            <tr>
               <td>date</td>
               <td><form:input path="date"/></td>
            </tr>
            
            <tr>
               <td>Time Slot</td>
               <td><form:input path="timeSlot"/></td>
            </tr>
            
            <tr>
               <td>Contact Number</td>
               <td><form:input path="contactNumber"/></td>
            </tr>
            
            
            
            <tr>
               <td><input type="submit" value="submit" class="btn btn-primary"></td>
            </tr>
      
</table>
    </center>
</form:form>
</body>
</html>