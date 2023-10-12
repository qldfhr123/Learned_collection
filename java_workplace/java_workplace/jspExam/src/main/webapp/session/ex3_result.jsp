<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex3_result</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		out.print("아이디 : "+session.getAttribute("id"));
		String [] likes = (String[])session.getAttribute("likes");
		out.print("취미 : ");
		for(String like : likes){
			out.print(like+ " ");
		}
		out.print("<br>");
	%>

</body>
</html>