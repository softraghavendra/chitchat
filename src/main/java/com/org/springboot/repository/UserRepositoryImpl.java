package com.org.springboot.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springboot.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Long save(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Serializable id = session.save(user);
		tx.commit();
		session.close();
		return (Long)id;
	}

	@Override
	public User getUserById(Long id) {
		Session session = sessionFactory.openSession();
		User user = session.get(User.class, id);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		Session session = sessionFactory.openSession();
		List<User> users = session.createQuery("from User").list();
		session.close();
		return users;
	}

	@Override
	public void update(Long id, User user) {
		// TODO Auto-generated method stub
		
	}

}
