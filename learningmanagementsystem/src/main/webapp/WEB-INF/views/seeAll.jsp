<%@page import="com.te.learningmanagementsystem.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navbar.jsp"%>
<%
List<Employee> employees = (List<Employee>) request.getAttribute("infos");
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
	if (employees != null) {
	%>
	<table border="1px" cellspacing="0px" cellpadding="10px">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Address</td>
		</tr>
		<%
		for (Employee employee : employees) {
		%>
		<tr>

			<td><%=employee.getEmpId()%></td>
			<td><%=employee.getEmpName()%></td>
			<td><%=employee.getEmpAddress()%></td>


		</tr>
		<%
		}
		%>
	</table>
	<%
	}
	%>

</body>
</html>