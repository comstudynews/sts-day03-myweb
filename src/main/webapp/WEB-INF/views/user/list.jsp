<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>사용자 목록</h1>
	<table  class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>PASSWORD</th>
			<th>NAME</th>
			<th>ROLE</th>
		</tr>
	<c:forEach var="user" items="${userList }">
		<tr>
			<td><a href="userDetail?id=${user.id }">${user.id }</a></td>
			<td>${user.password }</td>
			<td>${user.name }</td>
			<td>${user.role }</td>
		</tr>
	</c:forEach>
	</table>
	<hr>
	<a href="userWrite">사용자 추가</a>
</body>
</html>