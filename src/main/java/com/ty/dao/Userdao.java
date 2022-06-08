package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.User;

public class Userdao {
	
	public 	User saveUser(User user) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction .begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}
	
	public User validateUser(String email, String password) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql="SELECT u FROM User u WHERE u.email=?1 AND u.password=?2";

		Query query=entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User>user=query.getResultList();

		if(user.size()>0)
			return user.get(0);
		else
			return null;
	}


}
