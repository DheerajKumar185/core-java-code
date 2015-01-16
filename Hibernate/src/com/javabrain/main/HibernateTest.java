package com.javabrain.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrain.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(2);
		user.setUserName("Dheeraj Kumar");
		user.setAddress("Sr. No. 207, Sahyog, front of IBM Company, Tukai Darshan, Pune, Maharashtra, India 412308");
		user.setJoinedDate(new Date());	//this is save the Current date and time
		user.setDecription("I am working in Techsignia, It's a CMM Level 5 Company");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		

	}

}
