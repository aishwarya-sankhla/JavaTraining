<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<title>Insert title here</title>
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
<form action="CustomerServlet" method="post">
	<label for="userName">User Name</label>
	<input type="text" name="userName" placeholder="Enter user name" id="userName"/>
	<label for="passWord">Pass Word</label>
	<input type="text" name="passWord" placeholder="Enter password" id="passWord"/>

	<input type="submit" value="login"/>
</form>
</body>
</html>