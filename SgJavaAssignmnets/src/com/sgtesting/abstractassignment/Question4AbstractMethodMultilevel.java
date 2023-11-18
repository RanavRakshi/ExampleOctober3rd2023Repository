package com.sgtesting.abstractassignment;

// 4) In multilevel inheritance superclass contains abstract methods, based on the sub class object 
//    execute all the members?

abstract class Fruits
{
	abstract void Taste();
	
	void showFruits(String name)
	{
		System.out.println("This is a "+name);
	}
}

class Mango extends Fruits
{
	@Override
	void Taste() 
	{
		System.out.println("Mangos are Sweet");
	}
	
	void mangoSpecificMethod()
	{
		System.out.println("This is a method specific to Mango");
	}
	
}

class GreenMango extends Mango
{
	@Override
	void Taste()
	{
		System.out.println("GreenMangos are sour");
	}
	
	void greenMangoSpecificMethod()
	{
		System.out.println("This is a method specific to GreenMango");
	}
}

public class Question4AbstractMethodMultilevel {

	public static void main(String[] args) {
		
		GreenMango gm=new GreenMango();
		gm.showFruits("Mango");
		gm.Taste();
		gm.mangoSpecificMethod();
		gm.greenMangoSpecificMethod();
	}

}
