package com.sgtesting.tests.assignments;

public class Users1 {
	
	   private String name;
	   private String job;
	   
	   
	public Users1() {
		super();
	}

	public Users1(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	private String email;
	private String password;
	
}
