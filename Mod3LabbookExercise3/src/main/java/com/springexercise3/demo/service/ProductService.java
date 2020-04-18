package com.springexercise3.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springexercise3.demo.model.Product;
import com.springexercise3.demo.repository.ProductJpaRepo;

@Service
public class ProductService {

	@Autowired
	ProductJpaRepo repo;
     
	public List<Product> findAll()
	{
		return repo.findAll();
	}
    
	public Product getOne(int productId)
	{
        return repo.getOne(productId);
	}
	
	@Transactional
	public Product save(Product product)
	{
		return repo.save(product);
	}
	
	@Transactional
	public boolean deleteById(int productId)
	{
		repo.deleteById(productId);
		return !repo.existsById(productId);
	}
	
	@Transactional
	public Product updateProduct(Product newProduct)
	{
		Product oldProduct=getOne(newProduct.getProductId());
		oldProduct.setProductName(newProduct.getProductName());
		oldProduct.setProductPrice(newProduct.getProductPrice());
		repo.save(oldProduct);
		return oldProduct;
	}

}
