<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listdo productos</title>
</head>
<body>
	<table border="1">
		<tr align="center">
			<td colspan="3">Listado productos</td>
		</tr>
		<tr>
			<td>Producto</td>
			<td>Precio</td>
			<td>Opciones</td>
		</tr>
		<c:forEach var="p" items="${listado}">
			<tr>
				<td><c:out value="${p.product_name}"/></td>
				<td align="right"><c:out value="${p.price}"/></td>
				<td>
					<a href="<c:url value="/productEdit?id=${p.id}"/>">Edit</a>
					<a href="<c:url value="/productRemove?id=${p.id}"/>">Remove</a>
				</td>
			</tr>
		</c:forEach>
		<tr align="center">
			<td colspan="3"><a href="<c:url value="/productAdd"/>">Añadir producto</a></td>
		</tr>
	</table>
</body>
</html>