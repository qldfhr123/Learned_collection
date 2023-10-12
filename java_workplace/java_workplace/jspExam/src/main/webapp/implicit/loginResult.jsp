<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginResult</title>
</head>
<body>

		<%
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			if(id.isEmpty() || pw.isEmpty()){
				response.sendRedirect("loginForm.jsp");
			}
			else if("admin".equals(id) && "1234".equals(pw)){
				response.sendRedirect("loginIndex.jsp");
			}
			else{
				response.sendRedirect("loginFailed.jsp");
			}
		%>


</body>
</html>