package com.example.vazco.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vazco.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
