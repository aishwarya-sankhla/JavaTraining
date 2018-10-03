<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Your cart</h2>
<ul>
	<li><%out.println(session.getAttribute("book"));%></li>
	<li><%out.println(session.getAttribute("mobile"));%></li>
</ul>
	<form action="CartServlet">
		<input type="checkbox" name="pizza" value="Dominos">Dominos<br>
		<input type="checkbox" name="pizza" value="Pizza Hut">Pizza Hut<br>
		<input type="checkbox" name="pizza" value="Big Brewsky">Big Brewsky<br>
	
		<input type="submit" value="Add to Cart">
	</form>
</body>
</html>