<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Stock Items</title>
</head>
<body>
 <table style="text-align:center">
            <thead>
                <tr>
                    <th style="padding: 5px"> Item Name </th>
                    <th style="padding: 5px"> Manufacturer </th>
                    <th style="padding: 5px" > No. of items in stock </th>
                    <th style="padding: 5px" > Price </th>
                </tr>
            </thead>
            <tbody>
                    <tr>
                        <td><c:out value="${sItem.title}"/></td>
                        <td><c:out value="${sItem.manufacturer}"/></td>
                        <td><c:out value="${sItem.stockLevel}"/></td>
                        <td><c:out value="${sItem.price}"/></td>
                       <%-- <td><img src="data:image/jpg;base64,${sItem.image}" width="240" height="300"/></td>--%> 
                        
                    </tr>
              
            </tbody>
        </table>
 <a href="StockServlet">Browse items</a>
  <form action= "http://localhost:8080/WebAppAsignment/restful-services/service/getNext" method="GET">
        
        <input type="submit" value="Next Item">
    </form>
    
 <form action= "http://localhost:8080/WebAppAsignment/restful-services/service/getPrevious" method="GET">
        
        <input type="submit" value="Previous Item">
    </form>
</body>
</html>