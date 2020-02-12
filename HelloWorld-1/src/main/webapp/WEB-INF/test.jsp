<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fleet Management- Spring Boot Web Application</title>
</head>
<body> 
   <h1 align="center">Fleet List</h1>
   <br/>
   <table border="1" cellpadding="10">
   <tr>
      <th>Fleet_Name</th>
      <th>Fleet_Model</th>
      <th>Fleet_Make</th>
   </tr>
   <c:forEach items="${fleetList}" var="fleet">
     <tr>
        <td>${fleet.fleetName}</td>
        <td>${fleet.fleetModel}</td> 
        <td>${fleet.fleetMake}</td> 
        
      </tr>  
      </c:forEach>  
   </table>
   

</body>
</html>