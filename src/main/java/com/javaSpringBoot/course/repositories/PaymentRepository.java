package com.javaSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaSpringBoot.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
