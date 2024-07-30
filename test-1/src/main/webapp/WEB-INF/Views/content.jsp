<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- content.jsp -->
<link rel="stylesheet" type="text/css" href="style.css">
<div align="center">
	<b>글내용 보기</b>
	<table border="1" width="100%">
		<tr>
			<th width="20%" bgcolor="yellow">글번호</th>
			<td align="center">${getBoard.num}</td>
			<th width="20%" bgcolor="yellow">조회수</th>
			<td align="center">${getBoard.readcount}</td>
		</tr>
		<tr>
			<th width="20%" bgcolor="yellow">작성자</th>
			<td align="center">${getBoard.writer}</td>
			<th width="20%" bgcolor="yellow">작성일</th>
			<td align="center">${getBoard.reg_date}</td>
		</tr>
		<tr>
			<th width="20%" bgcolor="yellow">글제목</th>
			<td align="left" colspan="3">${getBoard.subject}</td>
		</tr>
		<tr>
			<th width="20%" bgcolor="yellow">글내용</th>
			<td align="left" colspan="3">${getBoard.content}</td>
		</tr>
		<tr bgcolor="yellow">
			<td align="right" colspan="4">
				<input type="button" value="글수정"
				onclick="window.location='updateForm_board.do?num=${getBoard.num}'">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="button" value="글삭제" 
				onclick="window.location='deleteForm_board.do?num=${getBoard.num}'">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="button" value="글목록" onclick="window.location='list_board.do'">
			</td>
		</tr>
	</table>
</div>









