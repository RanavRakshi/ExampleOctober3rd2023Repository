package com.sgtesting.abstractassignment;

//1) If abstract class contains only static method WAP to execute static method from abstract class?
abstract class Vehicle
{
	 static void showNoOfWheels()
	 {
		 System.out.println("It is a static method in the abstarct class");
	 }
}

public class Question1AbstractClassContStaticMethod {

	public static void main(String[] args) {
		
		Vehicle.showNoOfWheels();
	}

}
