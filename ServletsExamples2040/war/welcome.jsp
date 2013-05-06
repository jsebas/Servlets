<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome <%=session.getAttribute("username")%></h1>
	</body>
</html>