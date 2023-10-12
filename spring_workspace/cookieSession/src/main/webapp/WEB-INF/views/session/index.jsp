<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>

<a href ="index">인덱스</a>

<c:choose>
	<c:when test="${empty sessionScope.id }">
		<a href="login">로그인</a>
	</c:when>
	<c:otherwise>
		<a href="logout">로그아웃</a>
	</c:otherwise>
</c:choose>
</body>
</html>