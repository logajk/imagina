<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>
	<h1>Título: ${title}</h1>
	<h2>Mensaje: ${message}</h2>
	
	<form action="<c:url value="/admin/config/actualizarMsg"/>" method="post">
		
		<table>
			<tr>
				<td>
					Mensaje
				</td>
				<td>
					<input type="text" name="mensaje" maxlength="100">
				</td>
			</tr>
			<tr>
				<td colspan="1">
					<input type="submit" value="Actualizar">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				</td>
			</tr>
		</table>
	</form>
	<c:if test="${mensajeActalizado == true}">
		<b style="color=blue">
			Mensaje actualizado!!!
		</b>
		<a href="<c:url value="/welcome"/>">Inicio</a>
	</c:if>
</body>
</html>