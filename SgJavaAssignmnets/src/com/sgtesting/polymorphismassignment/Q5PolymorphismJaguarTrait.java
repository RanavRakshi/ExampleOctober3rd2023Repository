package com.sgtesting.polymorphismassignment;

abstract class Jaguar
{
	abstract void skinColouring();
}

class MelanisticJaguar extends Jaguar
{
	void skinColouring()
	{
		String colour="Dark Morph";
		System.out.println("MelanisticJaguar are "+colour+" in colour");
	}
}

class NonMelanisticJaguar extends Jaguar
{
	void skinColouring()
	{
		String colour="Light Morph";
		System.out.println("NonMelanisticJaguar are "+colour+" in colour");
	}
}

public class Q5PolymorphismJaguarTrait {

	public static void main(String[] args) {

		Jaguar jaguar=null;
		
		MelanisticJaguar meljaguar=new MelanisticJaguar();
		NonMelanisticJaguar nonmeljag=new NonMelanisticJaguar();
		
		jaguar=meljaguar;
		jaguar.skinColouring();
		
		jaguar=nonmeljag;
		jaguar.skinColouring();
	}

}
