<%@ include file="header.jsp"%>
<body>
	<%@ include file="navbar.jsp"%>
	<div class="row">
		<div class="col s6 offset-s3">
			<form method="POST" action="AddPlatServlet">

				<div class="row">
					<div class="input-field col s12">
						<label for="titre">Titre</label> <input type="text" id="titre"
							name="titre" value=""  class="validate">
					</div>
				</div>

				<div class="row">
					<div class="input-field col s12">
						<label for="description">Description</label>
						<textarea type="text" id="desc" name="desc" value=""
							class="materialize-textarea" cols="40" rows="5"></textarea>


					</div>
				</div>

				<div class="row">
					<div class="input-field col s12">
						<label for="niveau">Niveau</label> <input type="text" id="niveau"
							name="niveau" value="" class="validate">
					</div>
				</div>

				<div class="row">
					<div class="input-field col s12">
						<label for="prix">Prix</label> <input type="number" id="prix"
							name="prix" value="" class="validate">
					</div>
				</div>

				<div class="row">
					<div class="input-field col s12">
						<label for="ingredient">Ingredient</label>
						<textarea type="text" id="ingredient" name="ingredient" value=""
							class="materialize-textarea" cols="40" rows="5"></textarea>


					</div>
				</div>

				<div class="row">
					<button class="btn waves-effect waves-light" type="submit"
						name="action">Ajouter</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>