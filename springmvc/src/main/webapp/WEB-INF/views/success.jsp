<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h1>${hdr}</h1>
<h1>welcome ${user.username}</h1>
<h1>The email is ${user.email}</h1>
<h1>Your password is secure ${user.password}</h1>



</body>
</html>