<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	<s:form action="register" method="post" modelAttribute="reg">
		Enter your Name: <s:input path="uname"/><s:errors path="uname"/><br/>
		Enter your Email: <s:input path="email"/><s:errors path="email"/><br/>
		Enter your Password: <s:password path="pass"/><s:errors path="pass"/><br/>
		Repeat your Password: <s:password path="rpass"/><s:errors path="rpass"/><br/>
		<br/>
		<input type="submit"/>
	</s:form>
</body>
</html>