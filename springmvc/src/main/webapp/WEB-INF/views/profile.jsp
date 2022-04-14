<%@page import="com.te.springmvc.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
Employee employee = (Employee) request.getAttribute("data");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Welcome
		<%=employee.getUser()%>
	</h1>
	<h1>
		Your password is :
		<%=employee.getPass()%></h1>
</body>
</html>