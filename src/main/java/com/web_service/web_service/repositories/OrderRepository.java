package com.web_service.web_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_service.web_service.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
