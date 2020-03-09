<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>I am Action</h2>
<jsp:plugin code="x.class" codebase="./src" type="applet">
<jsp:fallback>Ur Browser Not Support Applet</jsp:fallback>
</jsp:plugin>
<jsp:include page="partials.jsp"></jsp:include>
<jsp:forward page="register.jsp">
<jsp:param value="Hello Register" name="x"/>
</jsp:forward>
</body>
</html>