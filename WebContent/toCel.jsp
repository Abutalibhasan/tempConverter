<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor ="LightGray">

<h2 align ="center">Convert from Fahrenheit to Celsius</h2>
<center>
<form action="getCelServlet" method = "post">
  <label for="c"><b>Temprature in Fahrenheit:</b></label>
  <input type="text" name="Fahrenheit" ><br><br>
  <input type="submit" value="Convert">
  <input type="reset" value="Clear">
</form> 
<h3 align ="center"><a href="index.jsp"><b>Home</b></a></h3>
</center>

</body>
</html>