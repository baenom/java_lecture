<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%
	String[] names = {"강길동","홍길동","윤길동","고길동"};
	pageContext.setAttribute("nameList", names);
	pageContext.setAttribute("length", names.length);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="i" begin="0" end="3">
		${ nameList[i] }<br>
	</c:forEach>
	<c:forEach var="i" begin="0" end="${length - 1}">
		${ nameList[i] }<br>
	</c:forEach>
	<c:forEach var="name" items="${ nameList }">
		${ name }<br>
	</c:forEach>
</body>
</html>