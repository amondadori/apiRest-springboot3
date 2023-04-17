package com.andreyRest.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreyRest.projetoSpring.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
