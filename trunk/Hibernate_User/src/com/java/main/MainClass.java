package com.java.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.Address;
import com.java.Users;

public class MainClass {

	public static void main(String[] args) {
		Users user = new Users();
		user.setUserId(10);
		user.setUserName("Tenth User");
		Address c_addr = new Address();
		c_addr.setStreet("Sr. No. 207, Front of IBM Company");
		c_addr.setCity("Pune");
		c_addr.setState("Maharashtra");
		user.setCurrentAddress(c_addr);
		Address p_addr = new Address();
		p_addr.setStreet("TSB - 112, Bina Project");
		p_addr.setCity("Sonbhadra");
		p_addr.setState("Uttar Predesh");
		user.setPermanentAddress(p_addr);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (Users)session.get(Users.class, 10);
		System.out.println("User_Id : " + user.getUserId() + "\n" + "User_Name : " + user.getUserName() + "\n" + "Street : " + user.getCurrentAddress().getStreet() + "\n" + "City : " + user.getCurrentAddress().getCity() + "\n" + "State : " + user.getCurrentAddress().getState() + "\n" + "Home_Street : " + user.getPermanentAddress().getStreet() + "\n" + "Home_City : " + user.getPermanentAddress().getCity() + "\n" + "Home_State : " + user.getPermanentAddress().getState() + "\n");

	}

}
