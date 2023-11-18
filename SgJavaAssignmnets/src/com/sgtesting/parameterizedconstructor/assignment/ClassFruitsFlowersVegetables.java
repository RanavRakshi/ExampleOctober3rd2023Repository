package com.sgtesting.parameterizedconstructor.assignment;

class Fruits
{
	String FruitName;
	String FruitColour;
	String FruitSuitedFor;
	int QuantityOfFruits;
	
	Fruits (String FruName,String FruCol,String FruSuit,int Quan)
	{
		FruitName=FruName;
		FruitColour=FruCol;
		FruitSuitedFor=FruSuit;
		QuantityOfFruits=Quan;
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
	String Flowfamily;
	
	Flowers (String FloName,String FloCol,String FloCalled,String Flowfam)
	{
		FlowerName=FloName;
		FlowerColour=FloCol;
		FlowCalledAs=FloCalled;
		Flowfamily=Flowfam;
		System.out.println("FlowerName:"+FlowerName);
		System.out.println("FlowerColour:"+FlowerColour);
		System.out.println("FlowCalledAs:"+FlowCalledAs);
		System.out.println("FlowFamily:"+Flowfamily);
		System.out.println("**********************");
	}
}

class Vegetables
{
	String VegetableName;
	String VegColour;
	int QuantityOfVeg;
	String VegSuitedFor;
	
	Vegetables (String VegName,String VegCol,int Quan,String VegSuit)
	{
		VegetableName=VegName;
		VegColour=VegCol;
		QuantityOfVeg=Quan;
		VegSuitedFor=VegSuit;
		System.out.println("VegetableName:"+VegetableName);
		System.out.println("VegColour:"+VegColour);
		System.out.println("QuantityOfVeg:"+QuantityOfVeg);
		System.out.println("VegSuitedFor:"+VegSuitedFor);
	}
}

public class ClassFruitsFlowersVegetables {

	public static void main(String[] args) {
		// create class for fruits, flowers vegetables and execute each class member of the class?
		
		Fruits fru=new Fruits("Apple","Red","Keep Away Doctor", 20);
		
		Flowers flow=new Flowers("Rose","Red","Queen Of Flower","Rosaceae");
		
		Vegetables veg=new Vegetables("Carrot","Orange color",10,"Eyes");
		

	}

}
