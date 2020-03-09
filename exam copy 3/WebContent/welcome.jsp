<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="tcs" tagdir="/WEB-INF/tags" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Message is ${msg}</h1>
<table class='table table-bordered'>
<thead class='thead-dark'>
<tr>
<th>S.no</th>
<th>RegCode</th>
<th>Userid</th>
<th>Email</th>
<th>Phone</th>
</tr>
</thead>
<tbody>
<c:forEach items="${sessionScope.users}" var="user" varStatus="userstatus">
<c:if test="${userstatus.count%2==0}">
<tr class='alert-danger'>
<td>${userstatus.count }</td>
<td>${user.regCode}</td>
<td><tcs:initcaps str="${user.userid}"/></td>
<td>${user.email}</td>
<td>${user.phone}</td>
</tr>
</c:if>
<c:if test="${userstatus.count%2!=0}">
<tr class='alert-success'>
<td>${userstatus.count }</td>
<td>${user.regCode}</td>
<td>${user.userid}</td>
<td>${user.email}</td>
<td>${user.phone}</td>
</tr>
</c:if>
</c:forEach>
</tbody>
</table>
</body>
</html>