<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>infoResult</title>
</head>
<body>

	<%
		//post는 한글은 깨진다
		request.setCharacterEncoding("UTF-8");
		String Id = request.getParameter("id");
		String Pw = request.getParameter("pw");
		
		String Area = request.getParameter("textArea");
		
		out.print("입력하신 정보는 아래와 같습니다<br>");
		out.print("Id : " +Id+"<br>");
		out.print("Password : " +Pw+"<br>");
		out.print("자기소개 : " +Area+"<br>");
	
	%>
	
	<pre></pre><% // 공백을 유지 할수있다 %>

</body>
</html>