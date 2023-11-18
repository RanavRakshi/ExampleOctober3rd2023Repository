package com.sgtesting.inheritanceassignment;

class AmazonCompany
{
	AmazonCompany(int x)
	{
		System.out.println("Percentage of discount in amazon:"+x);
	}
	AmazonCompany(String cuponcode)
	{		
		System.out.println("Cuponcode to redeem the offer:"+cuponcode);	
	}
}

class FlipCartCompany extends AmazonCompany
{
	FlipCartCompany(int x,int y)
	{
		super(x);

		System.out.println("Discount of percentage in Flipcart:"+y);
	}

	FlipCartCompany(String cuponcode)
	{
		super(cuponcode);
	}
}

class MyntraCompany extends AmazonCompany
{
	MyntraCompany(int x,int y) 
	{
		super(x);

		System.out.println("Discount of percentage in Myntra:"+y);
	}

	MyntraCompany(String cuponcode)

	{
		super(cuponcode);
	}
}

class Ajio extends MyntraCompany
{
	Ajio(int x,int y,int z) 
	{
		super(x,y);

		System.out.println("Discount of percentage in Ajio:"+z);
	}

	Ajio(String cuponcode)

	{
		super(cuponcode);	
	} 
}

public class Question7HybridInheritanceSuperClsOverLoad {

	public static void main(String[] args) {

		Ajio obj3=new Ajio(10,20,30);

		Ajio obj4=new Ajio("ABCD345");

		FlipCartCompany obj=new FlipCartCompany(40, 30);

		FlipCartCompany obj2=new FlipCartCompany("49748edr");

	}

}
