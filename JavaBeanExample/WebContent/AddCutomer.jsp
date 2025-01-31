<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Insert title here</title>
<style type="text/css">
.head{
	height:100px;
	background-color: #00FFFF;
}
</style>
</head>
<body>
<nav class="head">
<div>
		<h1>Login Page</h1>
</div>
	<ul>
		<li><a href="AddCutomer.jsp">Add Customer</a></li>
		<li><a href="ShowCustomers.jsp">Show Customers</a></li>
	</ul>
</nav>
	<c:set value="${requestScope.status}" var="result"></c:set>
	<span style="color: green"><c:out value="${result}"></c:out></span>
	<form action="ProcessCustomer.jsp" method="post">
		<div class="formGroup">
			<label for="customerId">Customer id</label>
			<input type="text" name="customerId" required="required" id="customerId" class="formControl">
		</div>
		<div class="formControl">
			<label for="customerName">Customer Name</label>
			<input type="text" name="customerName" required="required" id="customerName" class="formControl">
		<div class="formControl">
			<label for="mobileNumber">Mobile Number</label>
			<input type="text" name="mobileNumber" required="required" id="mobileNumber" class="formControl">
		</div>
		
		<div class="formControl">
			<input type="submit" value="Add">
		</div>
	</form>
</body>
</html>