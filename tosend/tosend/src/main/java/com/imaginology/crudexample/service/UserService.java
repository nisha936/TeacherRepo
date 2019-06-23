package com.imaginology.crudexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginology.crudexample.entity.User;
import com.imaginology.crudexample.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> createUser(User user) {
		userRepository.save(user);
		List<User> users = userRepository.findAll();
		return users;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
