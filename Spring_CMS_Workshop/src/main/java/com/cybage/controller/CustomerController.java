package com.cybage.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exceptions.RecordNotFoundException;
import com.cybage.model.Customer;

import com.cybage.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
CustomerService custService;
	@PostMapping("/addustomer")
	  public ResponseEntity<String> addCustomer(@RequestBody  Customer customer) {
			System.out.println(customer);
			custService.addCustomer(customer);
		return new  ResponseEntity<String>("customer Addeed Success",HttpStatus.OK);
		
	}
	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>>getAllCustomer(){
		List<Customer>customers= custService.getAllCustomers();
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
		
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<Customer>getCustomerById(@PathVariable int id){
		  Customer customer=custService.getCustomerById(id);
		  if(customer==null) {
			  throw new RecordNotFoundException("Record Not Found");
		  }
		  else {
			  return new  ResponseEntity<Customer>(customer,HttpStatus.OK);
		  }
		
	}
	@DeleteMapping("/deleteById/{id}")
	
	public ResponseEntity<String>deleteCustomerById(@PathVariable int id){
		custService.deleteCustomerById(id);
		return new ResponseEntity<String>("Customer is Deleted",HttpStatus.OK);
	}
	@PutMapping("/updateCustomerById/{id}")
	
	public ResponseEntity<String>updateCustomer(@PathVariable int id, @RequestBody Customer customer){
		custService.updateCustomer(id,customer);
		return new ResponseEntity<String>("String is Updated",HttpStatus.OK);
		
	}
	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<Customer>>getAllCustomerByname(@PathVariable String name){
		  List<Customer>customerList=custService.getAllCustomersByName(name);
		return new  ResponseEntity<List<Customer>>(customerList,HttpStatus.OK);
		
	}

}
