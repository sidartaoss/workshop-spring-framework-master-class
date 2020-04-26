<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!!!!!!!! From JSP</title>
</head>
<body>
<%
System.out.println(request.getParameter("name"));
Date date = new Date();
%>
<%--<div>Current date is <%=date%></div>--%>
<%--My name is ${name} and password is ${password}--%>
<%--form action="/login.do" method="post"--%>
<%--form action="/spring-mvc/login" method="post"--%>
<form action="/login" method="post">
<p><font color="red">${errorMessage}</font></p>
Name: <input type="text" name="name"/> Password: <input type="password" name="password"/> <input type="submit"/>
</form>
</body>
</html>