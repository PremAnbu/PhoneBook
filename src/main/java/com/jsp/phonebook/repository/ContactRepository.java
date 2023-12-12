package com.jsp.phonebook.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.phonebook.entity.Contact;

@Repository
public class ContactRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public void saveUser(Contact contact) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(contact);
		entityTransaction.commit();
		entityManager.close();
	}
//	
//	public void getUserById() {
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		entityManager.flush();
//		entityManager.close();
//		entityTransaction.commit();
//	}
	
	

	public void updateuser(Contact contact) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(contact);
		entityManager.close();
		entityTransaction.commit();
	}
	
	public void deleteUser(Contact contact) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(contact);
		entityManager.close();
		entityTransaction.commit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Configuration con=new Configuration().configure().addAnnotatedClass(Contact.class);
//	SessionFactory factory=con.buildSessionFactory();
//	
//	public String saveContact(Contact contact) {
//		Session session = factory.openSession();
//		Transaction ts = session.beginTransaction();
//		session.save(contact);
//		ts.commit();
//		session.close();
//		return "Conatct Successfully saved...........!";
//	}
//	
//	public Contact getContactById(int id) {
//		Session session=factory.openSession();
//		Contact contact=session.get(Contact.class, id);
//		System.out.println(contact);
//		session.close();
//		return contact;
//	}
//	
//	
//	@SuppressWarnings({ "unchecked"})
//	public List<Contact> getAllContact(){
//		Session session=factory.openSession();
//		@SuppressWarnings("rawtypes")
//		Query q= session.createQuery("from Contact");
//		return q.list();
//	}
//	
//	public String deleteContact(Contact contact) {
//		Session session = factory.openSession();
//		Transaction tr=session.beginTransaction();
//		session.delete(contact);
//		tr.commit();
//		session.close();
//		return "Contact Successfully deleted...........!";
//	}
//	
//	public String updateContact(Contact contact) {
//		Session session = factory.openSession();
//		Transaction tr=session.beginTransaction();
//		session.update(contact);
//		tr.commit();
//		session.close();
//		return "Contact Successfully updated...........!";
//	}

}
