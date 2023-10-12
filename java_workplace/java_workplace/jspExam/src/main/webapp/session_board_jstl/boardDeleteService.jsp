<%@page import="java.io.File"%>
<%@page import="session_board.BoardDTO"%>
<%@page import="session_board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:catch var="except">
	<c:set var="no" value="${Integer.parseInt(param.no) }"/>
</c:catch>

<c:if test="${except != null }">
	<c:redirect url="boardContnet.jsp"/>
</c:if>

<jsp:useBean id="boadrdDao" class="session_board.BoardDAO"/>
<c:set var="board" value="${boardDao.searcjForModify(no) }"/>
<c:choose>

	<c:when test="${empty board }"/>
	<c:redirect url="boardContent.jsp?no=${no}"></c:redirect>
	<jsp:useBean id="boadrdDto" class="session_board.BoardDTO"/>
	<c:when test="${empty boadrdDto.id }"/>
	<c:redirect url="boardContent.jsp?no=${no}"></c:redirect>
	
	<c:otherwise>
	
	${boardDao.delete(no) }
	${boardDao.disConnection() }
	</c:otherwise>
</c:choose>

<%
	//file 생성자가 있기때문에
	String id = (String)session.getAttribute("id");
	
	BoardDTO board =(BoardDTO)pageContext.getAttribute("board");
	String saveDir = "C:\\javas\\upload\\" + id + "\\" + board.getFileName();
	File f = new File(saveDir);
	if(f.exists() == true){
		f.delete();	
	}
	
	
%>
<c:redirect url="boardForm.jsp"/>





