<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex2_make</title>
<style>
	a{
		text-decoration:none;
		color:black;
		
	}
</style>
</head>
<body>

	<%
	session.setAttribute("id", "admin");
	session.setAttribute("likes", new String []{"집에 있기","잠 많이 자기"});

	%>
	
	<a href="ex3_reslit.jsp">세션 확인하기</a>
</body>
</html>