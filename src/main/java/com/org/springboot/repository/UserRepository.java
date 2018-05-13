package com.org.springboot.repository;


import java.util.List;

import com.org.springboot.model.User;


public interface UserRepository {
	
	public Long save(User user);
	public User getUserById(Long id);
	public List<User> getAllUsers();
	public void update(Long id, User user);
}
