<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
   
	<div align ="right">
	
			<hr>
				<ul>
					<%//패키지가 달라서 링크를 직접수정 %>
					<li><a href="/jsp_exam/session_quiz/index.jsp">HOME</a></li>
					<li><a href="/jsp_exam/session_quiz/register.jsp">Register</a></li>
					<li><a href="/jsp_exam/session_quiz/login.jsp">Login</a></li>
					<li><a href="/jsp_exam/session_quiz/memberInfo.jsp">MemberInfo</a></li>
					<li><a href="/jsp_exam/session_quiz/logout.jsp">Logout</a></li>
					<li><a href="/jsp_exam/session_board/boardWrite.jsp">Board</a></li>
				</ul>
			<hr>
			
	</div>
	
		