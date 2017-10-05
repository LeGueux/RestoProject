<%@page import="java.util.ArrayList"%>
<%@page import="Bean.Utilisateur"%>
<%@page import="java.util.List"%>
<%@page import="Bean.Restaurant"%>
<%@ include file="header.jsp"%>

<%@ include file="navbar.jsp"%>
<%
	
%>

<c:forEach var="lesRestaurants" items="${lesRestos}">
	<div class="col s12 m7">
		<div class="card">
			
			<div class="card-stacked">
				<div class="card-content">
					<p>
						${lesRestaurants.nom}
					</p>
				</div>
				<div class="card-action">
					<a href="#">Détails</a>
				</div>
			</div>
		</div>
	</div>
</c:forEach>

	</body>
	</html>