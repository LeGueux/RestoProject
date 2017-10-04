<%@page import="java.util.ArrayList"%>
<%@page import="Bean.Utilisateur"%>
<%@page import="java.util.List"%>
<%@page import="Bean.Restaurant"%>
<%@ include file="header.jsp" %>

<body>
	<%
		ArrayList<Restaurant> lesRestaurants = (ArrayList<Restaurant>) request.getAttribute("lesRestos");
	%>

	<%
		Utilisateur user = (Utilisateur) request.getAttribute("User");
	%>

	<%
		out.println(user.getLogin());
	%>


	<%
		if (lesRestaurants.size() > 0) {
			for (int i = 0; i < lesRestaurants.size(); i++) {
				out.println(lesRestaurants.get(i).getNom());

			}
		} else {
			out.println("Pas de restaurants");
		}
	%>
</body>
</html>