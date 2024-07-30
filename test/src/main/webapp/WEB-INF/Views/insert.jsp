<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<hr color="green" width="300">
		<h2>학 생 등 록 페 이 지</h2>
		<hr color="green" width="300">
		<form name="f" action="insert.do" method="post">
			<input type="hidden" name="command" value="insert"/>
			<table border="1">
				<tr>
					<td>
						아이디 : <input type="text" name="id"><br>
						학생명 : <input type="text" name="name"><br>
						학급명 : <input type="text" name="cname"><br>
						<input type="submit" value="입력">
						<input type="reset" value="다시입력">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>