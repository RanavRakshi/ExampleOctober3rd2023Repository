package com.sgtesting.classassignment;

class Fruits
{
	String FruitName;
	String FruitColour;
	String FruitSuitedFor;
	int QuantityOfFruits;
}

class Flowers
{
	String FlowerName;
	String FlowerColour;
	String FlowCalledAs;
	String Flowamily;
}

class Vegetables
{
	String VegetableName;
	String VegColour;
	int QuantityOfVeg;
	String VegSuitedFor;
}

public class ClassFruitsFlowersVegetables {

	public static void main(String[] args) {
		// create class for fruits, flowers vegetables and execute each class member of the class?
		
		Fruits fru=new Fruits();
		fru.FruitName="Apple";
		fru.FruitColour="Red";
		fru.FruitSuitedFor="To Keep Away Doctor";
		fru.QuantityOfFruits=25;
		System.out.println("FruitName:"+fru.FruitName);
		System.out.println("FruitColour:"+fru.FruitColour);
		System.out.println("FruitSuitedFor:"+fru.FruitSuitedFor);
		System.out.println("QuantityOfFruit:"+fru.QuantityOfFruits);
		System.out.println("**********************");
		Flowers flow=new Flowers();
		flow.FlowerName="Rose";
		flow.FlowerColour="Red";
		flow.FlowCalledAs="Queen of Flowers";
		flow.Flowamily="Rosaceae";
		System.out.println("FlowerName:"+flow.FlowerName);
		System.out.println("FlowerColour:"+flow.FlowerColour);
		System.out.println("FlowCalledAs:"+flow.FlowCalledAs);
		System.out.println("FlowFamily:"+flow.Flowamily);
		System.out.println("**********************");
		Vegetables veg=new Vegetables();
		veg.VegetableName="Carrot";
		veg.VegColour="Orange";
		veg.QuantityOfVeg=20;
		veg.VegSuitedFor="Eyes";
		System.out.println("VegetableName:"+veg.VegetableName);
		System.out.println("VegColour:"+veg.VegColour);
		System.out.println("QuantityOfVeg:"+veg.QuantityOfVeg);
		System.out.println("VegSuitedFor:"+veg.VegSuitedFor);

	}

}
