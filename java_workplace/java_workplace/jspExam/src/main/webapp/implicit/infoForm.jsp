<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>infoForm</title>
</head>
<body>



	<form action ="infoResult.jsp" method="post"> <!-- post는 한글은 깨진다 -->
		<label>Id :</label><input type="text"  name="id"><br>
		<label>Password : </label><input type="password" name="pw"/><br><br>
		
		<label>자기소개</label><br>
		<textarea rows="5" cols="80" name="textArea"></textarea>
		<br><br>
		<input type="submit" value="전송"/>
		<input type="reset" value="초기화"/>
	</form>

</body>
</html>