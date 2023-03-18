package com.web_service.web_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_service.web_service.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
