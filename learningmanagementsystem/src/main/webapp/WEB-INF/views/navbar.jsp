<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
a {
	margin-left: 95px;
	text-decoration: none;
	color: whitesmoke;
	font-size: 20px;
	
}
a:hover{
	color: orange;
}

nav {
	margin-left: 15px; 
	width : 95%;
	box-shadow: 0 0 30px red;
	padding: 10px;
	width: 95%;
	background-color: black;
}
</style>
</head>
<body>
	<nav>
		<a href="./addForm">Add Employee</a> 
		<a href="./updateForm">Update Employee</a> 
		<a href="./deleteForm">Delete Employee</a> 
		<a href="./seeAll">See All Employees</a> 
		<a href="./logout">Logout</a>
	</nav>
</body>
</html>