package DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import Bean.Restaurant;

public class RestaurantDAO {

	public static ArrayList<Restaurant> getRestaurants(){
		
		ArrayList<Restaurant> lesRestaurants = null;
		EntityManager em = JPAUtil.getEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query query = em.createQuery("From Restaurant");
		
		lesRestaurants = (ArrayList<Restaurant>) query.getResultList();
		tx.commit();
		
		em.close();
		
		return lesRestaurants;
	}
}
