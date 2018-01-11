<%@page import="edu.smxy.dao.Msg"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<% Msg msg=(Msg)request.getAttribute("msgdetail"); %>
	<tr>
		<td>留言详细信息：</td>
	</tr>
	<tr>
		<td>留言主题：</td>
		<td><%=msg.getMsgTitle() %></td>
	</tr>
	<tr>
		<td>留言人：</td>
		<td><%=msg.getUsername() %></td>
	</tr>
	<tr>
		<td>留言时间：</td>
		<td><%=msg.getMsgTime() %></td>
	</tr>
	<tr>
		<td>留言内容：</td>
		<td><%=msg.getMsgContent() %></td>
	</tr>
</table>
</body>
</html>