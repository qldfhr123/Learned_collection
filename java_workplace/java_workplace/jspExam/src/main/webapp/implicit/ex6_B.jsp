<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex6_B</title>
</head>
<body>

		<h3>ex6_BB</h3>
		
		페이지 : <%=pageContext.getAttribute("id") %><br>
		요청 : <%=request.getAttribute("id") %><br>
		세션 : <%=session.getAttribute("id") %><br>
		어플리케이션 : <%=application.getAttribute("id") %><br>
		
		<%
			//session.invalidate();
			session.setAttribute("id", "admin");
			//지우고 수정 삭제 할수있음
			
		%>
		
		
		<a href = "ex_C.jsp">C 페이지로 이동</a>
		<input type="button" value="C페이지로 이동" onclick="location.href = 'ex6_C.jsp'"/>
</body>
</html>