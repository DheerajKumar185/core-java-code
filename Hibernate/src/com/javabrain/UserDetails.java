package com.javabrain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@Entity (name="Userdetails")	//this is use for user define table
@Table (name="USER_DETAILS")	//this is use for user define table
public class UserDetails {
//	@Id		//this is use for define the primary key. 
//	@Column (name="USER_ID")
//	@Id @GeneratedValue(strategy=GenerationType.AUTO)		//this is use for define the primary key. it takes next number automatically.
//	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)	//Maintain the sequence
	private int userId;
	
//	@Column (name="USER_NAME")
//	@Basic (fetch) 	//
//	@Transient		// this is used to skip the next column name
	private String userName;
	@Temporal (TemporalType.DATE) 	//this is used to save only current date not save the time
//	@Temporal (TemporalType.TIME) 	//this is used to save only current date and time with mili seconds
	private Date joinedDate;
	private String Address;
	@Lob	//use lorge value BLob is use for byte data type and CLob is use for Character data type
	private String decription;
	
	@Id
	@Column (name="userId")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Column (name="user_name")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}	

}
