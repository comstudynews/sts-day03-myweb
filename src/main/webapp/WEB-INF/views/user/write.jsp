<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/WEB-INF/views/board_write.jsp</title>
</head>
<body>

	<h1>사용자 정보 입력 페이지</h1>
	<form action="userWrite" method="POST">
		<table  class="table table-bordered">
			<tr>
				<th width="20%">ID</th>
				<td width="80%"><input type="text" value="test2" name="id"/></td>
			</tr>
			<tr>
				<th>PASSWORD</th>
				<td><input type="password" value="1234" name="password"/></td>
			</tr>
			<tr>
				<th>NAME</th>
				<td><input type="text" value="테스트2" name="name"/></td>
			</tr>
			<tr>
				<th>ROLE</th>
				<td><input type="text" value="User" name="role"/></td>
			</tr>
			<tr>
				<th> </th>
				<td><input type="submit" value="저장" /></td>
			</tr>
		</table>
	</form>
</body>
</html>