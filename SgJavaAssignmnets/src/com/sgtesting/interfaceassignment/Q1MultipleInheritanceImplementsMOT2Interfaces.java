package com.sgtesting.interfaceassignment;

//1) WAP for multiple inheritance in which a sub class implements more than 2 inheritances?

interface Vehicle
{
	void showVehicleType(String name);
}

interface VehicleCompany
{
	void displayCompanyName(String name);
}

interface VehicleSeries
{
	abstract void displayVehicleSeries(String name);
}

class CarSeries implements Vehicle, VehicleCompany, VehicleSeries
{
	public void showVehicleType(String type) 
	{
		System.out.println("Vehicle Name: "+type);
	}

	public void displayCompanyName(String name)
	{
		System.out.println("Vehicle Company Name: "+name);
	}

	public void displayVehicleSeries(String series)
	{
		System.out.println("Vehicle series: "+series);
	}

	void displayVehicleVarient(String varient)
	{
		System.out.println("Vehicle Varient: "+varient);
	}

}

public class Q1MultipleInheritanceImplementsMOT2Interfaces {

	public static void main(String[] args) {

		CarSeries c=new CarSeries();
		c.showVehicleType("Car");
		c.displayCompanyName("Toyota");
		c.displayVehicleSeries("Innova Crysta");
		c.displayVehicleVarient("V2.0");
	}

}
