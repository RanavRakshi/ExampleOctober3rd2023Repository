package com.sgtesting.inheritanceassignment1;

// 5) WAP for multi-level inheritance in which super class contains constructor overloading?

class College
{
	College(String name)
	{
		System.out.println("College name: "+name);
	}
	
	College(int code)
	{
		System.out.println("College Code: "+code);
	}
	
	College(String location,int pincode)
	{
		System.out.println("College Location: "+location);
		System.out.println("Pincode: "+pincode);
	}
}

class Student extends College
{
	Student(String name)
	{
		super(name);
	}
	
	Student(int code)
	{
		super(code);
	}
	
	Student(String location,int pincode)
	{
		super(location,pincode);
	}
}

class Library extends Student
{
	Library(String name)
	{
		super(name);
	}
	
	Library(int code)
	{
		super(code);
	}
	
	Library(String location,int pincode)
	{
		super(location,pincode);
	}
}

public class Question5MultiLevelInheritanceSuperClsOverLoad 
{
	public static void main(String[] args) 
	{
		Library lib=new Library("CIT");
		Library lib1=new Library(1234);
		Library lib2=new Library("Gubbi",575124);
	}
}