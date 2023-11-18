package com.sgtesting.abstractassignment;

//6)If abstract class contains only the instance methods, WAP to execute the instance methods?

abstract class Test
{
	void test() 
	{
		System.out.println("It is a instance method in abstract class");
	}
}

class Exam extends Test
{
	
}

public class Question6AbstrcatInstanceMethod {

	public static void main(String[] args) {
		
		 Exam e=new Exam();
		 e.test();
	}

}
