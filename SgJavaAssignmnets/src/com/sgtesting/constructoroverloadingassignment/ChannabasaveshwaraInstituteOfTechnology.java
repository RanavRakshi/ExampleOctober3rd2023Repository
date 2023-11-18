package com.sgtesting.constructoroverloadingassignment;

class CIT
{
	int NumberOfCourseOffered;
	String CourseName;
	String DurationOfCourse;
	int NumberOfStaff;
	int NumberOfLabs;
	String Block;
	
	CIT (int NumberOfCourseOffered)
	{
		this.NumberOfCourseOffered=NumberOfCourseOffered;
		System.out.println("NumberOfCourseOffered: "+NumberOfCourseOffered);
	}
	
	CIT (String CourseName)
	{
		this.CourseName=CourseName;
		System.out.println("CourseName: "+CourseName);
	}
	
	CIT(String DurationOfCourse,int NumberOfStaff)
	{
		this.DurationOfCourse=DurationOfCourse;
		this.NumberOfStaff=NumberOfStaff;
		System.out.println("DurationOfCourse: "+DurationOfCourse);
		System.out.println("NumberOfStaff: "+NumberOfStaff);
	}
	
	CIT(int NumberOfLabs,String Block)
	{
		this.NumberOfLabs=NumberOfLabs;
		this.Block=Block;
		System.out.println("NumberOfLabs: "+NumberOfLabs);
		System.out.println("Block: "+Block);
	}
}

public class ChannabasaveshwaraInstituteOfTechnology {

	public static void main(String[] args) {
		// by using constructor overloading create College
		
		//CIT c1=new CIT(6);
		CIT c2=new CIT("Mechanical Engineering");
		CIT c3=new CIT("4 years",15);
		//CIT c4=new CIT(10,"C-block");

	}

}
