<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Web App</title>
		<h3>Online food store catalogue<h3>
</head>
<body>
 <div style="padding-left:50px;font-family:monospace;">Choose Registration Option
 <br>
        <a href="${pageContext.request.contextPath}/registerCustomer.jsp"><div style="color:saffron">Register as Customer</div></a>
        <a href="${pageContext.request.contextPath}/registerAdmin.jsp"><div style="color:saffron">Register as Admin</div></a>
</div>
<br>
  <div style="padding-left:50px;font-family:monospace;">Log In 

        <a href="${pageContext.request.contextPath}/login.jsp"><div style="color:saffron">Login</div></a>
</div>   


</body>
</html>