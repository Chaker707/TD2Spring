<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" >
	<title>Liste des Contrats</title>
</head>
<body>
	<h1>Liste des Contrats </h1>
	<table border=1>
	<thead><tr><th>ID</th><th>Client</th><th>Voiture</th><th>Date_D</th><th>Date_F</th> </tr></thead>
	<c:forEach var="v" items="${liste}">
	    <tr>  
	  		<td>${v.id}</td><td>${v.clt.nom }</td>
	  		<td>${v.vt.marque }/${v.vt.categorie }</td>
	  		<td>${v.debut }</td><td>${v.fin }</td>
	  	</tr>	
	</c:forEach>
	</table>
	<a href="home">Liste des Voitures</a><br>
</body>
</html>