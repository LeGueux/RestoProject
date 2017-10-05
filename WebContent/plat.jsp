<%@page import="java.util.ArrayList"%>
<%@page import="Bean.Utilisateur"%>
<%@page import="java.util.List"%>
<%@page import="Bean.Restaurant"%>
<%@ include file="header.jsp"%>

<%@ include file="navbar.jsp"%>
<%
	
%>
<div class="row">
	<c:forEach var="lesPlats" items="${lesPlats}">

		<div class="col s6">
			<div class="card card-plat">
				<div class="card-image">
					<i class="large material-icons">restaurant_menu</i>
				</div>
				<span class="card-title ">${lesPlats.titre}</span>
				<div class="card-content plat">${lesPlats.desc}</div>
				<div class="card-action plat">
					<a href="#">Liste des ingredients</a>
				</div>
			</div>
		</div>

	</c:forEach>
</div>
</body>
</html>