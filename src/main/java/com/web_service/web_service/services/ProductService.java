package com.web_service.web_service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_service.web_service.entities.Product;
import com.web_service.web_service.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		
		Optional<Product> objProduct =  productRepository.findById(id);
		return objProduct.get();
	}
}
