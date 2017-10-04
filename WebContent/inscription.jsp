<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="InscriptionServlet">
		Login : <input type="text" id="login" name="login" value="login">
		Email : <input type="text" id="email" name="email" value="email">
		Password : <input type="password" id="password" name="password" value="password">
		Confirmation du password : <input type="password" id="password2" name="password2" value="password">
		
		<input type="submit" value="valider" />
	</form>
</body>
</html>