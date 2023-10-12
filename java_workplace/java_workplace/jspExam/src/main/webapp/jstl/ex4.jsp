<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex4</title>
</head>
<body>

	<%
		String data1 = "자바 변수의 데이터";
		pageContext.setAttribute("data2", data1);
	%>
	
	<c:set var = "data3" value=<%=data1 %>/>
	
	data2 : ${pageScope.data2 }<br>
	data3 : ${pageScope.data3 }<br>
	
	<%--
	
	
	 --%>
	 
	 <c:if test="${data2==data3}" >
	 	<h3>두 변수의 데이터는 같은 데이터이다</h3>
	 </c:if>
	 	<h3>다 음 문 장</h3>

</body>
</html>