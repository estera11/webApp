<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Customer</title>
</head>
<body>
<div style="padding-left:50px;font-family:monospace;">
        <h2>Register Customer</h2>
        <form action="http://localhost:8080/WebAppAssignment/restful-services/service/regCustomer" method="POST">
            <div style="width: 100px; text-align:left;">
                <div style="padding:15px;">
                    Username: <input name="name" />
                </div>
                <div style="padding:10px;">
                    Password: <input name="password" />
                </div>
                <div style="padding:10px;">
                    Payment Method: <input name="payMethod" />
                </div>
                  <div style="padding:10px;">
                    Shipping Address: <input name="address" />
                </div>
                <div style="padding:20px;text-align:center">
                    <input type="submit" value="Submit" />
                </div>
            </div>
        </form>
    </div>
</body>
</html>
