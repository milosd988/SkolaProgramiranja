<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Predmet - Profesor</title>

<link type="text/css" rel="stylesheet" href="../css/style.css">

</head>
<body>
	<h1>Odabir predmeta</h1>
	
	ID profesora je: ${param.idProfesor}
	
	<input type="button" value="Profesor List"
			onclick="window.location.href='../ProfessorListController'"
			class="add-student-button " />

</body>
</html>