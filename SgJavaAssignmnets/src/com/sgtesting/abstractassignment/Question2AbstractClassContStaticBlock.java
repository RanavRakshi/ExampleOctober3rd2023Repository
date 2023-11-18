package com.sgtesting.abstractassignment;

//2) If abstract class contains static block alone WAP to execute static block from abstract class?

abstract class Vehicle0
{
	static
	{
		System.out.println("It is a static block in the abstract class");
	}
}

class Bus0 extends Vehicle0
{
	
}

public class Question2AbstractClassContStaticBlock {

	public static void main(String[] args) {
		
	Bus0 b=new Bus0();
	}
}
