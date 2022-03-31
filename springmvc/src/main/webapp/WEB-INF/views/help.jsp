<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.time.*"%>
    <%@ page isELIgnored="false"%> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is help page</title>
<h1> Hello, Please help me </h1>
 <%/* 
String s=(String)request.getAttribute("help");
String name=(String)request.getAttribute("name");
LocalDateTime date=(LocalDateTime)request.getAttribute("date");
*/%>
<h1> ${help}</h1>
<h1>  ${name}</h1>
<h1> the time is
 ${date}

</h1>
<hr>
<c:forEach var="item" items="${friends }" >
<!--  <h1>${item} </h1>-->
<c:out value="${item }"></c:out>

</c:forEach>


</head>
<body>

</body>
</html>