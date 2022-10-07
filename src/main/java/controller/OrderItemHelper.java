package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import model.OrderItem;

/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
public class OrderItemHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Week5Assessment");

	public OrderItemHelper() {
		super();
	}

	public void insertItem(OrderItem mi) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(mi);
		em.getTransaction().commit();
		em.close();
	}

	public List<OrderItem> showAllItems() {
		EntityManager em = emfactory.createEntityManager();
		List<OrderItem> allItems = em.createQuery("SELECT i FROM OrderItem i").getResultList();
		return allItems;
	}


	public OrderItem searchForItemById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		OrderItem found = em.find(OrderItem.class, idToEdit);
		em.close();
		return found;
	}
	
	public List<OrderItem> searchForItemByIdx(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<OrderItem> typedQuery = em.createQuery("select mi from OrderItem mi where mi.ID = :selectedID",
				OrderItem.class);
		typedQuery.setParameter("selectedID", idToEdit);
		List<OrderItem> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	

	public void cleanUp() {
		emfactory.close();
	}

}

