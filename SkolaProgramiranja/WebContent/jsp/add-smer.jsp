<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Smer</title>

<link type="text/css" rel="stylesheet" href="../css/style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Add Smer</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add Smer</h3>

		<form action="../AddSmerController" method="post">


			<table border="1">
				<tbody>
					<tr>
						<td><label>Naziv smera:</label></td>
						<td><input type="text" required="required" name="smerName" /></td>
					</tr>
					<tr>
						<td><label>Sifra smera:</label></td>
						<td><input type="text" required="required" name="sifraSmera" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>

		</form>
		
		<br>
	
	<input type="button" value="Back"
			onclick="window.location.href='admin.jsp'"
			class="add-student-button " />
	</div>		

</body>
</html>