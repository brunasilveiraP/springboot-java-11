package com.javaSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaSpringBoot.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
