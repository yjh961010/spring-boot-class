<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<html>
<head>
   <title>list</title>
</head>
<body>
   <div align="center">
      <hr color="green" width="300">
      <h2>게 시 판 리 스 트</h2>
      <a href="/articles/new">글쓰기</a>
      <hr color="green" width="300">
      <table border="1" width="500">
         <tr bgcolor="yellow">
            <th>번호</th>
            <th>제목</th>
            <th>내용</th>
         </tr>
         <c:if test="${empty articleList}">
         <tr>
            <td colspan="3">등록된 게시글이 없습니다.</td>
         </tr>
         </c:if>      
         <c:forEach var="dto" items="${articleList}">
         <tr>
            <td><a href= "/articles/${dto.id}">${dto.id}</a></td>
            <td>${dto.title}</td>
            <td>${dto.content}</td>
         </tr>      
         </c:forEach>
      </table>
   </div>
</body>
</html>