package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Customer;
import com.cybage.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
  CustomerRepository customerRepository;
	public void addCustomer(Customer customer) {
	customerRepository.save(customer);
		
	}
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
		 
	}
	public Customer getCustomerById(int id) {
		  return customerRepository.findById(id).orElse(null);
	
	}
	public void deleteCustomerById(int id) {
		  customerRepository.deleteById(id);
		
	}
	public void updateCustomer(int id, Customer customer) {
		customerRepository.save(customer);
	}
	public List<Customer> getAllCustomersByName(String name) {
		return customerRepository.findByCustName(name);
	}

}
