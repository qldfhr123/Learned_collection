<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex3</title>
</head>
<body>

	<% 
		boolean data = false;
	
		if(data){
			out.print("<h3>참일때 실행</h3>");
		}
		else{
			out.print("<h3>거짓일때 실행</h3>");
		}
	%>
		 
	<% 
		if(data){
	%>
		 	
		<h3> <%="참일때 실행"%></h3>
	
	 
	 <%
		}
		else{
			%>
			
			
			<h3> <%="거짓일때 실행"%></h3>
		<%
			}
		%>
	 
		
		
		
</body>
</html>