<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bmiResult</title>
</head>
<body>

<h3> BMI </h3>

		<%
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			String height = request.getParameter("height");
			String weight = request.getParameter("weight");
			
			int user_height = 0;
			int user_weight = 0;
		
			try{

				user_height = Integer.parseInt(height);
				user_weight = Integer.parseInt(weight);
			}
			catch(Exception e){
				response.sendRedirect("bmiResult.jsp");
		
			
			}
			
			String format = "#.##";
			java.text.DecimalFormat df = new java.text.DecimalFormat(format);
			double user_fat;
			double user_fat_cal;
			
			user_fat_cal = (user_height-100)*0.9;
			user_fat=user_weight/user_fat_cal*100;
				
		
			if(user_fat<100){
				out.print(name+"님의 비만도는 "+df.format(user_fat)+"% 저체중 입니다");	
			}
			else if(100<=user_fat && user_fat<110){
				out.print(name+"님의 비만도는 "+df.format(user_fat)+"% 정상입니다");	
			}
			
			else if(110<=user_fat && user_fat<120){
				out.print(name+"님의 비만도는 "+df.format(user_fat)+"% 과체중 입니다");	
			}
			else if(120<=user_fat && user_fat<130){
				out.print(name+"님의 비만도는 "+df.format(user_fat)+"% 비만 입니다");	
			}
			else if(user_fat<=130){
				out.print(name+"님의 비만도는 "+df.format(user_fat)+"% 고도비만 입니다");	
			}

		%>


</body>
</html>