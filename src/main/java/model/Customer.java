package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="ID")
	int customerId;
	@Column(name="name")
	String customerName;
	@Column(name="city")
	String city;
	@Column(name="title")
	String state;
	
	//default no arg constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor with all arguments
	public Customer(String customerName, String city, String state) {
		setCustomerName(customerName);
		setCity(city);
		setState(state);
	}
	
	//constructor with just name
	public Customer(String customerName) {
		setCustomerName(customerName);
		setCity("Not Provided");
		setState("Not Provided");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	public void setState(String state) {
		this.state = state;
	}
}
