<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualización de producto</title>
</head>
<body>
<table border="1">
	<tr align="center">
		<td colspan="2">Producto</td>
	</tr>
	<c:url var="post_url" value="/productAddNew"/>
	
	<form:form action="${post_url}" method="post" modelAttribute="producto">
		<tr>
			<td>Nombre: </td>
			<td><input type="text" name="product_name"></td>
		</tr>
		<tr>
			<td>Precio: </td>
			<td><input type="text" name="price"></td>
		</tr>
		<tr align="center">
			<td colspan="2">
				<input type="submit" value="Enviar">
			</td>
		</tr>
	</form:form>
</table>
</body>
</html>