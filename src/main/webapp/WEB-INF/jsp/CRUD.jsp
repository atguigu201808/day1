<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简单增删给查实现</title>
</head>
<body>

 	<form action="http://localhost:8081/user/select" method="get">
		id:<input name="id" type="text">
		<input value="查询" type="submit">
	</form><br> 
	
	
	<form action="http://localhost:8081/user/save"  method="post">
		用户名：<input name="username" type="text"><br>
		密    码：<input name="password" type="text"><br>
		号    码：<input name="phone" type="text"><br>
		邮    箱：<input name="email" type="text"><br>
		<input value="添加" type="submit">	
	</form>
	
	<form action="http://localhost:8081/user/update" method="post">
			<input type="hidden" name="_method" value="put">
		用户名：<input name="username" type="text"><br>
		密    码：<input name="password" type="text"><br>
		号    码：<input name="phone" type="text"><br>
		邮    箱：<input name="email" type="text"><br>
		i  d:<input name="id" type="text"><br>
		<input value="修改" type="submit">	
	</form>
	
	<form action="http://localhost:8081/user/delete" method="post">
		<input type="hidden" name="_method" value="delete">
		id:<input name="id" type="text"><br>
			<input value="删除" type="submit">
	</form>

</body>
</html>