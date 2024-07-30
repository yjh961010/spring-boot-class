<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete.jsp</title>
</head>
<body>
<div align="center">
		<hr color="green" width="300">
		<h2>학 생 삭 제 페 이 지</h2>
		<hr color="green" width="300">
		<form name="f" action="delete.do" method="post">
			<input type="hidden" name="command" value="delete"/>
			<table border="1">
				<tr>
					<td>
						아이디 : <input type="text" name="id">
						<input type="submit" value="삭제">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>