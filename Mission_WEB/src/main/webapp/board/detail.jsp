<%@page import="kr.ac.kopo.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%

BoardVO b01 = new BoardVO(1,"제목이다","홍길동",20260907);
BoardVO b02 = new BoardVO(2,"ㅋㅋㅋㅋ","홍길순",20260907);
BoardVO b03 = new BoardVO(3,"배고프다","홍길도",20260907);

BoardVO[] list = {b01,b02,b03};

	String strNo = request.getParameter("no");
	int boardNo = Integer.parseInt(strNo);
	
	for(BoardVO board : list){
		
		if(board.getNo() == boardNo){
			pageContext.setAttribute("board", board);
			break;
		}
	}
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
<h2>상세 페이지</h2>
<hr>



<table border="1" style="width: 80%;">
<tr>
<th style="width: 25%;">번호</th>
<td>${ board.no }</td>
</tr>

<tr>
<th>제목</th>
<td>${ board.title }</td>
</tr>

<tr>
<th>작성자</th>
<td>${ board.writer }</td>
</tr>

<tr>
<th>내용</th>
<td>${ board.content }</td>
</tr>


<tr>
<th>조회수</th>
<td>${ board.viewCnt }</td>
</tr>

<tr>
<th>등록일</th>
<td>${ board.regDate }</td>
</tr>
</table>


</div>




</body>
</html>