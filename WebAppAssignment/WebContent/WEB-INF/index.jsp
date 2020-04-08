<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web App</title>
</head>
<body>
    <form action= "http://localhost:8080/resteasy/restful-services/sampleservice/hello" method="GET">
        
        
        <input type="submit" value="Hello World Test">
    </form>
	
	  <form action= "http://localhost:8080/resteasy/restful-services/sampleservice/echo/message" method="GET">
        
        <input type="submit" value="Print Message ">
    </form>

	<form action= "http://localhost:8080/resteasy/restful-services/sampleservice/employees" method="GET">  
        <input type="submit" value="View All Employees">
    </form>
	
	<form action= "http://localhost:8080/resteasy/restful-services/sampleservice/json/employees" method="GET">  
        <input type="submit" value="View JSON All Employee ">
    </form>
	
	<form action= "http://localhost:8080/resteasy/restful-services/sampleservice/json/employee/1" method="GET">  
        <input type="submit" value="View JSON Employee 1">
    </form>
	
</body>
</html>