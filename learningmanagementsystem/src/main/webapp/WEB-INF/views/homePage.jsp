<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navbar.jsp"%>
<%
String name = (String) request.getAttribute("data");
String string = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (string != null && !string.isEmpty()) {
	%>
	<%=string%>
	<%
	}
	%>
	<h1>
		Welcome
		<%=name%>
	</h1>
</body>
</html>