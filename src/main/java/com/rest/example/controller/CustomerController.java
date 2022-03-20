package com.rest.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.example.entity.Customer;
import com.rest.example.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	//POST Method / POST EndPoint
	// Add Customer API 
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	
	//GET Method / GET EndPoint
	// Fetch Customer API 
	@GetMapping("/customers")
	public List<Customer> findAllProducts() {
		return service.getCustomers();
	}
	
	
	
}
