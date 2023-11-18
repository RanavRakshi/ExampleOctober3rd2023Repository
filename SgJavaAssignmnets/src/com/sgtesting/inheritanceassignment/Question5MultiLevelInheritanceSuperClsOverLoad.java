package com.sgtesting.inheritanceassignment;

// 5) WAP for multi-level inheritance in which super class contains constructor overloading?

class College 
{
	String collegeName;
	String location;

	College() 
	{
		this.collegeName = "Unknown College";
		this.location = "Unknown Location";
	}

	College(String collegeName)
	{
		this.collegeName = collegeName;
		this.location = "Unknown Location";
	}

	College(String collegeName, String location) 
	{
		this.collegeName = collegeName;
		this.location = location;
	}

	void displayCollegeInfo()
	{
		System.out.println("College Name: " + collegeName);
		System.out.println("Location: " + location);
	}
}

class Student extends College 
{
	String studentName;
	int studentId;

	Student(String studentName, int studentId) 
	{
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}

	Student(String collegeName, String location, String studentName, int studentId) 
	{
		super(collegeName, location);
		this.studentName = studentName;
		this.studentId = studentId;
	}

	void displayStudentInfo() {
		System.out.println("Student Name: " + studentName);
		System.out.println("Student ID: " + studentId);
	}
}

class Library extends Student
{
	String bookname;
	Library(String collegeName, String location, String studentName, int studentId,String bookname)
	{
		super(collegeName, location,studentName,studentId);
		this.bookname=bookname;
		
	}
	void issueBook() 
	{
		System.out.println("Book Name: "+bookname);
	}
}

public class Question5MultiLevelInheritanceSuperClsOverLoad 
{
	public static void main(String[] args) 
	{
		College college = new College("CIT College", "Gubbi");
		Student student = new Student("CIT College", "Gubbi", "Ranav", 102);
		Library library = new Library("CIT College", "Gubbi", "Ranav", 102,"Introduction to Java Programming");

		college.displayCollegeInfo();
		student.displayStudentInfo();
		library.issueBook();
	}
}
