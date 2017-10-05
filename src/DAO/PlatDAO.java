package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
	
	public static List<Plat> getPlats() {

		EntityManager em = JPAUtil.getEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Query query = em.createQuery("From Plat");
		
		List<Plat> lesPlats = query.getResultList();
		
		tx.commit();
		
		em.close();
		
		return lesPlats;

	}

}
