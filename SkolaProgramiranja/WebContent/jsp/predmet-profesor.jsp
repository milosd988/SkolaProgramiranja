<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page import="model.Profesor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Predmet - Profesor</title>

<link type="text/css" rel="stylesheet" href="../css/style.css">

</head>
<body>

	<jsp:useBean id="predmeti" scope="request" class="java.util.ArrayList"></jsp:useBean>
	<jsp:useBean id="profesor" scope="request" class="model.Profesor"></jsp:useBean>
	
	<h1>Predmeti profesora</h1>
	
	<p>Dobrodosli profesore: ${profesor.firstName} ${profesor.lastName}</p>
	
	<input type="button" value="Profesor List"
			onclick="window.location.href='ProfessorListController'"
			class="add-student-button " />

</body>
</html>