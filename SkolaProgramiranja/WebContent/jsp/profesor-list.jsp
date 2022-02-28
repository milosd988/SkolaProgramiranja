<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page import="java.util.List" %>
<%@ page import="model.ProfesorList" %>
<%@ page import="model.Predmet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profesor List</title>

<link type="text/css" rel="stylesheet" href="css/style.css">

</head>
<body>
	<h1>Profesor List</h1>
	<jsp:useBean id="professorList" scope="request" class="java.util.ArrayList"></jsp:useBean>
	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>USER NAME</th>
			<th>PASSWORD</th>
			<th>FIRST NAME</th>
			<th>LAST NAME</th>
			<th>EMAIL</th>
			<th>MOBILE PHONE</th>
			<th>COUNTRY</th>
			<th>CITY</th>
			<th>STREET</th>
			<th>IDENTIFICATION NO</th>
			<th>PREDMETI</th>
		</tr>		
			
	<c:forEach var="list" items="${professorList}">
		<tr>
				<td>${list.idProfesor}</td>
				<td>${list.userName}</td>
				<td>${list.password}</td>
				<td>${list.firstName}</td>
				<td>${list.lastName}</td>
				<td>${list.email}</td>
				<td>${list.phoneNumber}</td>
				<td>${list.country}</td>
				<td>${list.city}</td>
				<td>${list.address}</td>
				<td>${list.idNumber}</td>
				<td>
					<c:url var = "link" value="PredmetiProfesoriController">
						<c:param name="idProfesor" value="${list.idProfesor}"></c:param>
					</c:url>
					<a href="${link}"><button>PREDMETI PROFESORA</button></a>
				</td>
		</tr>		
	</c:forEach>
	
	
	</table>
	<br><br>
	<input type="button" value="Back"
			onclick="window.location.href='jsp/admin.jsp'"
			class="add-student-button " />

</body>
</html>