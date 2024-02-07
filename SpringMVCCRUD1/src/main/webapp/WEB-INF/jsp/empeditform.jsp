<%@page import="com.osdc.model.Emp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Edit Employee</h1>  
       <form method="POST" action="/SpringMVCCRUD1/editsave">  
       <table>
       <%
       Emp emp=(Emp)request.getAttribute("command");
       if(emp!=null){
       
       %>  
       <tr>
       <td></td>
       <td><input type="hidden" name="id" value="<%=emp.getId() %>"/>
       </td>
       </tr>
        <tr>
       <td>Name:</td>
       <td><input type="text" name="name" value="<%=emp.getName() %>"/>
       </td>
       </tr>
        <tr>
       <td>Salary:</td>
       <td><input type="text" name="salary" value="<%=emp.getSalary() %>"/>
       </td>
       </tr>
        <tr>
       <td>Designation:</td>
       <td><input type="text" name="designation" value="<%=emp.getDesignation() %>"/>
       </td>
       </tr>
        <tr>
       <td></td>
       <td><input type="submit" value="Edit save"/>
       </td>
       </tr>
       <%
       }
       %>
       
       

</body>
</html>