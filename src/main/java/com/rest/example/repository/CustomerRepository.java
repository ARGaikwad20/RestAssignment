package com.rest.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.example.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
}
