package com.sgtesting.tests.api.pojo;

public class Projects {

	private String description;
	private int projectCustomerId;
	private String projectDomain; 
	private String projectName;
	
	public Projects() {
		super();
	}

	public Projects(String description, int projectCustomerId, String projectDomain, String projectName) {
		super();
		this.description = description;
		this.projectCustomerId = projectCustomerId;
		this.projectDomain = projectDomain;
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProjectCustomerId() {
		return projectCustomerId;
	}

	public void setProjectCustomerId(int projectCustomerId) {
		this.projectCustomerId = projectCustomerId;
	}

	public String getProjectDomain() {
		return projectDomain;
	}

	public void setProjectDomain(String projectDomain) {
		this.projectDomain = projectDomain;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}	
}
