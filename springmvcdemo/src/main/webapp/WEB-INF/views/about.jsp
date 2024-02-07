<%@ page import = "java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About Page</title>
</head>
<body>
	<h2>This is a Java Full-Stack program conducted by Skill Development, Odisha.</h2>
	
	<%
		String s  = (String)request.getAttribute("about");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time");
	%>
	<p>This page is about: <%= s%></p>
	<p>TimeStamp: <%= time%></p>
	
</body>
</html>