package com.org.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springboot.model.UserDetails;
import com.org.springboot.repository.UserDetailsRepository;

@Service
public class UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	public Long save(UserDetails userDetails){
		return userDetailsRepository.save(userDetails);
	}
	
	
}
