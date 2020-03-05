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
<body>

<form:form action="usersuccess" modelAttribute="payment" method="POST">

<center>
<table cellpadding="10px" cellspacing="5px">
<b padding="10px">Payment</b>
<br>
<br>
<tr>
<td>
<form:input path="cardType" value="CreditCard"/>CreditCard
<form:input path="cardType" value="Debit Card"/>Debit Card
</td>
</tr>

<tr>
<td>
Type</td>
<td><form:select path="Type" class="input"/>
<option value="Visa">Visa</option>
<option value="MasterCard">MasterCard</option>
<option value="Diners Club">Diners Club</option>
</td>
</tr>

<tr>
<td>
Card Number</td>
<td><form:input path="cardNumber"/>
</td>
</tr>

<tr>
<td>
Name</td>
<td><form:input path="name"/>
</td>
</tr>

<tr>
<td>
Valid Until</td>
<td><form:input path="valid"/> <form:input path="until"/>
</td>
</tr>

<tr>
<td>CVV</td>
<td><input path="cvv"/></td>

</tr>

<tr>
<td><input type="submit" class="input" value="procced"></td>

</tr>
</center>





</form:form>






</body>
</html>