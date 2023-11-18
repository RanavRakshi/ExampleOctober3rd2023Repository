package com.sgtesting.noargsconstructor;

class Fruits
{
	String FruitName;
	String FruitColour;
	String FruitSuitedFor;
	int QuantityOfFruits;
	
	Fruits ()
	{
		FruitName="Apple";
		FruitColour="Red";
		FruitSuitedFor="To Keep Away Doctor";
		QuantityOfFruits=25;
		System.out.println("FruitName:"+FruitName);
		System.out.println("FruitColour:"+FruitColour);
		System.out.println("FruitSuitedFor:"+FruitSuitedFor);
		System.out.println("QuantityOfFruit:"+QuantityOfFruits);
		System.out.println("**********************");
	}
}

class Flowers
{
	String FlowerName;
	String FlowerColour;
	String FlowCalledAs;
	String Flowamily;
	
	Flowers ()
	{
		FlowerName="Rose";
		FlowerColour="Red";
		FlowCalledAs="Queen of Flowers";
		Flowamily="Rosaceae";
		System.out.println("FlowerName:"+FlowerName);
		System.out.println("FlowerColour:"+FlowerColour);
		System.out.println("FlowCalledAs:"+FlowCalledAs);
		System.out.println("FlowFamily:"+Flowamily);
		System.out.println("**********************");
	}
}

class Vegetables
{
	String VegetableName;
	String VegColour;
	int QuantityOfVeg;
	String VegSuitedFor;
	
	Vegetables ()
	{
		VegetableName="Carrot";
		VegColour="Orange";
		QuantityOfVeg=20;
		VegSuitedFor="Eyes";
		System.out.println("VegetableName:"+VegetableName);
		System.out.println("VegColour:"+VegColour);
		System.out.println("QuantityOfVeg:"+QuantityOfVeg);
		System.out.println("VegSuitedFor:"+VegSuitedFor);
	}
}

public class ClassFruitsFlowersVegetables {

	public static void main(String[] args) {
		// create class for fruits, flowers vegetables and execute each class member of the class?
		
		Fruits fru=new Fruits();
		
		Flowers flow=new Flowers();
		
		Vegetables veg=new Vegetables();
		

	}

}
