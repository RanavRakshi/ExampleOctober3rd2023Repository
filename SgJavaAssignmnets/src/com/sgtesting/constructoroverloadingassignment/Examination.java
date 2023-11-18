package com.sgtesting.constructoroverloadingassignment;

class Exam
{
	Exam(String ExamType)
	{
		System.out.println("Exam Type: "+ExamType);
	}
	
	Exam(int NumberOfExamsPerDay)
	{
		System.out.println("Number Of Exams Per Day: "+NumberOfExamsPerDay);
	}
	
	Exam(String ExamName,int ExamRoomNumber)
	{
		System.out.println("Exam Name: "+ExamName);
		System.out.println("Exam Room Number: "+ExamRoomNumber);
	}
	
	Exam(int NumberOfStudentes,String StaffName)
	{
		System.out.println("Number Of Studentes: "+NumberOfStudentes);
		System.out.println("Staff Name: "+StaffName);
	}
}

public class Examination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam c1=new Exam("Even Semister Exam");
		Exam c2=new Exam(2);
		Exam c3=new Exam("Turbo Machine",10);
		Exam c4=new Exam(25,"Natesh");

	}

}
