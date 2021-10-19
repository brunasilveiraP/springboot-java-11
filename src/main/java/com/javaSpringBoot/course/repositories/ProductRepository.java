package com.javaSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaSpringBoot.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
