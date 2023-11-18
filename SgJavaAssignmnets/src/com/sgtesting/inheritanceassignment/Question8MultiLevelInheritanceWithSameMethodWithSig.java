 package com.sgtesting.inheritanceassignment;

// 8) WAP for multi-level inheritance in which each class contains same method name with signature?

class Employee
{
	String empid;
	String empname;
	
	Employee(String empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	void getdetails()
	{
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name: "+empname);
	}
}	
class Department extends Employee
{
		String dname;
		
		Department(String empid,String empname,String dname)
		{
			super(empid,empname);
			this.dname=dname;
		}
		
		void getdetails()
		{
			super.getdetails();
			System.out.println("Role: QA");
			System.out.println("Department Name: "+dname);
		}
}
	
class Transport extends Department
{
		String vehicleNo;
		
		Transport(String empid,String empname,String dname,String vehicleNo)
		{
			super(empid,empname,dname);
			
			this.vehicleNo=vehicleNo;
		}
		
		void getdetails()
		{
			super.getdetails();
			System.out.println("Cab Vehicle Number: "+vehicleNo);
		}
	
}
public class Question8MultiLevelInheritanceWithSameMethodWithSig {

	public static void main(String[] args) {
		
		Transport tra=new Transport("SG001","Ranav","Software Testing","KA06EG1234");
		System.out.println("Employee Details:");
		tra.getdetails();
		
		Department de=new Department("SG002", "Rakshith", "Software Development");
		System.out.println("Employee Details:");
		de.getdetails();
	}

}
