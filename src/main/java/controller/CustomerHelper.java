package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Customer;



/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
public class CustomerHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Week5Assessment");

	public CustomerHelper() {
		super();
	}

	public void insertCustomer(Customer c) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}

	public List<Customer> showAllCustomers() {
		EntityManager em = emfactory.createEntityManager();
		List<Customer> allItems = em.createQuery("SELECT i FROM Customer i").getResultList();
		return allItems;
	}

	public void deleteCustomer(Customer toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Customer> typedQuery = em.createQuery(
				"select mi from Customer mi where mi.customerId =:selectedID",
				Customer.class);
		//typedQuery.setParameter("selectedTitle", toDelete.getMovieTitle());
		typedQuery.setParameter("selectedID", toDelete.getCustomerId());
		typedQuery.setMaxResults(1);
		Customer result = typedQuery.getSingleResult();
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	public Customer searchForCustomerById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Customer found = em.find(Customer.class, idToEdit);
		em.close();
		return found;
	}
	
	public List<Customer> searchForCustomerByIdx(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Customer> typedQuery = em.createQuery("select mi from Customer mi where mi.ID = :selectedID",
				Customer.class);
		typedQuery.setParameter("selectedID", idToEdit);
		List<Customer> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}


	public void updateCustomer(Customer toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();

	}


	public List<Customer> searchForCustomerByName(String customerName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Customer> typedQuery = em.createQuery("select mi from Customer mi where mi.title = :selectedTitle",
				Customer.class);
		typedQuery.setParameter("selectedName", customerName);
		List<Customer> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}
	


	public void cleanUp() {
		emfactory.close();
	}

}
