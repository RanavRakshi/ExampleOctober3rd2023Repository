package com.sgtesting.abstractassignment;

//5) In hybrid inheritance super class contains abstract method, based on the sub class object
//   execute all the methods?

abstract class Vehicle2 
{
	abstract void start(String describe);
	void stop(String describe) 
	{
		System.out.println(describe);
	}
}

class Car2 extends Vehicle2
{
	@Override
	void start(String describe)
	{
		System.out.println(describe);
	}
}

class ElectricCar extends Car2 
{

	void charge(String describe) 
	{
		System.out.println(describe);
	}
}

class Motorcycle extends Vehicle2 
{
	@Override
	void start(String describe) 
	{
		System.out.println(describe);
	}
}



public class Question5AbstractHybridInheritance {

	public static void main(String[] args) {

		ElectricCar electricCar = new ElectricCar();
		Motorcycle motorcycle = new Motorcycle();

		electricCar.start("Car Started");    // Calls ElectricCar's start()
		electricCar.stop("Vehicle Stop");     // Calls Vehicle's stop()
		electricCar.charge("Electric car is charging");   // Calls ElectricCar's charge()

		motorcycle.start("Motorcycle start");     // Calls Motorcycle's start()
		motorcycle.stop("Vehicle Stop");      // Calls Vehicle's stop()



	}

}
