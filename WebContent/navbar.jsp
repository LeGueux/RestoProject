<%@page import="Bean.Utilisateur"%>
<%@ include file="header.jsp"%>
<body>
	<nav>
		<div class="nav-wrapper">
			<ul id="nav-mobile" class="hide-on-med-and-down">
				<li class="right">Connecté en tant que  ${ user.login }</li>
				<li><a href="RestaurantServlet">Accueil</a></li>
				<li><a href="PlatServlet">Nos plats</a></li>
				<li><a href="Account">Mon compte</a></li>
				<li><a href="Deconnexion">Deconnexion</a></li>
			</ul>
		</div>
	</nav>