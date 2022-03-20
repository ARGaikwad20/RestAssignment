package com.rest.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.example.entity.Orders;
import com.rest.example.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	//POST Method 
	public Orders saveOrder(Orders order) {
		return repository.save(order);
	}
	
	//GET Method 
	public List<Orders> getOrders() {
		return repository.findAll();
	}
	
}
