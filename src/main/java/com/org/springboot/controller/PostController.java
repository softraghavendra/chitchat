package com.org.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.springboot.model.Post;
import com.org.springboot.service.PostService;

@RestController
@RequestMapping("/chitchat")
public class PostController {

	@Autowired
	PostService postService;
	
	@PostMapping("/posts")
	public Long save(@RequestBody Post post){
		return postService.save(post);
	}
	
}
