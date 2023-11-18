package com.sgtesting.interfaceassignment;

//3) WAP to demonstrate one interface extends another interface at multi-level?

interface Engine
{
	void EngineType();
}

interface  Car1 extends Engine
{
	abstract void FuelType();
}

class HybridCar implements Car1
{
	public void EngineType()
	{
		System.out.println("Supra-turbocharged B58 3.0-litre inline-6 cylinder");
	}
	
	public void FuelType()
	{
		System.out.println("Petrol");
	}
	
	void displayHybrid()
	{
		System.out.println("Still not yet released");
	}
}

public class Q3InterfaceExtendsAnotherInterfaceMultilevel {

	public static void main(String[] args) {
		
		HybridCar car=new HybridCar();
		car.EngineType();
		car.FuelType();
		car.displayHybrid();
	}

}
