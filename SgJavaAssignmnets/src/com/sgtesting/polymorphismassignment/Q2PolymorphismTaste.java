package com.sgtesting.polymorphismassignment;

abstract class Taste
{
	abstract void tasteOfFood();
}

class Chitranna extends Taste
{
	void tasteOfFood()
	{
		String taste="acidic";
		System.out.println("Chitanna taste is: "+taste);
	}
}

class Holige extends Taste
{
	void tasteOfFood()
	{
		String taste="Sweety";
		System.out.println("Holige taste is: "+taste);
	}
}

class Palav extends Taste
{
	void tasteOfFood()
	{
		String taste="Spicy";
		System.out.println("Palav taste is: "+taste);
	}
}

public class Q2PolymorphismTaste {

	public static void main(String[] args) {

		Taste taste=null;
		
		Chitranna chitra=new Chitranna();
		Holige holige=new Holige();
		Palav palav=new Palav();
		
		taste=chitra;
		taste.tasteOfFood();
		
		taste=holige;
		taste.tasteOfFood();
		
		taste=palav;
		taste.tasteOfFood();
		
	}

}
