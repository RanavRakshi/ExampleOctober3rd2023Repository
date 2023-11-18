package com.sgtesting.abstractassignment;

// 3) In a multilevel inheritance super class is an abstract class and it contains parameterized constructor?

abstract class Vehicle1
{
	 Vehicle1(int noOfWheels) 
	{
		System.out.println("Vehicle NoOf Permissible Wheels: "+noOfWheels);
	}
}

class Bus extends Vehicle1
{
	Bus(int noOfWheels) 
	{
		super(noOfWheels);
	}
	
	void showbus(int noOfWheels)
	{
		System.out.println("NoOfWheels on Bus: "+noOfWheels);
	}
}

class Car extends Bus
{
	Car(int noOfWheels)
	{
		super(noOfWheels);
	}
	
	void car(int noOfWheels)
	{
		System.out.println("NoOfWheels on Car: "+noOfWheels);
	}
}

public class Question3AbstractMultiLevelInheritance {

	public static void main(String[] args) {
		
		Car c=new Car(15);
		c.car(4);
		c.showbus(6);
	}

}
