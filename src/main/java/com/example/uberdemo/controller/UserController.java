package com.example.uberdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.uberdemo.model.User;
import com.example.uberdemo.repository.UserRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("api/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/users") 
	public List<User> getAllUsers(){
		return userService.getAllUsers();
		
	}
	
	
	@RequestMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST, value = "/createUser")
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/updateUser/{id}")
	public void updateUser(@PathVariable Integer id, @RequestBody User user) {
		userService.updateUser(id, user);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
	
	
}
