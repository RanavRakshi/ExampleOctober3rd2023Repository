package com.sgtesting.inheritanceassignment1;

// 1) WAP to describe the multi-level inheritance?

class GrandParent
{
	void displayname(String name)
	{
		System.out.println("Grand Parent Name is: "+name);
	}
}

class Parent extends GrandParent
{
	void displayname(String FN, String LN)
	{
		System.out.println("Parent Name is: "+FN+" "+LN);
	}
}

class Child extends Parent
{
	void displayname(String FN, String MN, String LN)
	{
		System.out.println("Child name is: "+FN+" "+MN+" "+LN);
	}
}

public class Question1MultiLevelInheritance 
{
	public static void main(String[] args) 
	{
		Child chi=new Child();
		chi.displayname("Gangappa");
		chi.displayname("Manjanna", "Gangappa");
		chi.displayname("Rakshith", "Manjanna", "Gangappa");
	}

}
