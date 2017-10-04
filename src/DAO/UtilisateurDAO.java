package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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

}
