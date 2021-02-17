<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>

<p align="center"> <b>The tempreture in Celsius is : ${userTemp.toCelsius()} &degC .</b> <br />
<b> You Entered : ${userTemp.getF()} &degF .</b> <br />

<a href="index.jsp">Home</a>
</p>
</body>
</html>