<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add student</title>

<link type="text/css" rel="stylesheet" href="../css/style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Add Student</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add Student</h3>

		<form action="#" method="get">


			<table>
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
						<td><label>Index:</label></td>
						<td><input type="text" name="brojIndexa" /></td>
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