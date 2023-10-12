<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex2_make</title>
</head>
<body>
	<%
	
		Cookie cookie = new Cookie("cookieName","cookieValue");
		//서버가 클라이언트 (웹브라우저)에게 생성한 쿠키를 전달할수있다
		
		cookie.setMaxAge(30);//쿠키 유효기간 설정
		
		response.addCookie(cookie);
	%>
	<a href="ex2_check.jsp">쿠키확인하기</a>
</body>
</html>