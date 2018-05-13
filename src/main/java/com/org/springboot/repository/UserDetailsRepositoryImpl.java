package com.org.springboot.repository;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springboot.model.UserDetails;

@Repository
public class UserDetailsRepositoryImpl implements UserDetailsRepository {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Long save(UserDetails userDetails) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Serializable id = session.save(userDetails);
		tx.commit();
		session.close();
		return (Long)id;
		
	}

}
