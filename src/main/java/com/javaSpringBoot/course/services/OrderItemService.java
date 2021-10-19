package com.javaSpringBoot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaSpringBoot.course.entities.OrderItem;
import com.javaSpringBoot.course.repositories.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository repository;

	public List<OrderItem> findAll() {
		return repository.findAll();
	}

	public OrderItem finById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}

}
