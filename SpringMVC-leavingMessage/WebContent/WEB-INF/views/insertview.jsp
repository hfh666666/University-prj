<%@page import="java.util.ArrayList"%>
<%@page import="edu.smxy.dao.Msg"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.img{
	width:150px;
	height:300px;
	position:absolute;
	top:40px;
}
.liuyan{
	width:430px;
	height:400px;
	position:absolute;
	left:200px;
	top:20px;
}
.label1{
	margin-left:80px;
}
.session{
	margin-left:20px;
}
.slectAllview{
	width:500px;
	position:absolute;
	top:300px;
}
.slectAllview table{
	table-layout:fixed;
	width:500px;
}
</style>
</head>
<body>
<div class="img">
	<img src="${msg1}" width="150px" height="200px"/><br/>
	<p style="color:red" class="session" >欢迎你,<label id="un">${username}</label></p>
</div>
<div class="liuyan">
	<label style="color:red" class="label1">---------请在以下输入留言内容----------</label>
	<form action="insert.do">
	<table class="table1">
		<tr>
			<td width="80">留言主题：</td>
			<td><input type="text" name="msgTitle" ></td>
		</tr>
		<tr>
			<td>留言内容：</td>
			<td><textarea rows="10" cols="30" name="msgContent"></textarea></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="提交" id="tijiao">&nbsp;<input type="button" value="查看全部留言" id="selectAll">&nbsp;<input type="button" value="查看我的留言" id="selectMy">&nbsp;</td>
		</tr>
		<tr>
			<td>${msgresult}</td>
		</tr>
	</table>
</form>
</div>
<div class="slectAllview">
<table  border="1" cellspacing="0">
	<tr>
		<td>序号</td>
		<td>留言主题</td>
		<td>留言人</td>
		<td>留言内容</td>
		<td>留言时间</td>
	</tr>
<% 
if(request.getAttribute("list")!=null){
	List<Msg> list=(ArrayList<Msg>)request.getAttribute("list");
	for(int i=0;i<list.size();i++){
		Msg msg=list.get(i);
		out.println("<tr><td>"+msg.getMsgId()+"</td><td><a href='detail.do?msgId="+msg.getMsgId()+"'>"+msg.getMsgTitle()+"</a></td><td>"+msg.getUsername()+"</td><td>"+msg.getMsgContent()+"</td><td>"+msg.getMsgTime()+"</td></tr>");
	}
}


%>
</table>
</div>
</body>
<script type="text/javascript">
	var selectAll=document.getElementById("selectAll");
	var selectMy=document.getElementById("selectMy");
	var un=document.getElementById("un");
	selectAll.onclick=function(){
		window.location.href="selectall.do";
	}
	selectMy.onclick=function(){
		var username=un.innerHTML;
		window.location.href="selectMy.do?username="+username;
	}


</script>
</html>