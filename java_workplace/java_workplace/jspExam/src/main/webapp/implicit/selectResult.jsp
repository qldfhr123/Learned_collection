<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectResult</title>
</head>
<body>
<h3>입력하신 정보는 아래와 같습니다.</h3>
	<%
		//post는 한글은 깨진다
		request.setCharacterEncoding("UTF-8");
		String ss = request.getParameter("selcet");
		String sc = request.getParameter("selcet_c");
		
		String [] likes = request.getParameterValues("selcet_f");
		
		out.print("학력 : " +ss+"<br>");
		out.print("소속국가 : " +sc+"<br>");
		out.print("관심분야 : ");
		for(String like : likes)
			out.print(" "+like);	
			

	%>



</body>
</html>