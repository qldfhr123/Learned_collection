<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex4_login</title>
</head>
<body>

 <%
 	//쿠키를 생성
 	Cookie[] cookies = request.getCookies();
 	String id = "";
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("userId")){
			id = cookie.getValue(); //아이디를 쿠기의 값으로 변경
		}
	}
 %>
	<form action="ex4_loginCheck.jsp" method="get">
		<input type="text" placeholder="아이디" name="id" value="<%=id%>"> <br>
		<input type="password" placeholder="비밀번호" name="pw" ><br> 
		<% 
		if(id.isEmpty()){
			out.print("<input type='checkbox' name='remember' value='true' />아이디 기억하기");
			// 구분하지 않고 이렇게 작성할수있다
		}
		else{
		%>
			<input type="checkbox" name="remember" value="true" checked="checked"/>아이디 기억하기 
		<%
		}
		%>
		<br><input type="submit" value="로그인" >
		<input type="reset" value="취소" >	
	</form>
</body>
</html>

