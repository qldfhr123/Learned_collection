<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
        
        
<c:url var="root" value="/"/>
context root(path) : ${root} <%-- 경로를 지정할수있다  프로젝트 명이 바뀌면 직접 변경해야한다--%>

<c:url var="jstl" value="/jstl"/>
/contenxtRoot/jstl : ${jstl} <%-- 경로를 지정할수있다  프로젝트 명이 바뀌면 직접 변경해야한다--%>