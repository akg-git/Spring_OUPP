<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.osdc.model.Emp" %>
<%@page import="java.util.*" %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<thead>
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th></tr> </thead> 
  <tbody>
  <% List<Emp> employeelist=(List<Emp>) request.getAttribute("list");
  if(employeelist!=null){
	  for(Emp emp :employeelist){
  %>
  <tr>
  <td><%=emp.getId() %></td>
  <td><%=emp.getName() %></td>
  <td><%=emp.getSalary() %></td>
  <td><%=emp.getDesignation() %></td>
  <td><a href="editemp/<%=emp.getId()%>">edit</a></td>
  <td><a href="deleteemp/<%=emp.getId() %>">delete</a></td>
  </tr>
  
  <%
	  }
  }
  %>
  
   </table>  
   <br/>  
  


</body>
</html>