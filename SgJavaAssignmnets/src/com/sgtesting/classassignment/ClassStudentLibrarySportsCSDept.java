package com.sgtesting.classassignment;

class Student
{
	String StudentName;
	String StudentID;
	String Branch;
	String Block;
	String StuLocation;
}

class Library
{
	String StudentID;
	String LibID;
	String BookName;
	String Author;
	String IssueDate;
}

class Sports
{
	String StudentID;
	String SportName;
	String Coach;
	String GrondType;
	String SportEquip;
}

class CSdept
{
	String StudentID;
	String LabName;
	String LabID;
	String GuideName;
	String LabDay;
}

public class ClassStudentLibrarySportsCSDept {

	public static void main(String[] args) {
		// create a class for student,library,sports,csdept and execute each members of the class?

		Student stu=new Student();
		stu.StudentName="Ranav";
		stu.StudentID="1GU101617";
		stu.Branch="Mechanical Engineering";
		stu.Block="C-Block";
		stu.StuLocation="Koratagere";
		System.out.println("StudentName:"+stu.StudentName);
		System.out.println("StudentID:"+stu.StudentID);
		System.out.println("Branch:"+stu.Branch);
		System.out.println("Block:"+stu.Block);
		System.out.println("StuLocation:"+stu.StuLocation);
		System.out.println("*************************");
		Library lib=new Library();
		lib.StudentID="1GU101617";
		lib.LibID="1GULib001";
		lib.BookName="Turbo Machines";
		lib.Author="Rakshith";
		lib.IssueDate="15/10/2015";
		System.out.println("StudentID:"+lib.StudentID);
		System.out.println("LibID:"+lib.LibID);
		System.out.println("BookName:"+lib.BookName);
		System.out.println("Author:"+lib.Author);
		System.out.println("IssueDate:"+lib.IssueDate);
		System.out.println("*************************");
		Sports spo=new Sports();
		spo.StudentID="1GU101617";
		spo.SportName="Cricket";
		spo.Coach="Dhoni";
		spo.GrondType="Outdoor";
		spo.SportEquip="Bat and Ball";
		System.out.println("StudentID:"+spo.StudentID);
		System.out.println("SportName:"+spo.SportName);
		System.out.println("Coach:"+spo.Coach);
		System.out.println("GroundType:"+spo.GrondType);
		System.out.println("SportEquip:"+spo.SportEquip);
		System.out.println("*************************");
		CSdept cs=new CSdept();
		cs.StudentID="1GU101617";
		cs.LabName="Java";
		cs.LabID="GUCS01";
		cs.GuideName="Prabhakar";
		cs.LabDay="Friday";
		System.out.println("StudentID:"+cs.StudentID);
		System.out.println("LabName:"+cs.LabName);
		System.out.println("LabID:"+cs.LabID);
		System.out.println("GuideName:"+cs.GuideName);
		System.out.println("LabDay:"+cs.LabDay);
	}

}
