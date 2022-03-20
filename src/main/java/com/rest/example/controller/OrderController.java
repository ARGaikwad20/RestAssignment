package com.rest.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.example.entity.Orders;
import com.rest.example.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	//POST Method / POST EndPoint
	// Add order API 
	@PostMapping("/addOrder")
	public Orders addorder(@RequestBody Orders order) {
		return service.saveOrder(order);
	}
	
	//GET Method / GET EndPoint
	// Fetch Order API 
	@GetMapping("/allOrders")
	public List<Orders> findAllOrders() {
		return service.getOrders();
	}
	
}
