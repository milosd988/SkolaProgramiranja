<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin stranica</title>

<link type="text/css" rel="stylesheet" href="../css/style.css">
</head>
<body>
	
	<jsp:useBean id="user" scope="session" class="model.User"></jsp:useBean>
	<h1>Dobrodosli na Administratorsku stranicu</h1>
	<p>Ulogovan je: ${user.username} </p>
	
	
	<input type="button" value="Logout"
			onclick="window.location.href='logout.jsp'"
			class="logout-button" /> <br><br>
	
	<input type="button" value="Add student"
			onclick="window.location.href='add-student.jsp'"
			class="add-student-button " />		
			
			
	
	
	
</body>
</html>