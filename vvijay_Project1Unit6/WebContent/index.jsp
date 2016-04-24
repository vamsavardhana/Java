<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CAR CONFIGURATION APPLICATION</title>
</head>
<body>
<form method="post">
<table style="width:100%" border="1">
  <tr>
    <td>Car </td>
    <td><select name="NAME">
  <option value="Ford"><%=request.getAttribute("t30")%></option>
  <option value="Toyota"><%=request.getAttribute("t31")%></option>
  <option value="tesla"><%=request.getAttribute("t32")%></option>
</select></td>
  <tr>
    <td>Transmission</td>
    <td><select name="TRANS">
  <option value="automatic"><%=request.getAttribute("t1")%></option>
  <option value="standard"><%=request.getAttribute("t2")%></option>
</select>
    </td> 
  </tr>
  <tr>
    <td>Brakes</td>
    <td><select name="BRAKE">
  <option value="Standard"><%=request.getAttribute("t3")%></option>
  <option value="ABS"><%=request.getAttribute("t4")%></option>
  <option value="ABS with Advance Trac"><%=request.getAttribute("t5")%></option>
</select></td> 
  </tr>
    <tr>
    <td>Side Impact Air Bags</td>
    <td><select name="SIAB">
  <option value="selected"><%=request.getAttribute("t6")%></option>
  <option value="none"><%=request.getAttribute("t7")%></option>
</select></td> 
  </tr>
    <tr>
    <td>Power Moonroof</td>
    <td><select name="PM">
  <option value="selected"><%=request.getAttribute("t8")%></option>
  <option value="none"><%=request.getAttribute("t9")%></option>
</select></td> 
  </tr>
	<tr>
    <td>Color</td>
    <td><select name="COLOR">
  <option value="Fort Knox Gold Clearcoat Metallic"><%=request.getAttribute("t10")%></option>
  <option value="Liquid Grey Clearcoat Metallic"><%=request.getAttribute("t11")%></option>
  <option value="Infra-Red Clearcoat"><%=request.getAttribute("t12")%></option>
  <option value="Grabber Green Clearcoat Metallic"><%=request.getAttribute("t13")%></option>
  <option value="Sangria Red Clearcoat Metallic"><%=request.getAttribute("t14")%></option>
  <option value="French Blue Clearcoat Metallic"><%=request.getAttribute("t15")%></option>
  <option value="Twilight Blue Clearcoat Metallic"><%=request.getAttribute("t16")%></option>
  <option value="CD Silver Clearcoat Metallic"><%=request.getAttribute("t17")%></option>
  <option value="Pitch Black Clearcoat"><%=request.getAttribute("t18")%></option>
  <option value="Cloud 9 White Clearcoat"><%=request.getAttribute("t19")%></option>
  	</select></td> 
  </tr>
</table>
<input type="submit" value="submit"/>
</form></body>
</html>