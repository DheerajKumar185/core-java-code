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
		user.setUserId(6);
		user.setUserName("Dheeraj Kumar");
		Address c_addr = new Address();
		c_addr.setStreet("Sr. No. 207, Front of IBM Company");
		c_addr.setCity("Pune");
		c_addr.setState("Maharashtra");
		c_addr.setPincode("412308");
		user.setCurrentAddress(c_addr);
		Address p_addr = new Address();
		p_addr.setStreet("TSB - 112, Bina Project");
		p_addr.setCity("Sonbhadra");
		p_addr.setState("Uttar Pradesh");
		p_addr.setPincode("231220");
		user.setPermanentAddress(p_addr);
		user.setJoiningDate(new Date());
		user.setDescription("I am working in Techsignia, It's a CMM Level 5 Company");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        
        user = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        user = (UserDetails)session.get(UserDetails.class, 6);
        System.out.println("User_Id : " + user.getUserId() + "\n" + "User_Name : " + user.getUserName() + "\n" + "Street : " + user.getCurrentAddress().getStreet() + "\n" + "City : " + user.getCurrentAddress().getCity() + "\n" + "State : " + user.getCurrentAddress().getState() + "\n" + "Pincode : " + user.getCurrentAddress().getPincode() + "\n" + "Home_Street : " + user.getPermanentAddress().getStreet() + "\n" + "Home_City : " + user.getPermanentAddress().getCity() + "\n" + "Home_State : " + user.getPermanentAddress().getState() + "\n" + "Home_Pincode : " + user.getPermanentAddress().getPincode() + "\n" + "Date of joining : " + user.getJoiningDate() + "\n" + "Description : " + user.getDescription() + "\n");
		}
}
