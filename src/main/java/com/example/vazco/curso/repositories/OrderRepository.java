package com.example.vazco.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vazco.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
