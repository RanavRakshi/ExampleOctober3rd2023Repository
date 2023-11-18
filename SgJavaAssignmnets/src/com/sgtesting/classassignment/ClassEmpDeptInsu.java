package com.sgtesting.classassignment;

class Employee
{
	String EmpNumber;
	String EmpName;
	String EmpJob;
	int EmpSalary;
	String EmpLocation;
}

class Deparatment
{
	String EmpNumber;
	String DeptID;
	String DeptName;
	String DeptBlock;
	String DeptLocation;
}

class Insurance
{
	String EmpNumber;
	String PolicyName;
	long PolicyNumber;
	long   PolicyAmount;
	String StartDate;
	String EndDate;
}


public class ClassEmpDeptInsu {

	public static void main(String[] args) {
		// create a class for employee,department,insurance and execute each class members?

		Employee employee=new Employee();
		employee.EmpNumber="1SG001";
		employee.EmpName="Ranav";
		employee.EmpJob="QA-Engineer";
		employee.EmpSalary=68900;
		employee.EmpLocation="Bengaluru";
		System.out.println("EmpNumber:"+employee.EmpNumber);
		System.out.println("EmpName:"+employee.EmpName);
		System.out.println("EmpJob:"+employee.EmpJob);
		System.out.println("EmpSalary:"+employee.EmpSalary);
		System.out.println("EmpLocation:"+employee.EmpLocation);
		System.out.println("****************************");
		Deparatment dept=new Deparatment();
		dept.EmpNumber="1SG001";
		dept.DeptID="Dept-03";
		dept.DeptName="QA-Engineer";
		dept.DeptBlock="A-Block";
		dept.DeptLocation="Bengaluru";
		System.out.println("EmpNumber:"+dept.EmpNumber);
		System.out.println("DeptID:"+dept.DeptID);
		System.out.println("DeptName:"+dept.DeptName);
		System.out.println("DeptBlock:"+dept.DeptBlock);
		System.out.println("DeptLocation:"+dept.DeptLocation);
		System.out.println("****************************");
		Insurance insu=new Insurance();
		insu.EmpNumber="1SG001";
		insu.PolicyName="Health Insurance";
		insu.PolicyNumber=123456;
		insu.PolicyAmount=25000;
		insu.StartDate="10/10/2022";
		insu.EndDate="1211/2024";
		System.out.println("EmpNumber:"+insu.EmpNumber);
		System.out.println("PolicyName:"+insu.PolicyName);
		System.out.println("PolicyNumber:"+insu.PolicyNumber);
		System.out.println("PolicyAmount:"+insu.PolicyAmount);
		System.out.println("StartDate:"+insu.StartDate);
		System.out.println("EndDate:"+insu.EndDate);
		
		
	}

}
