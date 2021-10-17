package com.javaSpringBoot.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaSpringBoot.course.entities.User;
import com.javaSpringBoot.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User finById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}