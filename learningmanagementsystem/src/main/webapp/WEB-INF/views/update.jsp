<%@page import="com.te.learningmanagementsystem.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp"%>
<%
Employee employee = (Employee) request.getAttribute("data");
String msg = (String) request.getAttribute("msg");
String errMsg = (String) request.getAttribute("errMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (msg != null && !msg.isEmpty()) {
	%>
	<h1 style="color: green;">
		<%=msg%></h1>
	<%
	}
	%>
	<%
	if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<h1 style="color: red;">
		<%=errMsg%></h1>
	<%
	}
	%>
	<br>
	<br>
	<fieldset>
		<legend>Employee Update Form</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td><label>Enter employee Id:</label></td>
					<td><input type="number" name="empId"
						value="<%=employee.getEmpId()%>" disabled="disabled"></td>
				</tr>

				<tr>
					<td><label>Enter employee Name:</label></td>
					<td><input type="text" placeholder="enter the name"
						name="empName"></td>
				</tr>
				<tr>
					<td><label>Enter employee address:</label></td>
					<td><input type="text" placeholder="enter the address"
						name="empAddress"></td>
				</tr>
				<tr>
					<td><label>Enter employee password:</label></td>
					<td><input type="password" placeholder="enter the password"
						name="empPassword"></td>
				</tr>
			</table>
			<input type="submit" value="Update">
		</form>
	</fieldset>
</body>
</html>