<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1</title>
</head>
<body>
	
	<% 
		for(int i = 2; i<10; i++){
			for(int ia =1; ia<10; ia++){
				out.print(i+"x"+ia+"="+(i*ia)+"<br>");		
			}
			out.print("<br>");
		}
	%>
</body>
</html>