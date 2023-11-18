package com.sgtesting.inheritanceassignment;

// 3) WAP to describe hybrid inheritance?

class GrandParent1
{
	void displayname(String name)
	{
		System.out.println("Grand Parent Name is: "+name);
	}
}

class Parent01 extends GrandParent1
{
	void dispayName(String FN, String LN)
	{
		System.out.println("Parent01 Name is: "+FN+" "+LN);
	}
}

class Parent02 extends GrandParent
{
	void displayName(String name)
	{
		System.out.println("Parent02 Name is: "+name);
	}
}

class Child021 extends Parent02
{
	void showname(String name)
	{
		System.out.println("Child021 Name is: "+name);
	}
}
public class Question3HybridInheritance {

	public static void main(String[] args) {
		
		Parent01 par=new Parent01();
		par.displayname("Gangappa");
		par.dispayName("Rama", "Krishnaih");
		
		Child021 chi=new Child021();
		chi.displayname("Gangappa");
		chi.displayName("Manjanna");
		chi.showname("Rakshith A M");
				

	}

}
