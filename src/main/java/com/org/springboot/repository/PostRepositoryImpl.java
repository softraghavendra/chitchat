package com.org.springboot.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springboot.model.Post;

@Repository
public class PostRepositoryImpl implements PostRepository {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Long save(Post post) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Serializable id = session.save(post);
		tx.commit();
		session.close();
		return (Long) id;
	}

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPostById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Post post) {
		// TODO Auto-generated method stub
		
	}

}
