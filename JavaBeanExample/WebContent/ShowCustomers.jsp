<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.training.bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style type="text/css">
.head{
	height:100px;
	background-color: #00FFFF;
}
img{
	width: 100px;
	height: 100px;
	float: left;
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
<c:if test="${!sessionScope.isLogged}">
	<h2>Try Again</h2>
	<a href="index.jsp">Login</a>
</c:if>
<c:if test="${sessionScope.isLogged}">
	<%
		List<Customer> custList =(List)session.getAttribute("custList");

	%>
	<table class="table table-striped">
	<tr>
		<th>Customer Id</th>
		<th>Customer Name</th>
		<th>Mobile Phone</th>
	</tr>
	<c:forEach items="${custList}" var="current">
	<tr>
	<td><c:out value="${current.getCustomerId()}"></c:out></td>
	<td><c:out value="${current.getCustomerName()}"></c:out></td>
	<td><c:out value="${current.getMobileNumber()}"></c:out></td>
	</tr>
	
	</c:forEach>
	</table>
</c:if>
</body>
</html>