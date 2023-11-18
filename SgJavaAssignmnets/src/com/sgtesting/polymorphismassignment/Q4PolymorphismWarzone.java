package com.sgtesting.polymorphismassignment;

abstract class Army
{
	abstract void typeOfWarzone();
}

class Military extends Army
{
	void typeOfWarzone()
	{
		String zone="Land";
		System.out.println("Warzone of Military is: "+zone);
	}
}

class AirForce extends Army
{
	void typeOfWarzone()
	{
		String zone="Air";
		System.out.println("Warzone of AirForce is: "+zone);
	}
}

class Navy extends Army
{
	void typeOfWarzone()
	{
		String zone="Sea";
		System.out.println("Warzone of AirForce is: "+zone);
	}
}

public class Q4PolymorphismWarzone {

	public static void main(String[] args) {

		Army army=null;
		
		Military mili=new Military();
		AirForce air=new AirForce();
		Navy navy=new Navy();
		
		army=mili;
		army.typeOfWarzone();
		
		army=air;
		army.typeOfWarzone();
		
		army=navy;
		army.typeOfWarzone();
	}

}
