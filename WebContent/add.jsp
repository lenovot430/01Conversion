<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
		Name:<input value="${user.name }" name="name"><br/>
		Age:<input name="age" ><br/>
		Gender:<input type="radio" name="gender" value="true">Male
			<input type="radio" name="gender" value="false">FeMale<br/>
		Salay:<input name="salay" value="${user.salay }"><br/>
		birthDay:<input name="birthDay" value="${user.birthDay }"><br/>
		<input type="submit" value="submit">
	</form>
	<hr/>
	<form action="add" method="post">
		User:<input name="user" value="Rose-19-false-50000">
		<input type="submit" value="submit">
	</form>
</body>
</html>