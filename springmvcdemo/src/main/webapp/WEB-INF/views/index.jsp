<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h2>Lets learn Spring MVC</h2>
	
	
	<%
	 	String name = (String)request.getAttribute("name");
	 	Integer id = (Integer)request.getAttribute("id");
	 	
	%>
	
	<h2> The brand is: <%= name %> </h2>
	<h2> The company Name is: <%= id %> </h2>
	
	<%
		List<String> biscuits = (List<String>) request.getAttribute("biscuits");
		for(String s: biscuits){
			out.println(s+"\n");
		}
	%>
	
</body>
</html>


