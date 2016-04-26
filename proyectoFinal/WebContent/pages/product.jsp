<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>
<%-- 	<fmt:setLocale value="es_ES"/> --%>
	<h1>Título: ${title}</h1>
	<h2>Mensaje: ${message}</h2>
	
	<h2>Producto del més</h2>
	<table border="1px solid black">
		<thead>
			<tr>
				<th>Produto</th>
				<th>Precio</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><c:out value="${producto.product_name}"/></td>
				<td><fmt:formatNumber type="number" value="${producto.price}" minFractionDigits="2" maxFractionDigits="2"/>&nbsp;&euro;</td>
			</tr>
		</tbody>
	</table>
	<h2>Links</h2>
	<a href="<c:url value="/welcome"/>">Inicio</a>
</body>
</html>