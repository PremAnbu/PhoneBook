<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add user Details</title>
</head>
<body>

	<f:form modelAttribute="user" action="add-user" method="post">
		<f:input path="userName" />
		<f:input path="email" />
		<f:input path="password" />
		<input type="submit" value="save">
	</f:form>

</body>
</html>