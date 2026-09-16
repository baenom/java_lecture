<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- 공유영역 4가지 : pageContext, request, session, application --%>
<% pageContext.setAttribute("msg", "pageContext 공유영역에 등록"); 
request.setAttribute("id", "홍길동");
request.setAttribute("msg", "request 공유영역에 등록");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
msg : ${ msg }<br>
id : ${ id }<br>
request msg : ${ requestScope.msg }<br>
</body>
</html>