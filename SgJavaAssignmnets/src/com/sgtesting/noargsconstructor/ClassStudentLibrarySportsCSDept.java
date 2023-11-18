package com.sgtesting.noargsconstructor;

class Student
{
	String StudentName;
	String StudentID;
	String Branch;
	String Block;
	String StuLocation;

	Student ()
	{
		StudentName="Ranav";
		StudentID="1GU101617";
		Branch="Mechanical Engineering";
		Block="C-Block";
		StuLocation="Koratagere";
		System.out.println("StudentName:"+StudentName);
		System.out.println("StudentID:"+StudentID);
		System.out.println("Branch:"+Branch);
		System.out.println("Block:"+Block);
		System.out.println("StuLocation:"+StuLocation);
		System.out.println("*************************");
	}
}

class Library
{
	String StudentID;
	String LibID;
	String BookName;
	String Author;
	String IssueDate;

	Library ()
	{
		StudentID="1GU101617";
		LibID="1GULib001";
		BookName="Turbo Machines";
		Author="Rakshith";
		IssueDate="15/10/2015";
		System.out.println("StudentID:"+StudentID);
		System.out.println("LibID:"+LibID);
		System.out.println("BookName:"+BookName);
		System.out.println("Author:"+Author);
		System.out.println("IssueDate:"+IssueDate);
		System.out.println("*************************");
	}
}

class Sports
{
	String StudentID;
	String SportName;
	String Coach;
	String GrondType;
	String SportEquip;

	Sports ()
	{
		StudentID="1GU101617";
		SportName="Cricket";
		Coach="Dhoni";
		GrondType="Outdoor";
		SportEquip="Bat and Ball";
		System.out.println("StudentID:"+StudentID);
		System.out.println("SportName:"+SportName);
		System.out.println("Coach:"+Coach);
		System.out.println("GroundType:"+GrondType);
		System.out.println("SportEquip:"+SportEquip);
		System.out.println("*************************");
	}
}

class CSdept
{
	String StudentID;
	String LabName;
	String LabID;
	String GuideName;
	String LabDay;

	CSdept ()
	{
		StudentID="1GU101617";
		LabName="Java";
		LabID="GUCS01";
		GuideName="Prabhakar";
		LabDay="Friday";
		System.out.println("StudentID:"+StudentID);
		System.out.println("LabName:"+LabName);
		System.out.println("LabID:"+LabID);
		System.out.println("GuideName:"+GuideName);
		System.out.println("LabDay:"+LabDay);
	}
}

public class ClassStudentLibrarySportsCSDept {

	public static void main(String[] args) {
		// create a class for student,library,sports,csdept and execute each members of the class?

		Student stu=new Student();

		Library lib=new Library();

		Sports spo=new Sports();

		CSdept cs=new CSdept();

	}

}
