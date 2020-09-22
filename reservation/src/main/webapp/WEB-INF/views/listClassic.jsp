<%@page import="kr.or.connect.reservation.dto.Reservation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>예약 시스템</title>
</head>
<body>

	<h1>예약 시스템</h1>
	<br>게시글 수 : ${count}
	<br>
	<br>
	
		<a href="list">전체보기</a>
		<a href="listDrama">연극</a>
		<a href="listClassic">클래식</a>
		<a href="listConsert">콘서트</a>
		<a href="listMusical">뮤지컬</a>
		<a href="listShow">전시</a>
	
<br>	
<br>	
	<c:forEach items="${list}" var="reservation">
<table border="1" width="400x600">
<tr>
<th><a>${reservation.description}</a></th>
</tr>
<tr>
<td>장르 : ${reservation.name }</td>
</tr>
<tr>
<td>장소 : ${reservation.place_name }</td>
</tr>
<tr>
<td>시간 : ${reservation.opening_hours}</td>
</tr>

<tr>
<td><a href="listInfo?id=${reservation.id }">상세보기</a></td>
</tr>



</table>
	</c:forEach>
	<br>

	<c:forEach items="${pageStartList}" var="pageIndex" varStatus="status">
		<a href="listClassic?start=${pageIndex}">${status.index +1 }</a>&nbsp; &nbsp;
</c:forEach>

	<br>
	<br>
<!--
<form method="post" action="write">
		name : <input type="text" name="name"><br>
		<textarea name="content" cols="60" rows="6"></textarea>
		<br> <input type="submit" value="등록">
	</form> 
	-->
</body>
</html>