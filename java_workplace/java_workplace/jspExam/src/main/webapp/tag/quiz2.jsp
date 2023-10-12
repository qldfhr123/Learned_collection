<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2</title>
</head>
<body>
	<h1>합계구하기</h1> 
	
	<% 
		int sum =0;
		int sum_e =0;
		int sum_o =0;
		for(int i = 1; i<101; i++){
			sum=sum+i;
			out.print(i);
			out.print("+");
			
			if(i%2==0){
				sum_e=sum_e+i;	
			}
			else{
				sum_o=sum_o+i;
			}
		}
		out.print("="+sum);
		out.print("<br>");
		out.print("1~100까지 짝수의 합"+sum_e);
		out.print("<br>");
		out.print("1~100까지 홀수의 합"+sum_o);
		out.print("<br>");

	%>
	
	
</body>
</html>