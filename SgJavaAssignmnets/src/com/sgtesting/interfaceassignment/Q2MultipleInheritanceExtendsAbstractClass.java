package com.sgtesting.interfaceassignment;

//2) WAP for multiple inheritance in which sub class extends an abstract class and 
//   implements more than 2 inheritances?

abstract class Vehicle12
{
	 Vehicle12(int noOfWheels) 
	{
		System.out.println("Vehicle NoOf Permissible Wheels: "+noOfWheels);
	}
}

interface Car
{
	void showNoOfWheelsOnCar(int num);
}

interface Bus
{
	void showNoOfWheelsOnBus(int num);
}

interface Motorcycle
{
	void showNoOfWheelsOnMotorcycle(int num);
}

class FuelType extends Vehicle12 implements Car, Bus, Motorcycle
{
	FuelType(int noOfWheels)
	{
		super(noOfWheels);
	}
	
	@Override
	public void showNoOfWheelsOnCar(int num) 
	{
		System.out.println("Number Of Wheels On Car: "+num);
	}

	@Override
	public void showNoOfWheelsOnBus(int num) 
	{	
		System.out.println("Number Of Wheels On Bus: "+num);
	}
	
	@Override
	public void showNoOfWheelsOnMotorcycle(int num)
	{
		System.out.println("Number Of Wheels On Motorcycle: "+num);
	}

}

public class Q2MultipleInheritanceExtendsAbstractClass {

	public static void main(String[] args) {

		FuelType f= new FuelType(15);
		f.showNoOfWheelsOnCar(4);
		f.showNoOfWheelsOnBus(6);
		f.showNoOfWheelsOnMotorcycle(2);
		
	}

}
