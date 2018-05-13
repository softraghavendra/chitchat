package com.org.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.springboot.model.User;
import com.org.springboot.model.UserDetails;
import com.org.springboot.service.UserDetailsService;
import com.org.springboot.service.UserService;

@RestController
@RequestMapping("/chitchat")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	/* following method save user with userDetails     */
	@PostMapping("/users")
	public Long save(@RequestBody User user){
		return userService.save(user);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUserByUserId(@PathVariable(name="id") Long uid){
		return userService.getUserById(uid);
	}
	
	@PutMapping("/users/{id}")
	public void update(@PathVariable(name="id", required=true) Long id, @RequestBody User user){
		userService.update(id, user);
	}
	
	/* following method save userDetails only  */
	@PostMapping("users/{id}/userDetails")
	public Long save(@PathVariable(name="id") Long uid, @RequestBody UserDetails userDetails){
		userDetails.setId(uid);
		return userDetailsService.save(userDetails);
	}
	

}
