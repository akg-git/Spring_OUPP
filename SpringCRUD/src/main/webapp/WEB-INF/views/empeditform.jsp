<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="gov.edu.oupp.java.spring.model.Emp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Edit Form</title>
</head>
<body>
	
	<h1><u>Employee Edit Employee</u></h1>  
       <form method="POST" action="/SpringCRUD/editsave">    
        <table>    
        
         <%
         	Emp emp = (Emp) request.getAttribute("command");
         	
         	if(emp!=null){
         %>
        	
        <tr>  
        <td></td>    
         <td><input type="hidden" name="id" value="<%= emp.getId() %>" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><input type="text" name="name" value="<%= emp.getName() %>" /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><input type="text" name="salary" value="<%= emp.getSalary() %>" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><input type="text" name="designation" value="<%= emp.getDesignation() %>" /></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
         
        <%
        	}
        %>
         
        </table>    
       </form>

</body>
</html>