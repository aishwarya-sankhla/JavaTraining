<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Your Cart</h2>
<ul>
	<li><%out.println(session.getAttribute("book"));%></li>
</ul>
<br>
<form action="CartServlet">
	<label>Phones</label><br>
	<label for="iphone">Iphone</label>
	<input type="radio" name="phone" value="Iphone" id="iphone"/>
	<label for="lg">LG</label>
	<input type="radio" name="phone" value="LG" id="lg"/>
	<label for="samsung">Samsung</label>
	<input type="radio" name="phone" value="Samsung" id="samsung"/>
	
	<input type="submit" value="Add to Cart">
</form>
</body>
</html>