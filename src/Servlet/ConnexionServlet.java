package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.Role;
import Bean.Utilisateur;
import DAO.UtilisateurDAO;

/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnexionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(false);
		RequestDispatcher rd = null;
		
		String url = request.getRequestURI();
		if(url.equals("/Resto/ConnexionServlet")){
			response.sendRedirect("connexion.jsp");
		}
		
		if(url.equals("/Resto/Deconnexion")){
			
			if(session != null){
				session.invalidate();
				rd = request.getRequestDispatcher("connexion.jsp");
			}else{
				System.out.println("erreur");
			}
			rd.forward(request, response);
		}
		
		
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		RequestDispatcher rd = null;
		
		HttpSession session =  request.getSession(true);
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		Utilisateur user = UtilisateurDAO.signin(login, password);
		
		if(user.getId() != 0){
			if(user.getRole().getLibelle().equals("User")){
				
				session.setAttribute("user", user);
				rd = request.getRequestDispatcher("/RestaurantServlet");
			}else{
				
				request.setAttribute("user", user);
				
				rd = request.getRequestDispatcher("administration.jsp");
			}
		}else{
			System.out.println("Mauvais identifiants");
			rd = request.getRequestDispatcher("connexion.jsp");
		}
		
		rd.forward(request, response);
		
	}
		

}
