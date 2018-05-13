package com.org.springboot.repository;

import com.org.springboot.model.UserDetails;

public interface UserDetailsRepository {
	
	public Long save(UserDetails userDetails);

}
