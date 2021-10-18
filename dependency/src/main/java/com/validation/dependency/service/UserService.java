package com.validation.dependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.dependency.model.User;
import com.validation.dependency.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public User createUser(User user) {
		return repository.save(user);
	}
	

}
