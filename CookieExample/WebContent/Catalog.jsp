<%@page import="com.training.ItemList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.util.stream.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%!String bgColor; %>
<%
	Cookie[] ckys=request.getCookies();
	List<Cookie> list = Arrays.asList(ckys);
	List<String> ckysNames=list.stream().filter(cky->cky.getName().equals("srchedItem")|| cky.getName().equals("prefColor")).map(Cookie::getValue).collect(Collectors.toList());
	
	List<String> items = ItemList.getItems().get(ckysNames.get(0));
	bgColor =ckysNames.get(1);
	out.println("You Last Viewed the following items");
	for(String c:items){
		out.println("<h2>"+c+"</h2>");
	}

	System.out.print(bgColor);
%>
<body bgcolor=<%=bgColor%>>
	<ul>
		<li>Electronics</li>
		<li>Textiles</li>
		<li>Books</li>
		<li>Fashion</li>
	</ul>
</body>
</html>