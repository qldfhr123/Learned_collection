<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>comboForm</title>
</head>
<body>

<h3>검색 엔진을 선택하세요</h3>

	<form action ="comboResult.jsp" method="post" onchange="window.open(value,'blank');"> 
		<select name="srh" size = "1"> <% // size로 표시할 항목 갯수 표시할수있다 %>
			     <option value="https://google.com">구글</option>
			     <option value="https://naver.com">네이버</option>
			     <option value="https://daum.net">다음</option>
			</select>
		<input type="submit" value="확인"/>
		
	</form>
	
	
</body>
</html>