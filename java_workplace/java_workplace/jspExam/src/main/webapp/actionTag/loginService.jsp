<%@page import="session.MemberDTO"%>
<%@page import="session.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="loginDto" class="actionTag.LoginDTO"></jsp:useBean>
<%--loginDTO.setId(request.getParameter("id")); --%>

<%--jsp:setProperty property="id" name="LoginDto"/>
<jsp:setProperty property="pw" name="LoginDto"/>
 --%>

<jsp:setProperty property="*" name="loginDto"/> <%--입력할 양이 많으면 사용 --%>

<%--loginDto.getId(); 

아이디 :<jsp:setProperty property="id" name="LoginDto"/>
비밀번호 : <jsp:setProperty property="pw" name="LoginDto"/>--%>
<%
	if("admin".equals(loginDto.getId()) && "1234".equals(loginDto.getPw())){
		session.setAttribute("id", "admin");
		response.sendRedirect("index.jsp");
	}
	else{
		response.sendRedirect("login.jsp");
	}
%>
