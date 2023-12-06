<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Utilizar Insomnia o Postman y hacer una petición asincrona a: http://localhost:8080/ResponderJSON/ResponderJSON.  -->
<%
response.sendRedirect(request.getContextPath() + "/ResponderJSON");
%>
</body>
</html>