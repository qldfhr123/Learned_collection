<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <style type="text/css">
    	a{text-decoration: none; color:black;}
    	ul{padding: 20px;}
    	ul li{display: inline; padding: 15px;}
    	.main_div{height: 150px; padding-top: 80px;}
    	.button{padding-top: 15px;}
    	
    	<%
    		// #=id  .=class
    		// index 실행시 include 파일을 가져와서 header에 작성가능
    		//보통 class로 스타일 작성
    	
    	%>
    </style>
   <script src="/jsp_exam/session_quiz/session_quiz.js">/** 어디에 작성해도 상관없다 */</script> 
   <div align ="center">
  	 <h1>CARE</h1>
   </div>  
   <c:url var="context" value="/jstl"/>
   <%-- 수동으로 바꿔 줄필요가없다 파일의 유틸성이 좋아진다--%>
	<div align ="right">
	ㅜ
			<hr>
				<ul>
					<%//패키지가 달라서 링크를 직접수정 %>
					<li><a href="${context }/index.jsp">HOME</a></li>
					<% String id = (String)session.getAttribute("id"); %>
					<li><a href="${context }/register.jsp">Register</a></li>
					<li><a href="${context }/login.jsp">Login</a></li>
					<li><a href="${context }/memberInfo.jsp">MemberInfo</a></li>
					<li><a href="${context }/logout.jsp">Logout</a></li>
					<li><a href="${context }/boardWrite.jsp">Board</a></li>
				</ul>
			<hr>
			
	</div>
	
		