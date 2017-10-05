package Servlet;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Plat;
import Bean.Restaurant;
import DAO.PlatDAO;
import DAO.RestaurantDAO;

/**
 * Servlet implementation class AddPlatServlet
 */
public class AddPlatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPlatServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String url = request.getRequestURI();
		if(url.equals("/Resto/AddPlatServlet")){
			response.sendRedirect("addPlat.jsp");
		}
		
		if(url.equals("/Resto/PlatServlet")){
			RequestDispatcher rd = null;

			List<Plat> lesPlats = null;

			lesPlats = PlatDAO.getPlats();

			if (lesPlats.size() > 0 || lesPlats != null) {
				request.setAttribute("lesPlats", lesPlats);
				rd = request.getRequestDispatcher("plat.jsp");
			} else {
				System.out.println("Aucun plats.");
			}

			rd.forward(request, response);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
		
		String titre = request.getParameter("titre");
		String desc = request.getParameter("desc");
		double prix = Double.parseDouble(request.getParameter("prix"));
		String niveau = request.getParameter("niveau");
		String ingredient = request.getParameter("ingredient");
			
		Plat p = new Plat(titre, desc, prix, ingredient, niveau);
		
		PlatDAO.addPlat(p);
	}

}
