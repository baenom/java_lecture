<%@page import="kr.ac.kopo.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	BoardVO b01 = new BoardVO(100, "1번째");
	BoardVO b02 = new BoardVO(200, "2번째");
	BoardVO b03 = new BoardVO(300, "3번째");
	
	BoardVO[] boardArr = {b01,b02,b03};
	
	pageContext.setAttribute("boardList", boardArr);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	1번째 : <%= boardArr[0].toString()  %><br>
	<hr>
	1번째 : ${ boardList[0] }<br>
	<hr>
	2번째 : <%= boardArr[1].getTitle()  %><br>
	<hr>
	2번째 : ${ boardList[1].title }<br>
</body>
</html>