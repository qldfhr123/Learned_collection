<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex5_A</title>
</head>
<body>

		<%
			//URL 바뀌지않는다 => URL 변경시 요청이 있었다
			//
			request.getRequestDispatcher("ex5_B.jsp").forward(request,response);
		%>

</body>
</html>