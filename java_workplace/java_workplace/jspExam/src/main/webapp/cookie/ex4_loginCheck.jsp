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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String remember = request.getParameter("remember");
		System.out.println("remember : " + remember);
		
		if(remember != null && remember.equals("true")){ //아이디 기억하기 체크박스에 체크를 함
			if("admin".equals(id) && "1234".equals(pw)){
				Cookie cookie = new Cookie("userId", "admin");
				response.addCookie(cookie);
			}
		}
		else{
			Cookie cookie = new Cookie("userId", "admin");
			cookie.setMaxAge(0); //0으로 하면 삭제 할수있다
			response.addCookie(cookie);
		}
		response.sendRedirect("ex4_login.jsp");
	%>
</body>
</html>
	