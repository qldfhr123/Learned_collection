<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectForm</title>
</head>
<body>


	<form action ="selectResult.jsp" method="post"> 
		<label>학력</label>
			<select name="selcet" size = "1"> <% // size로 표시할 항목 갯수 표시할수있다 %>
			     <option value="신입생">신입생</option>
			     <option value="재학생">재학생</option>
			     <option value="학사">학사</option>
			</select>
		<br><br><br>
		<label>소속 국가</label>
			<select name="selcet_c" size = "3">
				     <option value="대한민국">대한민국</option>
				     <option value="미국">미국</option>
				     <option value="일본">일본</option>
				</select>
		<br><br><br>
		<label>관심분야</label>
			<select name="selcet_f" size = "4" multiple="multiple">
				     <option value="컨설팅">대한민국</option>
				     <option value="프로듀서">프로듀서</option>
				     <option value="프로그래머">프로그래머</option>
				     <option value="서버관리자">서버관리자</option>
				</select>
		<br><br><br>
		<input type="submit" value="전송"/>
		<input type="reset" value="초기화"/>
	</form>


</body>
</html>