package DAO;

import javax.persistence.EntityManager;

import Bean.Utilisateur;

public class UtilisateurDAO {

	public UtilisateurDAO() {
	}

	public static void signup(Utilisateur u) {

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();
		
		em.persist(u);
		
		em.getTransaction().commit();
		
		em.close();

	}

}
