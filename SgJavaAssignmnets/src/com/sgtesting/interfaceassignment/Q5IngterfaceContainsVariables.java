package com.sgtesting.interfaceassignment;

//5) WAP to demonstrate an interface contains variables and execute those variables?

interface Value
{
	 final int a=100;
	 final String name="Ranav";
	 
}

class Demo implements Value
{
	public void displayValue()
	{
		System.out.println("int Value: "+a);
		System.out.println("String Value: "+name);
	}
	
}

public class Q5IngterfaceContainsVariables {

	public static void main(String[] args) {

		Demo d=new Demo();
		d.displayValue();
	}

}
