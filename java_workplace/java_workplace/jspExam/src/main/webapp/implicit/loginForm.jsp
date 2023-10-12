<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
</head>
<body>


	<!-- 아이디 패스워드 데이터가 없으면 loginForm.jsp 이동 -->
	<!-- 아이디 패스워드 가 틀리면 loginFailed.jsp이동 -->
	<!-- 아이디 패스워드 가 맞으면 loginIndex.jsp이동 -->

	<form action ="loginResult.jsp" method="post"> 
		<input type="text" placeholder="아이디" name = "id"/>
		<input type="password" placeholder="비밀번호" name = "pw"/>
		<br><br>
		
		
		<input type="submit" value="확인"/>
		<input type="reset" value="초기화"/>
		
	</form>



</body>
</html>