<%@page import="java.util.*"%>

<html>
<title>Home Page</title>
<body>

<h2>This is our home page</h2>
<h2>Called by Home controller</h2>
<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");

	List<String> friends=(List<String>)request.getAttribute("friends");
%>
<h1>Name is <%=name %></h1>
<h1>Id is <%=id %></h1>
<%

for(String s: friends)
{
	out.println(s);
	
}

%>
</body>
</html>
