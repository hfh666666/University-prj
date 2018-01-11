<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="upload.do" method="post" enctype="multipart/form-data">
<table>
	<tr>
		<td><h3>用户相片上传</h3></td>
	</tr>
	<tr>
		<td>请选择相片：</td>
		<td><input type="file" name="file"></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="上传">&nbsp;&nbsp;<input type="reset" value="重置"></td>
		<td>${msg}</td>
	</tr>

</table>



</form>
</body>
</html>