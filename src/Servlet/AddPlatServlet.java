package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Plat;
import DAO.PlatDAO;

/**
 * Servlet implementation class AddPlatServlet
 */
@WebServlet("/AddPlatServlet")
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
