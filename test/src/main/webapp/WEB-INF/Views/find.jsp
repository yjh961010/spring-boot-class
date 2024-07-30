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
		<h2>학 생 찾 기 페 이 지</h2>
		<hr color="green" width="300">
		<form name="f" action="find.do" method="post">
			<input type="hidden" name="command" value="find"/>
			<table border="1">
				<tr>
					<td>
						학급명 : <input type="text" name="cname">
						<input type="submit" value="찾기">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>