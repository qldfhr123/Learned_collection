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
		session.setAttribute("id", "admin");
		session.setAttribute("likes", new String []{"집에 있기","잠 많이 자기"});
		
		//가져오는값은 object값이라 String 으로 변환해줘야한다
		String id = (String)session.getAttribute("id"); 
		String [] likes = (String[])session.getAttribute("likes");
		
		//기본값 : 1800초
		session.setMaxInactiveInterval(60);
		
		//매개변수에 넣어준 속성 삭제
		session.removeAttribute("id");
		
		//세션 (하나의 클라이언트 속성 정보)삭제
		session.invalidate();
	%>

</body>
</html>