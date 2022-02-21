<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Admin</title>
<link type="text/css" rel="stylesheet" href="../css/style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Add Admin</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add Student</h3>

		<form action="../AddAdminController" method="get">


			<table border="1">
				<tbody>
					<tr>
						<td><label>UserName:</label></td>
						<td><input type="text" name="username" /></td>
					</tr>
					<tr>
						<td><label>Password:</label></td>
						<td><input type="password" name="password" /></td>
					</tr>
					<tr>
						<td><label>First name:</label></td>
						<td><input type="text" name="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><input type="text" name="lastName" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><input type="email" name="email" /></td>
					</tr>
					<tr>
						<td><label>Phone number:</label></td>
						<td><input type="text" name="phoneNumber" /></td>
					</tr>
					<tr>
						<td><label>Country:</label></td>
						<td><input type="text" name="country" /></td>
					</tr>
					<tr>
						<td><label>City:</label></td>
						<td><input type="text" name="city" /></td>
					</tr>
					<tr>
						<td><label>Address:</label></td>
						<td><input type="text" name="street" /></td>
					</tr>
					<tr>
						<td><label>Identification number:</label></td>
						<td><input type="text" name="idNumber" /></td>
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