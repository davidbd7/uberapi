package com.example.uberdemo.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uberdemo.model.User;
import com.example.uberdemo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User>getAllUsers(){
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
		
	}
	
	
	public Optional<User> getUser(Integer id) {
		return userRepository.findById(id);
		
	}
	
	
	
	public void createUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(Integer id, User user) {
		userRepository.save(user);
	}
	
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
	
	
	
}
