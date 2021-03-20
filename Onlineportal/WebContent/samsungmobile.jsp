<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="sm.css">
<title>samsung</title>
</head>
<body>
<div class="heading">
<h1 id="tre"> Nova.in</h1>
<br>
</div>
<br>
<br>
<img style="width: 500px; height: 500px; margin-top: 80px;margin-left: 200px;"  alt=" sam 20" src="./pictures/sg20b.jpg">
<h1 style="margin-left: 350px;color: blue; font: 2em;margin-top: 50px;"> Details of the product</h1>
<table style="margin-left: 250px; margin-top: 10px;">
<tr>
<td style="color:fuchsia;"> NAME:</td>
<td>
<%

  out.println(session.getAttribute("a"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">VARIENT_COLOR</td>
<td>
<% 
out.println(session.getAttribute("b"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">PRICE</td>
<td>
<% 
out.println(session.getAttribute("c"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">DISCOUNT</td>
<td>
<% 
out.println(session.getAttribute("d"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">DISCOUNTED_PRICE</td>
<td>
<% 
out.println(session.getAttribute("e"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">RATING</td>
<td>
<% 
out.println(session.getAttribute("f"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">COLOR</td>
<td>
<% 
out.println(session.getAttribute("g"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">RAM</td>
<td>
<% 
out.println(session.getAttribute("h"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">STORAGE</td>
<td>
<% 
out.println(session.getAttribute("i"));
%>
</td>
</tr>
>
<tr>
<td style="color:fuchsia;">CAMERA</td>
<td>
<%
out.println(session.getAttribute("j"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">BATTERY</td>
<td>
<% 
out.println(session.getAttribute("k"));
%>
</td>
</tr>
</table>
<br>
<br>
<table>
<tr>
<td>
<form action="AA">
<button style="padding:10px; width: 100px;height:50px; margin-left: 200px;">ADD TO WISHLIST</button>
</form>
</td>
<td>
<form action="A">
<button style="background-color: orange;width: 100px;height:50px; margin-left: 200px;"> BUY NOW </button>
</form>
</td>
</tr>
</table>
<img style="width: 500px; height: 500px; margin-top: 80px;margin-left: 200px;"  alt=" sam 20" src="./pictures/sgn10.jpg">
<h1 style="margin-left: 350px;color: blue; font: 2em;margin-top: 50px;"> Details of the product</h1>
<table style="margin-left: 250px; margin-top: 10px;">
<tr>
<td style="color:fuchsia;"> NAME:</td>
<td>
<%

  out.println(session.getAttribute("a1"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">VARIENT_COLOR</td>
<td>
<% 
out.println(session.getAttribute("b1"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">PRICE</td>
<td>
<% 
out.println(session.getAttribute("c1"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">DISCOUNT</td>
<td>
<% 
out.println(session.getAttribute("d1"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">DISCOUNTED_PRICE</td>
<td>
<% 
out.println(session.getAttribute("e1"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">RATING</td>
<td>
<% 
out.println(session.getAttribute("f1"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">COLOR</td>
<td>
<% 
out.println(session.getAttribute("g1"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">RAM</td>
<td>
<% 
out.println(session.getAttribute("h1"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">STORAGE</td>
<td>
<% 
out.println(session.getAttribute("i1"));
%>
</td>
</tr>
>
<tr>
<td style="color:fuchsia;">CAMERA</td>
<td>
<%
out.println(session.getAttribute("j1"));
%>
</td>
</tr>

<tr>
<td style="color:fuchsia;">BATTERY</td>
<td>
<% 
out.println(session.getAttribute("k1"));
%>
</td>
</tr>
</table>
<br>
<br>
<table>
<tr>
<td>
<form action="BB">
<button style="padding:10px; width: 100px;height:50px; margin-left: 200px;">ADD TO WISHLIST</button>
</form>
</td>
<td>
<form action="B">
<button style="background-color: orange;width: 100px;height:50px; margin-left: 200px;"> BUY NOW </button>
</form>
</td>
</tr>
</table>
</body>
</html>