package com.javabrain.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrain.Address;
import com.javabrain.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("Dheeraj Kumar");
		Address addr = new Address();
		addr.setStreet("TSB - 112, Bina Project");
		addr.setCity("Sonbhadra");
		addr.setState("Uttar Predesh");
		addr.setPincode("231220");
		user.setAddress(addr);
//		user.setAddress("TSB - 112, Bina Project, Sonbhadra, U.P. 231220");
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
		user = (UserDetails)session.get(UserDetails.class, 1);
		System.out.println("User_Id : " + user.getUserId() + "\n" + "User_Name : " + user.getUserName() + "\n" + "Street : " + user.getAddress().getStreet() + "\n" + "City : " + user.getAddress().getCity() + "\n" + "State : " + user.getAddress().getState() + "\n" + "Pincode : " + user.getAddress().getPincode() + "\n" + "Date of joining : " + user.getJoinedDate() + "\n" + "Description : " + user.getDecription() + "\n");

	}

}
