<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex2_form</title>
</head>
<body>
<!-- <form action ="http://localhost:8085/jsp_exam/implicit/ex2_result.jsp">  절대경로 (서버가 다르면 절대경로를 사용해야한다) -->
	<!--http://localhost:8085/jsp_exam/implicit/ex2_result.jsp?id=admin&pw=1234 ?기준으로 구분하여 나눈다  -->
	<form action ="ex2_result.jsp"><!-- 상대경로 -->
	

		<input type="text" placeholder="아이디" name="id"><br><!-- name은 변수명을 지정한다 하지않으면 데이터 전달이 안된다-->
		<input type="password" placeholder="비밀번호"name="pw"/><br>
		<input type="submit" value="로그인"/><!-- form태그와 함께 작성되어야한다 -->
		<input type="button" value="취소" onclick="javascript:location.href='ex1.jsp'"/>
		<input type="reset" value="지우기"/>
		
	</form>
	
</body>
</html>