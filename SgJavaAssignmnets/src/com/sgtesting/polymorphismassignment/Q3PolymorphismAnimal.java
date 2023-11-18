package com.sgtesting.polymorphismassignment;

abstract class Animal
{
	abstract void getSoundOfAnimal();
}

class Cow extends Animal
{
	void getSoundOfAnimal()
	{
		String sound="Mooing";
		System.out.println("Cow sounds like; "+sound);
	}
}

class Dog extends Animal
{
	void getSoundOfAnimal()
	{
		String sound="Bark";
		System.out.println("Dog sounds like: "+sound);
	}
}

class Monkey extends Animal
{
	void getSoundOfAnimal()
	{
		String sound="Scream";
		System.out.println("Monkey sounds like: "+sound);
	}
}
public class Q3PolymorphismAnimal {

	public static void main(String[] args) {

		Animal animal=null;
		
		Cow cow=new Cow();
		Dog dog=new Dog();
		Monkey mon=new Monkey();
		
		animal=cow;
		animal.getSoundOfAnimal();
		
		animal=dog;
		animal.getSoundOfAnimal();
		
		animal=mon;
		animal.getSoundOfAnimal();
	}

}
