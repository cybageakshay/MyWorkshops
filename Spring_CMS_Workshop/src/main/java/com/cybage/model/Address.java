package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int addressId;
	  private String state;
	  private String  city;
	  @OneToOne
	  private Customer customer;
	public Address(int addressId, String state, String city, Customer customer) {
		super();
		this.addressId = addressId;
		this.state = state;
		this.city = city;
		this.customer = customer;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", state=" + state + ", city=" + city + ", customer=" + customer
				+ "]";
	}
	  

}
