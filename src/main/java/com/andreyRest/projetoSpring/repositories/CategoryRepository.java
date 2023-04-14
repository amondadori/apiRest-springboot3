package com.andreyRest.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreyRest.projetoSpring.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
}
