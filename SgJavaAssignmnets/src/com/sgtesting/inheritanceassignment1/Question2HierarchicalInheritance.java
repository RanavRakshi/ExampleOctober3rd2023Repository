package com.sgtesting.inheritanceassignment1;

// 2) WAP to describe hierarchical inheritance?

class Parent1
{
	void displayname(String name)
	{
		System.out.println("Parent name is: "+name);
	}
}

class Child1 extends Parent1
{
	void displayname(String FN, String LN)
	{
		System.out.println("Child1 Name is: "+FN+" "+LN);
	}
}

class Child2 extends Parent1
{
	void displayname(String FN, String MN, String LN)
	{
		System.out.println("Child2 Name is: "+FN+" "+MN+" "+LN);
	}
}

public class Question2HierarchicalInheritance {

	public static void main(String[] args) {
		
		Child1 chi=new Child1();
		chi.displayname("Manjanna");
		chi.displayname("Rakshith", "A M");
		
		Child2 chi1=new Child2();
		chi1.displayname("Manjanna");
		chi1.displayname("Ruchitha", "Shree", "A M");

	}

}
