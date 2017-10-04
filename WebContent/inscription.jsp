<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="InscriptionServlet">
		Login : <input type="text" id="login" name="login" value="">
		Email : <input type="text" id="email" name="email" value="">
		Password : <input type="password" id="password" name="password" value="">
		Confirmation du password : <input type="password" id="password2" name="password2" value="">
		
		<input type="submit" value="valider" />
	</form>
</body>
</html>