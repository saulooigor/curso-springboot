package com.example.vazco.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vazco.curso.entities.OrderItem;
import com.example.vazco.curso.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
