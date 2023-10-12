<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/session_quiz/header.jsp" %>
<%

	String id = (String)session.getAttribute("id");
	if(id == null){
		response.sendRedirect("login.jsp");
		return;
	}

%>
<div align="center">
	<h1>회원 탈퇴</h1>
	<table ><tr><td>
	<form action="deleteService.jsp" method="post">
			<input type="text" value="<%=id%>" readonly="readonly"> <br>
			<input type="password" placeholder="비밀번호" name="pw"><br>
			<input type="password" placeholder="비밀번호 확인" name="confirmPw"><br>
			<input type="submit" value="회원 탈퇴"> 
			<input type="button" value="취소" onclick="location.href='index.jsp'">
	</form>
	</td></tr></table>
</div>

<%@ include file="footer.jsp" %>