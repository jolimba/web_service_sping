package com.web_service.web_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_service.web_service.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
