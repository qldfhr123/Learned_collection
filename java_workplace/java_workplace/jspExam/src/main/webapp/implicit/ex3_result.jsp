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
		//post는 한글은 깨진다
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		String [] likes = request.getParameterValues("like");
		
		out.print("이름 : " +name+"<br>");
		out.print("주소 : " +address+"<br>");
		for(String like : likes)
		
			out.print("좋아하는것 : " +like+"<br>");
	%>

</body>
</html>