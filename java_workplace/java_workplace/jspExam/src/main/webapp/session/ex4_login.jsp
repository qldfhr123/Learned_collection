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
 	
 	String save = "";
	save =(String)session.getAttribute("user_id");
	//user_id 이름을 갖고 있는 Attribute이 존재 한다면 값을 반환하고
	//Attribute 존재하지않으면 null
	if(save == null)
		save = " ";
	
 %>
	<form action="ex4_loginCheck.jsp" method="get">
		<input type="text" placeholder="아이디" name="id" value = <%=save %>> <br>
		<input type="password" placeholder="비밀번호" name="pw" ><br> 
		<% 
		if(save.isEmpty()){
			out.print("<input type='checkbox' name='remember' value='true' />아이디 기억하기");
			// 구분하지 않고 이렇게 작성할수있다
		}
		else{
		%>
			<input type="checkbox" name="remember" value="true" checked="checked"/>아이디 기억하기 
		<%
		}
		%>
		<input type="submit" value="로그인" >
		<input type="reset" value="취소" >	
	</form>
</body>
</html>

