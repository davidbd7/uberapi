package com.example.uberdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "customer_2")
 
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "customer_id")
	private Integer customerId;
	
	
	@Column(name = "first_name")
	 String firstName;
	
	@Column(name = "last_name")
	 String lastName;
	
	@Column(name = "customer_rating")
	Integer customerRating;
	
	
	
	public User() {
		
	}
	
	
	public User(/*Integer customerId,*/ String firstName, String lastName, Integer customerRating) {
		super();
		
		//this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerRating = customerRating;
	}
	public Integer getId() {
		return customerId;
	}
	public void setId(Integer id) {
		this.customerId = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getCustomerRating() {
		return customerRating;
	}
	public void setCustomerRating(Integer customerRating) {
		this.customerRating = customerRating;
	}
	

}
