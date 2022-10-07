package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
@Entity
@Table(name="orders")
public class OrderItem {

	@Id
	@GeneratedValue
	@Column(name="ID")
	int id;
	@ManyToOne(cascade=CascadeType.MERGE)
	private Customer customer;
	@ManyToOne(cascade=CascadeType.MERGE)
	private MovieItem movie; 
	
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}
	public OrderItem(Customer customer, MovieItem movie) {
		setCustomer(customer);
		setMovie(movie);
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public MovieItem getMovie() {
		return movie;
	}
	public void setMovie(MovieItem movie) {
		this.movie = movie;
	}
	
	
}
