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
	<h1>T�tulo : ${title}</h1>
	<h1>Mensaje : ${message}</h1>
	
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>Welcome : ${pageContext.request.userPrincipal.name} | <a href='<c:url value="/logout"/>'> Logout</a></h2>
		<br>
		<form action="<c:url value="/logout"/>" method="post">
			<input type="submit" value="logout">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		</form>
	</c:if>
</body>
</html>