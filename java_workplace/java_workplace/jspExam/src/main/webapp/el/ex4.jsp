<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

\${5==2} :${5==2 } =>\${5 eq 5 } : ${5 eq 5 }<br>
<%// \는 출력할수있다 %>

\${5<2} :${5<2 } =>\${5 lt 5 } : ${5 lt 5 }<br>
\${5>2} :${5>2 } =>\${5 gt 5 } : ${5 gt 5 }<br>
\${5<=2} :${5<=2 } =>\${5 le 5 } : ${5 le 5 }<br>
\${5>=2} :${5>=2 } =>\${5 ge 5 } : ${5 ge 5 }<br>


</body>
</html>