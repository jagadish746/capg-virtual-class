package com.springexercise3.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springexercise3.demo.model.Product;
import com.springexercise3.demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {

	@Autowired
	ProductService service;
	
	@GetMapping("/all")
	public List<Product> findAll()
	{
		return service.findAll();
	}
	
	@GetMapping("/product/id/{id}")
	public Product getOne(@PathVariable int id)
	{
		return service.getOne(id);
	}
	
	@PostMapping("/add")
	public Product save(@RequestBody Product product)
	{
		return service.save(product);
	}
	
	@DeleteMapping("/product/id/{id}")
	public boolean deleteById(@PathVariable int id)
	{
		return service.deleteById(id);
	}
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product)
	{
		return service.updateProduct(product);
	}
}
