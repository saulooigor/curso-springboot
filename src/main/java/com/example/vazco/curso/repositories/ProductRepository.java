package com.example.vazco.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vazco.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
