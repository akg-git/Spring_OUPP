<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="gov.edu.oupp.java.spring.model.Emp" %>
<%@ page import="java.util.*" %>
      

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employee Details</title>
</head>
<body>

	<h1>Employees List</h1>  
	<table border="2" width="70%" cellpadding="2">  
	<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th></tr>  
	  <%--  <c:forEach var="emp" items="${list}">   
	   <tr>  
	   <td>${emp.id}</td>  
	   <td>${emp.name}</td>  
	   <td>${emp.salary}</td>  
	   <td>${emp.designation}</td>  
	   <td><a href="editemp/${emp.id}">Edit</a></td>  
	   <td><a href="deleteemp/${emp.id}">Delete</a></td>  
	   </tr>  
	   </c:forEach>   --%>
	   
	   <% 
	   		List<Emp> employeeList = (List<Emp>) request.getAttribute("list");
	   		if(employeeList != null){
	   			for(Emp emp: employeeList){
	   %>
	   
	   <tr>
	   		<td><%= emp.getId() %></td>
	   		<td><%= emp.getName() %></td>
	   		<td><%= emp.getSalary() %></td>
	   		<td><%= emp.getDesignation() %></td>
	   		
	   		<td><a href="editemp/<%= emp.getId() %>">Edit</a></td>
	   		<td><a href="deleteemp/<%= emp.getId() %>">Delete</a></td>
	   </tr>
	   <%
	   			}
	   		}
	   %>
	   
   </table>  
   <br/>  
   <a href="empform">Add New Employee</a>  

</body>
</html>