<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<fmt:requestEncoding value="utf-8"/>

<jsp:useBean id="memberDto" class="session.MemberDTO"/>

<jsp:setProperty property="*" name="memberDto"/>
<%-- dto의 값을 property 담는다 --%>
<c:choose>
	<c:when test="${empty memberDto.id or empty memberDto.pw}">
		<c:redirect url="register.jsp"/>
	</c:when>
	<c:when test="${memberDto.pw != param.confirmPw }">
	<%--dto에 confirPw 가 존재 하지않아서 param 예약어를 사용하여 검증 --%>
		<c:redirect url="register.jsp"/>
	</c:when>
	<c:otherwise>
		<jsp:useBean id="memberDao" class="session.MemberDAO"/>
		<%--dao는 위에 있을 필요없어서 아래로 내렸다 --%>
		<c:set var="check" value="${memberDao.selectId(memberDto.id) }"/>
		<%-- 변수를 호출할 이름 작성하고 매서드를 호출하기때문에  --%>
		<c:choose>
		<%--  else 안에 if, else if넣은것과 같다  --%>
			<c:when test="${empty check}">
	${memberDao.register(memberDto.id, memberDto.pw, memberDto.name, memberDto.email)}
				<c:set var="msg" value="회원 가입 완료"/>
				<c:set var="path" value="index.jsp"/>
			</c:when>
			<c:otherwise>
				<c:set var="msg" value="회원 가입 실패"/>
				<c:set var="path" value="register.jsp"/>
			</c:otherwise>
		</c:choose>
		${memberDao.disConnection() }
	</c:otherwise>
</c:choose>
<script>alert('${msg}'); location.href='${path}';</script>




