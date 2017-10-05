<%@page import="java.util.ArrayList"%>
<%@page import="Bean.Utilisateur"%>
<%@page import="java.util.List"%>
<%@page import="Bean.Restaurant"%>
<%@ include file="header.jsp"%>

<%@ include file="navbar.jsp"%>

<div class="row">
	<div class="col s6 offset-s3">
		<div class="card">

			<div class="row form">
				<span class="card-title title-connexion">Vos informations personelles</span>
				<form class="col s12" method="POST" action="UtilisateurServlet">

					<div class="row">
						<div class="input-field col s12">
							<label for="Email">Email</label> <input type="text" id="email"
								name="email" value="${utilisateur.email}" class="validate" >
						</div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<label for="mdp">Mot de passe actuel</label> <input type="password" id="mdp"
								name="mdp" value="${utilisateur.mdp}" class="validate">
						</div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<label for="newMdp">Nouveau mot de passe</label> <input type="password" id="newPassword"
								name="newPassword" value="" class="validate">
						</div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<label for="confirmMdp">Confirmation du mot de passe</label> <input type="password" id="confirmPassword"
								name="confirmPassword" value="" class="validate">
						</div>
					</div>
					<div class="row">
						<button class="btn waves-effect waves-light" type="submit"
							name="action">
							Modifier
						</button>
					</div>


				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>