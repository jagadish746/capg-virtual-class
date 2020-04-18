package com.springexercise3.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springexercise3.demo.model.Product;

public interface ProductJpaRepo  extends JpaRepository<Product,Integer>{

	
}
