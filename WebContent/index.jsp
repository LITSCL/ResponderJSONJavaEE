<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Utilizar Insomnia o Postman y hacer una petición asincrona a: http://localhost:8080/ResponderJSON/ResponderJSON.  -->
<%
response.sendRedirect(request.getContextPath() + "/ResponderJSON");
%>
</body>
</html>