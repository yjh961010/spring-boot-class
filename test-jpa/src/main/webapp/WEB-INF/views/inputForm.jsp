<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form name="f" action="/articles/create" method="post">
      제목 : <input type="text" name="title"><br>
      내용 : <input type="text" name="content"><br>
      <input type="submit" value="전송">   
   </form>
</body>
</html>
