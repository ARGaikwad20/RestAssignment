package com.rest.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.example.entity.Product;
import com.rest.example.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	//POST Method / POST EndPoint
	// Add Product API 
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	//GET Method / GET EndPoint
	// Fetch Product API 
	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}
	
}
