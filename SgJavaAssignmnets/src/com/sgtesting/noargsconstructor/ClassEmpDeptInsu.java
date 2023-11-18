package com.sgtesting.noargsconstructor;

class Employee
{
	String EmpNumber;
	String EmpName;
	String EmpJob;
	int EmpSalary;
	String EmpLocation;
	
	Employee ()
	{
		EmpNumber="1SG001";
		EmpName="Ranav";
		EmpJob="QA-Engineer";
		EmpSalary=68900;
		EmpLocation="Bengaluru";
		System.out.println("EmpNumber:"+EmpNumber);
		System.out.println("EmpName:"+EmpName);
		System.out.println("EmpJob:"+EmpJob);
		System.out.println("EmpSalary:"+EmpSalary);
		System.out.println("EmpLocation:"+EmpLocation);
		System.out.println("****************************");
	}
}

class Department
{
	String EmpNumber;
	String DeptID;
	String DeptName;
	String DeptBlock;
	String DeptLocation;
	
	Department()
	{
		EmpNumber="1SG001";
		DeptID="Dept-03";
		DeptName="QA-Engineer";
		DeptBlock="A-Block";
		DeptLocation="Bengaluru";
		System.out.println("EmpNumber:"+EmpNumber);
		System.out.println("DeptID:"+DeptID);
		System.out.println("DeptName:"+DeptName);
		System.out.println("DeptBlock:"+DeptBlock);
		System.out.println("DeptLocation:"+DeptLocation);
		System.out.println("****************************");
	}
}

class Insurance
{
	String EmpNumber;
	String PolicyName;
	long PolicyNumber;
	long   PolicyAmount;
	String StartDate;
	String EndDate;
	
	Insurance ()
	{
		EmpNumber="1SG001";
		PolicyName="Health Insurance";
		PolicyNumber=123456;
		PolicyAmount=25000;
		StartDate="10/10/2022";
		EndDate="1211/2024";
		System.out.println("EmpNumber:"+EmpNumber);
		System.out.println("PolicyName:"+PolicyName);
		System.out.println("PolicyNumber:"+PolicyNumber);
		System.out.println("PolicyAmount:"+PolicyAmount);
		System.out.println("StartDate:"+StartDate);
		System.out.println("EndDate:"+EndDate);
	}
}


public class ClassEmpDeptInsu {

	public static void main(String[] args) {
		// create a class for employee,department,insurance and execute each class members?

		Employee employee=new Employee();
		
		Department dept=new Department();
		
		Insurance insu=new Insurance();
		
	}

}
