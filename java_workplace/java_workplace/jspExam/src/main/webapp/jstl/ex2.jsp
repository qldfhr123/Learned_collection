<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex2</title>
</head>
<body>


	<c:set var="data1" value="123"></c:set>
	<c:set var="data2" value="문자열"></c:set>
	
	data1 : ${data1 }<br>
	data2 : ${data2 }<br>

</body>
</html>