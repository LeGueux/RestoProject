package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Bean.Plat;

public class PlatDAO {
	
	public PlatDAO() {
	}

	public static void addPlat(Plat p) {

		EntityManager em = JPAUtil.getEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(p);
		tx.commit();
		
		em.close();

	}

}
