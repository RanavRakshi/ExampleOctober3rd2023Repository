package com.sgtesting.tests.pojo;

public class Employee {
	
	private int empID;
	private String empName;
	private String jobName;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int empID, String empName, String jobName, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.jobName = jobName;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
