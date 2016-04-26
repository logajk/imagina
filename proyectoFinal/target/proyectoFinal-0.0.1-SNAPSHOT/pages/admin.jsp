<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>
	<h1>Título : ${title}</h1>
	<h2>Mensaje : ${message}</h2>
	
	<h2>Roles disponbiles: </h2>
	
	<table border="1px solid black">
		<thead>
			<tr>
				<th>Perfil</th>
				<th>Descipción</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="rol" items="${listadoRol}">
				<tr>
					<td><c:out value="${rol.authority}"/></td>
					<td><c:out value="${rol.description}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<h2>Links</h2>
	<a href="<c:url value="/admin/config"/>">Configuración</a>
	
	
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>Bienvenido : ${pageContext.request.userPrincipal.name}</h2>
		<br>
		<form action="<c:url value="/logout"/>" method="post">
			<input type="submit" value="logout">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		</form>
	</c:if>
</body>
</html>