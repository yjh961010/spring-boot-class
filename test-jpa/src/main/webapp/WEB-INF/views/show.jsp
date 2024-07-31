<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form name="f" action="/articles/update" method="post">
      번호 : <input type="text" name="id" value="${getArticle.id}"> <br>
      제목 : <input type="text" name="title" value="${getArticle.title}"><br>
      내용   : <input type="text" name="content" value="${getArticle.content}"><br>
      <input type="button" value="삭제" onclick="location.href='/article/${getArticle.id}/delete'">
      <input type="submit" value="수정">   
   </form>
</body>
</html>