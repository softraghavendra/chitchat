package com.org.springboot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springboot.model.User;
import com.org.springboot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public boolean isUserExists(){
		return true;
	}
	
	public Long save(User user){
		return userRepository.save(user);
	}
	
	public List<User> getAllUsers(){
		return userRepository.getAllUsers();
	}
	
	public User getUserById(Long id){
		return userRepository.getUserById(id);
	}
	
	public void update(Long id, User user){
		userRepository.update(id, user);
	}
}
