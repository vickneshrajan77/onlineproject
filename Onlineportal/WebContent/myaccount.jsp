 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="bn.css">
<title>myaccount</title>
</head>
<body>
<div class="heading">
<h1 id="tre"> Nova.in</h1>
<br>
</div>

<img alt="clip" src=".\pictures\clip.jpeg" class="avat">

<table style=" margin-left: 350px;">
<tr>
<td >First Name</td>
<td>
<% 
out.println(session.getAttribute("a4")); 
%>
</td>
</tr>
<tr>
<td>Last name</td>
<td>
<% 
out.println(session.getAttribute("b4")); 
%>
</td>
</tr>
<tr>
<td>D.O.B</td>
<td>
<% 
out.println(session.getAttribute("c4")); 
%>
</td>
</tr>
<tr>
<td>e-Mail</td>
<td>
<% 
out.println(session.getAttribute("d4")); 
%>
</td>
</tr>
<tr>
<td>phone no</td>
<td>
<% 
out.println(session.getAttribute("e4")); 
%>
</td>
</tr>
</table>
</body>
</html>