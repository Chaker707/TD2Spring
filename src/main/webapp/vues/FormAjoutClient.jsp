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
<h1>Ajouter un client</h1>
<form:form method="POST" action="saveClient" modelAttribute="cl">
	<p>Nom : <form:input path="nom"/></p>
	<p>Adresse : <form:input path="adr"/></p>
	<input type="submit" value="Ajouter" >
</form:form>

</body>
</html>