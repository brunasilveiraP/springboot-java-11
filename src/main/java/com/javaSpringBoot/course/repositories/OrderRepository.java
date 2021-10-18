package com.javaSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaSpringBoot.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
