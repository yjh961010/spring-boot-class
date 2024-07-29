<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!-- list.jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" type="text/css" href="style.css">
<div align="center">
	<b>글 목 록</b>
	<table border="0" width="100%">
		<tr bgcolor="yellow">
			<td align="right">
				<a href="write_board.do">글쓰기</a>
			</td>
		</tr>
	</table>
	<table border="1" width="100%">
		<tr bgcolor="green">
			<th>번호</th>
			<th width="30%">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
			<th>IP</th>
		</tr>
	<c:if test="${empty listBoard}">		
		<tr>
			<td colspan="6">등록된 게시글이 없습니다.</td>
		</tr>
	</c:if>	
	<c:forEach var="dto" items="${listBoard}">
		<tr>
			<td align="center">${dto.num}</td>
			<td align="left">
				<a href="content_board.do?num=${dto.num}">${dto.subject}</a>
				<c:if test="${dto.readcount > 10}">
					<img src="img/hot.gif">
				</c:if>
			</td>
			<td align="center">${dto.writer}</td>
			<td align="center">${dto.reg_date}</td>
			<td align="right">${dto.readcount}</td>
			<td align="center">${dto.ip}</td>
		</tr>	
	</c:forEach>		
	</table>
</div>










