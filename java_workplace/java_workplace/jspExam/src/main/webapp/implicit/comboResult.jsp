<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>comboResult</title>
</head>
<body>

	
	<%
			String location = request.getParameter("srh");
			response.sendRedirect(location);
	%>
	

</body>
</html>