package com.andreyRest.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreyRest.projetoSpring.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
}
