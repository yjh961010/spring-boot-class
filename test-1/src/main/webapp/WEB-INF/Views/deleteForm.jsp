<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- deleteForm.jsp -->
<link rel="stylesheet" type="text/css" href="style.css">
<div align="center">
	<b>글삭제</b><br><br>
	<form name="f" action="deletePro_board.do" method="post">
		<input type="hidden" name="num" value="${param.num}"/>
		<table border="1" width="300">
			<tr bgcolor="yellow">
				<th>비밀번호를 입력해 주세요.</th>
			</tr>
			<tr>
				<td align="center">비밀번호 : <input type="password" name="passwd"></td>
			</tr>
			<tr bgcolor="yellow">
				<td align="center">
					<input type="submit" value="글삭제">
					<input type="button" value="글목록" onclick="window.location='list_board.do'">
				</td>
			</tr>
		</table>
	</form>
</div>
