<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex6</title>
</head>
<body>

	<%
		pageContext.setAttribute("names", new String[]{"김변수","이상수","박참조"});
	%>
	
	<c:forEach var="name" items="${names }"> <%-- for을 사용하는것과 같다 --%>
		이름 : ${names} <br>
	</c:forEach>

</body>
</html>