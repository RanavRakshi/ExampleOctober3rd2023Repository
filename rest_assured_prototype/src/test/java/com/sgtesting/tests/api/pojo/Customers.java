package com.sgtesting.tests.api.pojo;

public class Customers {

	private String address;
	private String customerName;
	private String emailId;
	private String location;
	private String phoneNumber;
	
	
	public Customers() {
		super();
	}

	public Customers(String address, String customerName, String emailId, String location, String phoneNumber) {
		super();
		this.address = address;
		this.customerName = customerName;
		this.emailId = emailId;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
