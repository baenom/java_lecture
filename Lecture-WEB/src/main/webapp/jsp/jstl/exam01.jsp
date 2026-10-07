<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="cnt" value="1"/>
cnt : ${ cnt }<br>
<c:set var="cnt" value="${cnt + 1 }" scope="request"/>
cnt : ${ requestScope.cnt }<br>
<c:remove var="cnt"/>
cnt : ${ requestScope.cnt }<br>
</body>
</html>