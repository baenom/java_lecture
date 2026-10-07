<%@page import="kr.ac.kopo.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%
    BoardVO b01 = new BoardVO(1,"제목이다","홍길동",20260907);
    BoardVO b02 = new BoardVO(2,"ㅋㅋㅋㅋ","홍길순",20260907);
    BoardVO b03 = new BoardVO(3,"배고프다","홍길도",20260907);
    
    BoardVO[] list = {b01,b02,b03};
    
    pageContext.setAttribute("boardList", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<hr>
	<h2>전체 게시글</h2>
	<hr>
	
	<table border="1" width = "80%">
		<tr>
			<th width="7%">번호</th>
			<th>제목</th>
			<th width="17%">작성자</th>
			<th width="25%">등록일</th>
		</tr>
		<c:forEach var="board" items="${ boardList }">
			<tr>
			<td>${board.no}</td>
			<td>
				<a href="/Mission_WEB/board/detail.jsp?no=${board.no}">
					<c:out value="${board.title}" />
				</a>	
			</td>
			<td>${board.writer}</td>
			<td>${board.regDate}</td>
			</tr>
		</c:forEach>
		
		
		
	<%-- <%
	for(int i = 0;i< list.length;i++){
	%>
	<tr>
	<td><%= list[i].getNo() %></td>
	<td>
		<a href="/Mission_WEB/board/detail.jsp?no=<%=list[i].getNo() %>">
		<%= list[i].getTitle() %>
		</a>	
	</td>
	<td><%= list[i].getWriter() %></td>
	<td><%= list[i].getRegDate() %></td>
	</tr>
	<%
	}
	%> --%>
	</table>
	</div>
	
</body>
</html>