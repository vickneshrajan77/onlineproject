<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="html4.css">
</head>
<body>
<div class="heading">
<h1 id="tre"> Nova.in</h1>
<br>
</div>
<h1 style="margin-left: 13em; color: blue;">your wish lists are listed below</h1>

<h4 style="margin-left: 10em; color: blue;">MODEL| VARIENT_COLOR|DISCOUNTED PRICE(RS)</h4>
<span style="margin-left: 10em;">
<% session = request.getSession();

out.println( session.getAttribute("al")); %>
</body>
</html>