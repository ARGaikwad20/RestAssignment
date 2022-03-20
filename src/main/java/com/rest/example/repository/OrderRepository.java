package com.rest.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.example.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
	
}
