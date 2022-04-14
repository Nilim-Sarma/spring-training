<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navbar.jsp"%>
<%
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
	<h1 style="color: green">
		<%=msg%>
	</h1>
	<%
	}
	%>
	<%
	if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<h1 style="color: red">
		<%=errMsg%>
	</h1>
	<%
	}
	%>

	<br>
	<br>
	<form action="./delete" method="post">
		<input type="number" placeholder="enter the id" name="empId">
		<br> <br> <input type="submit" value="Delete">
	</form>
</body>
</html>