<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Liste des Voitures</h1>
<table border="1">
<thead><tr><th>ID</th><th>Marque</th><th>Catégorie</th></thead>
<tbody>
<c:forEach items="${liste }" var="v">
	<tr><td>${v.id }</td><td>${v.marque }</td><td>${v.categorie }</td></tr>
</c:forEach>
</tbody>
</table>
<a href="addContrat">Saisie Contrat</a>
<a href="Contrats">Liste des Contrats</a>
<a href="addClient">Ajouter un Client</a>
</body>
</html>