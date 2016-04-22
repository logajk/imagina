<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Mensaje: <c:out value="${mensaje}"/></h2>
	<h2>Listado</h2>
	<c:forEach var="usuario" items="${listado}">
		Username: <c:out value="${usuario.username}"/><br>
		Password: <c:out value="${usuario.password}"/><br>
		Enabled: <c:out value="${usuario.enabled}"/><br><br>
	</c:forEach>
</body>
</html>