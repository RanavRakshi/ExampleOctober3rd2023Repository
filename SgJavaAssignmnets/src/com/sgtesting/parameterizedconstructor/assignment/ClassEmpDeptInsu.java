package com.sgtesting.parameterizedconstructor.assignment;

class Employee
{
	String EmpNumber;
	String EmpName;
	String EmpJob;
	int EmpSalary;
	String EmpLocation;
	
	Employee (String EmpNum,String EmpNam,String Empjob,int EmpSal,String EmpLoc)
	{
		EmpNumber=EmpNum;
		EmpName=EmpNam;
		EmpJob=Empjob;
		EmpSalary=EmpSal;
		EmpLocation=EmpLoc;
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
	
	Department(String EmpNum,String DeprtID,String DepNam,String DepBlo,String DepLoc)
	{
		EmpNumber=EmpNum;
		DeptID=DeprtID;
		DeptName=DepNam;
		DeptBlock=DepBlo;
		DeptLocation=DepLoc;
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
	
	Insurance (String EmpNum,String PloNam,long PolNum,long PolAmo,String StDat,String EndDt)
	{
		EmpNumber=EmpNum;
		PolicyName=PloNam;
		PolicyNumber=PolNum;
		PolicyAmount=PolAmo;
		StartDate=StDat;
		EndDate=EndDt;
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

		Employee employee=new Employee("1SG001","Ranav","QA-Engineer",65025,"Bengaluru");
		
		Department dept=new Department("1SG001","1SGDEP03","QA","A-Block","Bengaluru");
		
		Insurance insu=new Insurance("1SG001","Health Insurance",123456,25000,"10/10/2021","10/12/2024");
		
	}

}
