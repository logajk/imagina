<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>
	<h1>Título : ${title}</h1>
	<h2>Mensaje : ${message} - Hoy es: ${fechaActual}</h1>
	<br>
	<h2>Links</h2>
	<table width="50%">
		<tr>
			<td><a href="<c:url value="/admin"/>">Administración</a></td>
			<td><a href="<c:url value="/articulos"/>">Artículos</a></td>
			<td><a href="<c:url value="/galeriaImagenes"/>">Galería</a></td>
		</tr>
	</table>
	<c:if test="${listadoNovedades != null}">
		<h2>Novedades</h2>
		<ul>
			<c:forEach var="novedad" items="${listadoNovedades}">
				<li><c:out value="${novedad.message}"/></li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>