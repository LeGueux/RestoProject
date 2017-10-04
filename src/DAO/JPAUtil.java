package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;

public class JPAUtil {
	
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Resto");
	
	public static EntityManager getEntityManager()
	{
		return emf.createEntityManager();
	}
	public static CriteriaBuilder getCriteriaBuilder()
	{
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Resto");
		return emf.getCriteriaBuilder();
	}
}
