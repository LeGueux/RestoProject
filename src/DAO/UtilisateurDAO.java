package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import Bean.Utilisateur;

public class UtilisateurDAO {

	public UtilisateurDAO() {
	}

	public static void signup(Utilisateur u) {

		EntityManager em = JPAUtil.getEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(u);
		tx.commit();
		
		em.close();

	}
	
	public static Utilisateur signin(String login, String mdp) {

		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		Utilisateur user = new Utilisateur();
		
		try{
			
			tx.begin();
			Query query = em.createQuery("From Utilisateur where login = :login and mdp = :mdp");
			query.setParameter("login", login)
			.setParameter("mdp", mdp);
			
			user = (Utilisateur) query.getSingleResult();
			
			tx.commit();
			
			em.close();
		} catch(Exception e){
			tx.rollback();
		}

		return user;

	}

}
