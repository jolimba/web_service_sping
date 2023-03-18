package com.web_service.web_service.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_service.web_service.entities.Product;
import com.web_service.web_service.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService ProductService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		
		List<Product> ProductList = ProductService.findAll();
		
		return ResponseEntity.ok().body(ProductList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = ProductService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
