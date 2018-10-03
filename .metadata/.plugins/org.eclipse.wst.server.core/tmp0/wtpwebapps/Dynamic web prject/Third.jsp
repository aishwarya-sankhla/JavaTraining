<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<span style="color:red">New Session
	<%
	out.println(session.isNew());	
	%>
</span>
<p>
<%
	out.println(session.getId());
%>
</p>
<p>
<% out.println(session.getAttribute("secondAttribute")); %>
<% out.println(session.getAttribute("firstAttribute")); %>
</p>
<% session.invalidate(); %>
<a href="Fourth.jsp">Third</a>
</body>
</html>