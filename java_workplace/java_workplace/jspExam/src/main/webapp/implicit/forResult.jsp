<%@page import="javax.tools.DocumentationTool.Location"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forResult</title>
</head>
<body>
<h3>계산 결과</h3>
			

	<%
		String sele_num = request.getParameter("sele_num");
		int sum = 0;
		int num = 0;
		try{
			num = Integer.parseInt(sele_num);
		}
		catch(Exception e){
			response.sendRedirect("forForm.jsp");
			
			//return;//jsp 페이지를 종료
			
			
		}
		%>
		
		<!--<script>
				alert('숫자만 입력하세요');
				location.href='forForm.jsp';
			</script>-->
			
			
		<%
		out.print("<script>alert('코드 실행')</script>");
		
		for(int i =1; i<=num; i++  ){
			sum=sum+i;
			
			out.print(i);
			if(i<num)
				out.print("+");
		}
		out.print("="+sum);
	
	%>



</body>
</html>