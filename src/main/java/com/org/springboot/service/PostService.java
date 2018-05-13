package com.org.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springboot.model.Post;
import com.org.springboot.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepository;
	
	public Long save(Post post){
		return postRepository.save(post);
	}

}
