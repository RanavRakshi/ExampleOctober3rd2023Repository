package com.sgtesting.interfaceassignment;

//4) WAP to demonstrate one interface extends another interface at hierarchical level?

interface Animal
{
	void showAnimalName(String name);
}

interface Monkey extends Animal
{
	void displayMonkeyEats(String eats);
}

interface Dog extends Animal
{
	void displayDogBreedName(String breedname);
}

class Charcater implements Monkey, Dog
{
	public void showAnimalName(String name)
	{
		System.out.println("Animal Name: "+name);
	}
	
	public void displayMonkeyEats(String eats)
	{
		System.out.println("Monkey Eats: "+eats);
	}
	
	public void displayDogBreedName(String breedname)
	{
		System.out.println("Dog Breed: "+breedname);
	}
	
	/*void CharcaterOfMonkey(String character)
	{
		System.out.println("Monkey Character: "+character);
	}*/
}


public class Q4HierarchicalInterfaceExtendsAnotherInterface {

	public static void main(String[] args) {
		
		Charcater mo=new Charcater();
		mo.showAnimalName("Monkey");
		mo.displayMonkeyEats("Banana");
		//mo.CharcaterOfMonkey("Most species run along branches rather than swinging arm over arm like the apes.");
		
		mo.showAnimalName("Dog");
		mo.displayDogBreedName("Mudhol");
		
		
		
	}

}
