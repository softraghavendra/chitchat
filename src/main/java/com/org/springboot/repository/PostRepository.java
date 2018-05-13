package com.org.springboot.repository;

import java.util.List;

import com.org.springboot.model.Post;

public interface PostRepository {

	public Long save(Post post);
	public List<Post> getAllPosts();
	public Post getPostById();
	public void deletePost(Post post);
	public void update(Post post);
}
