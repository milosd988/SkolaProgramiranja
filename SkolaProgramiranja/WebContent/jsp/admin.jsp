<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin stranica</title>
</head>
<body>
	<% User user = (User)session.getAttribute("user"); %>
	<h1>Dobrodosli na Administratorsku stranicu</h1>
	<p>Ulogovan je: <%=user.getUsername() %></p>
	
	<table border = 1>
		<tr>
			<th>ID</th>
			<th>Ime</th>
		</tr>
		<%
			for(int i = 1; i <= 10; i++){
		%>
		
			<tr>
				<td><%=i %></td>
				<td>Ime<%=i %></td>
			</tr>
		<% } %>
	</table>
	
</body>
</html>