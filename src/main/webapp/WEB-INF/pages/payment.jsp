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
body{
font-family:Calibri;
}

.t{
align:center;
background-color:#FFE4C4
}
.input{
  border: 2px solid #e1e8ee;
    border-radius: 6px;
}

        #errors
        {
        	color:red;
        }
</style>
<body>

<form:form action="usersuccess" modelAttribute="payment" method="POST">

<center>
<table cellpadding="10px" cellspacing="5px" class="t">
<b padding="10px">Payment</b>
<br>
<br>
<tr>
<td>
<form:radiobutton path="cardType" value="CreditCard" />CreditCard
<form:radiobutton path="cardType" value="Debit Card" />Debit Card
</td>
</tr>

<tr>
<td>
Type</td>
<td><form:select path="Type" class="input" required="true">
<option value="Visa">Visa</option>
<option value="MasterCard">MasterCard</option>
<option value="Diners Club">Diners Club</option>
</form:select>
</td>
</tr>

<tr>
<td>
Card Number</td>
<td><form:input path="cardNumber" class="input" required="true"/>
</td>
<td><form:errors path="cardNumber" id="errors"/><td>
</tr>

<tr>
<td>
Name</td>
<td><form:input path="name" class="input"/></td>
<td><form:errors path="name" id="errors"/></td>
</tr>

<tr>
<td>
Valid Until</td>
<td><form:input path="valid" class="input"/> <form:input path="until" class="input"/></td>
<td><form:errors path="valid" id="errors"/></td>
</tr>

<tr>
<td>CVV</td>
<td><input path="cvv" class="input"/></td>
<td><form:errors path="cvv" id="errors"/></td>
</tr>

<tr>
<td><input type="submit" class="input" value="procced"></td>
</tr>
</center>





</form:form>






</body>
</html>