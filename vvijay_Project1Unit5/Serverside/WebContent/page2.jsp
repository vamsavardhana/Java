<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CAR CONFIGURATION APPLICATION</title>
</head>
<body>
Here is what you selected:
<table style="width:100%" border="1">
  <tr>
    <td>Car </td>
    <td><%=request.getParameter("NAME") %></td>
    <td><%=request.getAttribute("bprice") %></td>
  <tr>
    <td>Transmission selected</td>
    <td><%=request.getParameter("TRANS") %></td> 
    <td><%=request.getAttribute("transprice") %></td>     
  </tr>
  <tr>
    <td>Brakes</td>
    <td><%=request.getParameter("BRAKE") %></td>
    	<td><%=request.getAttribute("brakeprice") %></td>
  </tr>
    <tr>
    <td>Side Impact Air Bags</td>
	<td><%=request.getParameter("SIAB") %></td>
	<td><%=request.getAttribute("siabprice") %></td>
  </tr>
    <tr>
    <td>Power Moonroof</td>
	<td><%=request.getParameter("PM") %></td>
	<td><%=request.getAttribute("pmprice") %></td>
  </tr>
	<tr>
    <td>Color</td>
    <td><%=request.getParameter("COLOR") %></td>
    <td><%=0 %></td>
  </tr>
  <td>total cost</td>
    <td></td>
  	<td><%=request.getAttribute("totalprice")%></td></tr>
</table>
</body>
</html>