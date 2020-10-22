<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ajouter un contrat</h1>
<form:form method="POST" action ="saveContrat" modelAttribute="c">
	<form:input path="id" type="hidden"/><br>
	CLient : <form:select path="clt.num" itemLabel="nom" itemValue="num" items="${clts}" /><br>
	Voiture <form:select path="vt.id" itemLabel="categorie" itemValue="id" items="${vts}" /><br>
	Debut :<form:input path="debut" type="date" /> <br>
	Fin :<form:input path="fin" type="date" /><br>
	<input type="submit" value="Ajouter" >
</form:form>

</body>
</html>