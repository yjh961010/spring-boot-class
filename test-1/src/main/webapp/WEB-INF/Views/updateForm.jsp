<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- updateForm.jsp -->
<link rel="stylesheet" type="text/css" href="style.css">
<script type="text/javascript">
	function check(){
		if (f.subject.value==""){
			alert("제목을 입력해 주세요!!")
			f.subject.focus()
			return false
		}
		if (f.content.value==""){
			alert("내용을 입력해 주세요!!")
			f.content.focus()
			return false
		}
		if (f.passwd.value==""){
			alert("비밀번호를 입력해 주세요!!")
			f.passwd.focus()
			return false
		}
		return true
	}
</script>
<div align="center">
	<form name="f" action="updatePro_board.do" method="post"
													onsubmit="return check()">
		<input type="hidden" name="num" value="${getBoard.num}"/>	
		<h3>글수정</h3><br>										
		<table border="1" width="80%">
			<tr>
				<th bgcolor="yellow" width="20%">이 름</th>
				<td width="80%"><input type="text" name="writer" class="box" 
											value="${getBoard.writer}" readOnly></td>
			</tr>
			<tr>
				<th bgcolor="yellow">제 목</th>
				<td><input type="text" name="subject" class="box" size="50" 
										value="${getBoard.subject}"></td>
			</tr>
			<tr>
				<th bgcolor="yellow">Email</th>
				<td><input type="text" name="email" class="box" 
									size="50" value="${getBoard.email}"></td>
			</tr>
			<tr>
				<th bgcolor="yellow">내 용</th>
				<td><textarea name="content" rows="11" cols="50" class="box">${getBoard.content}</textarea></td>
			</tr>
			<tr>
				<th bgcolor="yellow" width="20%">비밀번호</th>
				<td width="80%"><input type="password" name="passwd" class="box"></td>
			</tr>
			<tr bgcolor="yellow">
				<td colspan="2" align="center">
					<input type="submit" value="글수정">
					<input type="reset" value="다시작성">
					<input type="button" value="목록보기" onclick="window.location='list_board.do'">
				</td>
			</tr>
		</table>
	</form>
</div>
