<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

	<%
		String email = (String)request.getAttribute("email");
		String username = (String)request.getAttribute("username");
		String password = (String)request.getAttribute("password");
	%>
	
	<p>
		Hi, <%=username %>!!<br>
		Your registration is successfull.
		Verify your email address. An OTP is sent to the <%=email %>.
	</p>

</body>
</html>