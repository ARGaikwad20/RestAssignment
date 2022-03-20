package com.rest.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
