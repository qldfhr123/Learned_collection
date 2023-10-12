<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex4_loginCheck</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String id = (String)session.getAttribute("id");
		String pw = (String)session.getAttribute("pw");
		String remember = (String)session.getAttribute("remember");
		
		
		if(remember != null && remember.equals("true")){
			if("admin".equals(id) && "1234".equals(pw)){
					session.setAttribute("user_id", "admin"); 
			}
		}
		else{
			session.removeAttribute("user_id");
		}
		
		out.print("<br>");
		response.sendRedirect("ex4_login.jsp");
	%>
</body>
</html>
	