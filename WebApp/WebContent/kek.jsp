<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ page import ="by.demo.*" %>
<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <br>
   <table border = "1px">
     <tr>
        <th>Name</th>
        <th>Age</th>
     
     </tr>
   
   
    
     <%
     Map<String,Integer> persons = (Map<String,Integer>)request.getAttribute("person");
     for(Map.Entry<String, Integer> entry : persons.entrySet()){
	   out.println("<tr><td>"+entry.getKey()+"</td><td>"+entry.getValue()+"</tr></tr>");
    }
   %>
   </table>
</body>
</html>