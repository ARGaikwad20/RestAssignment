package com.rest.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.example.entity.Customer;
import com.rest.example.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	//POST Method 
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	//GET Method 
	public List<Customer> getCustomers() {
		return repository.findAll();
	}
	
	
}
