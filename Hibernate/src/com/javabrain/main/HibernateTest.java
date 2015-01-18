package com.javabrain.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrain.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(14);
		user.setUserName("Deepak Kumar");
		user.setAddress("TSB - 112, Bina Project, Sonbhadra, U.P. 231220");
		user.setJoinedDate(new Date());	//this is save the Current date and time
		user.setDecription("He is doing B.Tech from United College, Allahabad");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails)session.get(UserDetails.class, 13);
		System.out.println("User_Id : " + user.getUserId() + "\n" + "User_Name : " + user.getUserName() + "\n" + "Address : " + user.getAddress() + "\n" + "Date of joining : " + user.getJoinedDate() + "\n" + "Description : " + user.getDecription() + "\n");

	}

}
