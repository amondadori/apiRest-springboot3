package com.andreyRest.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreyRest.projetoSpring.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
}
