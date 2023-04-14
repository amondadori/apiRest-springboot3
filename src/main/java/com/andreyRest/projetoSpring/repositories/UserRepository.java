package com.andreyRest.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreyRest.projetoSpring.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
}
