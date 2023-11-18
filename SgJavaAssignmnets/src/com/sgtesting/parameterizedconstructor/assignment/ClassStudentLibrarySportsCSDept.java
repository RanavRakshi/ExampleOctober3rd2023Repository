package com.sgtesting.parameterizedconstructor.assignment;

class Student
{
	String StudentName;
	String StudentID;
	String Branch;
	String Block;
	String StuLocation;

	Student (String StuName,String StuID,String Bran,String Bloc,String StuLoc)
	{
		StudentName=StuName;
		StudentID=StuID;
		Branch=Bran;
		Block=Bloc;
		StuLocation=StuLoc;
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

	Library (String StuID,String LibrID,String BoolNm,String Aut,String IssDat)
	{
		StudentID=StuID;
		LibID=LibrID;
		BookName=BoolNm;
		Author=Aut;
		IssueDate=IssDat;
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

	Sports (String StuID,String SpoNam,String Coa,String Grou,String SpoEqu)
	{
		StudentID=StuID;
		SportName=SpoNam;
		Coach=Coa;
		GrondType=Grou;
		SportEquip=SpoEqu;
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

	CSdept (String StuID,String LabNam,String LabIDD,String Guid,String LabDa)
	{
		StudentID=StuID;
		LabName=LabNam;
		LabID=LabIDD;
		GuideName=Guid;
		LabDay=LabDa;
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

		Student stu=new Student("Ranav","1GU101617","Mechanical Engineering","C-Block","Koratagere");

		Library lib=new Library("1GU101617","1GULib001","Turbo Machines","Rakshith","15/10/2015");

		Sports spo=new Sports("1GU101617","Cricket","Dhoni","Outdoor","Bat and Ball");

		CSdept cs=new CSdept("1GU101617","Java","GUCS01","Prabhakar","Friday");

	}

}
