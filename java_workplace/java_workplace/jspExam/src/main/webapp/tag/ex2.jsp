<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex2</title>
</head>
<body>

	<% 
		String name = "홍길동";
	%>
	
	<h1>이름은 <%=10+20 %></h1>
	<%--	;붙지않는다 --%>
	<h1>이름은 <% out.print(name); %>입니다</h1>
</body>
</html>