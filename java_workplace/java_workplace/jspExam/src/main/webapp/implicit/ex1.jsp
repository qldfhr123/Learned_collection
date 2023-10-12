<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex1</title>
</head>
<body>

	<%-- requset 내장객체 메소드 --%>
	<%-- http://localhost:8085/jsp_exam/implicit/ex1.jsp --%>
	
	컨택스트 패스 : <%=request.getContextPath() %> <br>
	요청방식 : <%=request.getMethod() %> <br>
	요청한 URL : <%=request.getRequestURL() %> <br>
	요청한 URI : <%=request.getRequestURI() %> <br>
	서버 이름 : <%=request.getServerName() %> <br>
	
	프로토콜 : <%=request.getProtocol() %> <br>
</body>
</html>