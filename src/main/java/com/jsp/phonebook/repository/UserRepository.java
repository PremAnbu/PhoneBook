package com.jsp.phonebook.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.phonebook.entity.User;
@Repository
public class UserRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public void saveUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		entityManager.close();
	}
	
	public User getUserById(int id) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		User user=entityManager.find(User.class, id);
		entityTransaction.commit();
		
		entityManager.close();
		return user;
	}
	
	

	public void updateUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
		
		entityManager.close();
	}
	
	public void deleteUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(user);
		
		entityTransaction.commit();
		entityManager.close();
	}

	
//	Configuration con=new Configuration().configure().addAnnotatedClass(User.class);
//	SessionFactory factory=con.buildSessionFactory();
//	
//	public String saveUser(User user) {
//		Session session = factory.openSession();
//		Transaction ts = session.beginTransaction();
//		session.save(user);
//		ts.commit();
//		session.close();
//		return "User Successfully saved...........!";
//	}
//	
//	public User getUserById(int id) {
//		Session session=factory.openSession();
//		User user=session.get(User.class, id);
//		System.out.println(user);
//		session.close();
//		return user;
//	}
//	
//	
//	@SuppressWarnings({ "unchecked"})
//	public List<User> getAllUser(){
//		Session session=factory.openSession();
//		@SuppressWarnings("rawtypes")
//		Query q= session.createQuery("from User");
//		return q.list();
//	}
//	
//	public String deleteUser(User user) {
//		Session session = factory.openSession();
//		Transaction tr=session.beginTransaction();
//		session.delete(user);
//		tr.commit();
//		session.close();
//		return "User Successfully deleted...........!";
//	}
//	
//	public String updateuser(User user) {
//		Session session = factory.openSession();
//		Transaction tr=session.beginTransaction();
//		session.update(user);
//		tr.commit();
//		session.close();
//		return "User Successfully updated...........!";
//	}

}
