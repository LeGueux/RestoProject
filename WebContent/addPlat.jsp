<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajout d'un plat</title>
</head>
<body>
	<form method="POST" action="AddPlatServlet">
		<p>Nom du plat : <input type="text" name="titre"></p>
		<p>Description : <textarea name="desc" cols="40" rows="5"></textarea></p>
		<p>Niveau de difficulté : <input type="text" name="niveau" value="Facile"></p>
		<p>Prix (€) : <input type="number" name="prix" value="10"></p>
		<p>Ingrédients : <textarea name="ingredient" cols="40" rows="5"></textarea></p>
		
		<input type="submit" value="valider" />
	</form>
</body>
</html>