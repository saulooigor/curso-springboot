package com.example.vazco.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vazco.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
