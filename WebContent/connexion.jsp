<%@ include file="header.jsp" %>
<body>
	<nav>
	<div class="nav-wrapper"></div>
	</nav>
	<div class="row">
		<div class="col s6 offset-s3">
			<div class="card">
				
				<div class="row form">
					<span class="card-title title-connexion">Veuillez entrer vos
					indentifiants</span>
					<form class="col s12" method="POST" action="ConnexionServlet">

						<div class="row">
							<div class="input-field col s12">
								<label for="login"></label> <input type="text" id="login"
									name="login" value="" placeholder="Login" class="validate">
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12">
								<label for="login"></label> <input type="password" id="password"
									name="password" value="" placeholder="Mot de passe"
									class="validate">
							</div>
						</div>
						<div class="row">
							<button class="btn waves-effect waves-light" type="submit"
								name="action">
								Se connecter <i class="material-icons right">send</i>
							</button>
						</div>


					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>