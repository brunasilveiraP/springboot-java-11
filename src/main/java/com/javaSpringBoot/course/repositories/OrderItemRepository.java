package com.javaSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaSpringBoot.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
