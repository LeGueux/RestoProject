package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Role;
import Bean.Utilisateur;
import DAO.UtilisateurDAO;

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
		
		RequestDispatcher rd = null;
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
		
		if (password.equals(password2)) {
			Role r = new Role();
			
			r.setLibelle("User");
			Utilisateur u = new Utilisateur();
			u.setEmail(email);
			u.setLogin(login);
			u.setMdp(password);
			u.setRole(r);
			
			UtilisateurDAO.signup(u);
			
			rd = request.getRequestDispatcher("connexion.jsp");
		} else {
			
			rd = request.getRequestDispatcher("inscription.jsp");
			System.out.println("Les mots de passes ne correspondent pas !");
		}
		
		rd.forward(request, response);
	}
}
