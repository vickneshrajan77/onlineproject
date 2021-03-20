<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="vm.css">
<title>Insert title here</title>
</head>
<body>
<div class="heading">
<h1 id="tre"> Nova.in</h1>
<br>
</div>
<br>
<br>
<img style="width: 500px; height: 500px; margin-top: 80px;margin-left: 200px;"  alt=" sam 20" src="./pictures/vivo1.jpg">
<h1 style="margin-left: 350px;color: blue; font: 2em;margin-top: 50px;"> Details of the product</h1>
<table style="margin-left: 250px; margin-top: 10px;">
<tr>
<td style="color:fuchsia;"> NAME:</td>
<td>
<%

  out.println(session.getAttribute("a2"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">VARIENT_COLOR</td>
<td>
<% 
out.println(session.getAttribute("b2"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">PRICE</td>
<td>
<% 
out.println(session.getAttribute("c2"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">DISCOUNT</td>
<td>
<% 
out.println(session.getAttribute("d2"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">DISCOUNTED_PRICE</td>
<td>
<% 
out.println(session.getAttribute("e2"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">RATING</td>
<td>
<% 
out.println(session.getAttribute("f2"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">COLOR</td>
<td>
<% 
out.println(session.getAttribute("g2"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">RAM</td>
<td>
<% 
out.println(session.getAttribute("h2"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">STORAGE</td>
<td>
<% 
out.println(session.getAttribute("i2"));
%>
</td>
</tr>
>
<tr>
<td style="color:fuchsia;">CAMERA</td>
<td>
<%
out.println(session.getAttribute("j2"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">BATTERY</td>
<td>
<% 
out.println(session.getAttribute("k2"));
%>
</td>
</tr>
</table>
<br>
<br>
<table>
<tr>
<td>
<form action="CC">
<button style="padding:10px; width: 100px;height:50px; margin-left: 200px;">ADD TO WISHLIST</button>
</form>
</td>
<td>
<form action="C">
<button style="background-color: orange;width: 100px;height:50px; margin-left: 200px;"> BUY NOW </button>
</form>
</td>
</tr>
</table>
<img style="width: 500px; height: 500px; margin-top: 80px;margin-left: 200px;"  alt=" sam 20" src="./pictures/vivo2.jpg">
<h1 style="margin-left: 350px;color: blue; font: 2em;margin-top: 50px;"> Details of the product</h1>
<table style="margin-left: 250px; margin-top: 10px;">
<tr>
<td style="color:fuchsia;"> NAME:</td>
<td>
<%

  out.println(session.getAttribute("a3"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">VARIENT_COLOR</td>
<td>
<% 
out.println(session.getAttribute("b3"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">PRICE</td>
<td>
<% 
out.println(session.getAttribute("c3"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">DISCOUNT</td>
<td>
<% 
out.println(session.getAttribute("d3"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">DISCOUNTED_PRICE</td>
<td>
<% 
out.println(session.getAttribute("e3"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">RATING</td>
<td>
<% 
out.println(session.getAttribute("f3"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">COLOR</td>
<td>
<% 
out.println(session.getAttribute("g3"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">RAM</td>
<td>
<% 
out.println(session.getAttribute("h3"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">STORAGE</td>
<td>
<% 
out.println(session.getAttribute("i3"));
%>
</td>
</tr>
>
<tr>
<td style="color:fuchsia;">CAMERA</td>
<td>
<%
out.println(session.getAttribute("j3"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">BATTERY</td>
<td>
<% 
out.println(session.getAttribute("k3"));
%>
</td>
</tr>
</table>
<br>
<br>
<table>
<tr>
<td>
<form action="DDD">
<button style="padding:10px; width: 100px;height:50px; margin-left: 200px;">ADD TO WISHLIST</button>
</form>
</td>
<td>
<form action="D">
<button style="background-color: orange;width: 100px;height:50px; margin-left: 200px;"> BUY NOW </button>
</form>
</td>
</tr>
</table>
</body>
</html>