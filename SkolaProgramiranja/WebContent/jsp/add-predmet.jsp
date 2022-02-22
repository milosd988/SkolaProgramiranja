<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Predmet</title>

<link type="text/css" rel="stylesheet" href="../css/style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Add Predmet</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add Predmet</h3>

		<form action="../AddPredmetController" method="post">


			<table border="1">
				<tbody>
					<tr>
						<td><label>Naziv predmeta:</label></td>
						<td><input type="text" required="required" name="nazivPredmeta" /></td>
					</tr>
					<tr>
						<td><label>Sifra predmeta:</label></td>
						<td><input type="text" required="required" name="sifraPredmeta" /></td>
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