package com.javaSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaSpringBoot.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
