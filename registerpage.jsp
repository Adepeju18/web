<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<center>
<form action="RegisterServlet" method="post">
Enter Id:<input type="text" name="uid"/>
<br/>
Enter Name:<input type="text" name="uname"/>
<br/>
Enter password:<input type="password" name="pass"/>
<br/>
Enter Email:<input type="text" name="email"/>
<br/>
<input type="submit" value="save"/>
</form>
</center>
</body>
</html>