package Servlet;

import java.io.IOException;
import java.net.URI;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.Utilisateur;
import DAO.UtilisateurDAO;

/**
 * Servlet implementation class UtilisateurServlet
 */
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = request.getRequestURI();
		RequestDispatcher rd = null;
		HttpSession session = request.getSession();
		Utilisateur user = (Utilisateur) request.getSession().getAttribute("user");
		
		if(url.equals("/Resto/Account")){
			Utilisateur utilisateur = UtilisateurDAO.account(user.getId());
			
			if(utilisateur!= null){
				session.setAttribute("utilisateur", utilisateur);
				
				rd = request.getRequestDispatcher("compte.jsp");
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
		
		String email = request.getParameter("email");
		String newPassword = request.getParameter("newPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		String password = request.getParameter("mdp");
		
		Utilisateur userAccount  = (Utilisateur) request.getSession().getAttribute("user");
		
		RequestDispatcher rd = null;
		
		if(confirmPassword.equals(newPassword) || newPassword != password){
			
			userAccount.setEmail(email);
			
			if(newPassword != null || !newPassword.isEmpty()){
				userAccount.setMdp(newPassword);
			}else if(newPassword.equals(null) || newPassword.isEmpty()){
				userAccount.setMdp(password);
			}

			UtilisateurDAO.updateAccount(userAccount);
			
			rd = request.getRequestDispatcher("/Resto/Account");
			
			System.out.println("Update effectué");
			
		}else{
			System.out.println("erreur");
		}
		
		rd.forward(request, response);
	}

}
