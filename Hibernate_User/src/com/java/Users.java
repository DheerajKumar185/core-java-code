package com.java;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Users {
	@Id
	@Column(name="USER_ID")
	private int userId;
	@Column(name="USER_NAME")
	private String userName;
	@Embedded
	private Address currentAddress;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride (name="street", column=@Column(name="HOME_STREET_NAME")),
		@AttributeOverride (name="city", column=@Column(name="HOME_CITY_NAME")),
		@AttributeOverride (name="state", column=@Column(name="HOME_STATE_NAME")),
		@AttributeOverride (name="pincode", column=@Column(name="HOME_PIN_CODE"))
	})
	private Address permanentAddress;
		public Address getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
		public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
