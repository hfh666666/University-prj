<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="regedit">
		<table>
			<h3>请输入用户注册信息:</h3>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username" placeholder="请输入用户名" ></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" placeholder="请输入密码"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="注册">&nbsp;&nbsp;<input
					type="reset" value="重置" id="reset"></td><td><label style="color:red">${msg}</label></td>
			</tr>
		</table>
	</form>
</body>
</html>