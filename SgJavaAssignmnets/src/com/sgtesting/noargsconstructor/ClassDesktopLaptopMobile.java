package com.sgtesting.noargsconstructor;

class Desktop
{
	String DesktopName;
	String Manufacture;
	String Origin;
	long DesktopPrice;
	int Qunatity;
	
	Desktop ()
	{
		DesktopName="HP-Desk001";
		Manufacture="HP";
		Origin="California";
		DesktopPrice=35800;
		Qunatity=15;
		System.out.println("DesktopName:"+DesktopName);
		System.out.println("Manufacturer:"+Manufacture);
		System.out.println("Origin:"+Origin);
		System.out.println("DesktopPrice:"+DesktopPrice);
		System.out.println("Quantity:"+Qunatity);
		System.out.println("***********************");
	}
}

class Laptop
{
	String LaptopName;
	String Manufacturer;
	String Origin;
	long LaptopPrice;
	int Quantity;
	
	Laptop ()
	{
		LaptopName="HP-Pavillion";
		Manufacturer="HP";
		Origin="California";
		LaptopPrice=58945;
		Quantity=10;
		System.out.println("LaptopName:"+LaptopName);
		System.out.println("Manufacturer:"+Manufacturer);
		System.out.println("Origin:"+Origin);
		System.out.println("LaptopPrice:"+LaptopPrice);
		System.out.println("Quantity:"+Quantity);
		System.out.println("***********************");
	}
}

class Mobile
{
	String MobileName;
	String Manufacturer;
	String MobileColour;
	long MobilePrice;
	int Quantity;
	
	Mobile ()
	{
	MobileName="iphone-14";
	Manufacturer="Apple";
	MobileColour="Blue";
	MobilePrice=78000;
	Quantity=5;
	System.out.println("MobileName:"+MobileName);
	System.out.println("Manufacturer:"+Manufacturer);
	System.out.println("MobileColour:"+MobileColour);
	System.out.println("MobilePrice:"+MobilePrice);
	System.out.println("Quantity:"+Quantity);
	}
}

public class ClassDesktopLaptopMobile {

	public static void main(String[] args) {
		// create a class for desktop,laptop,mobile and execute each members of the class?
		
		Desktop desk=new Desktop();
		
		Laptop lapi=new Laptop();
		
		Mobile mob=new Mobile();
		

	}

}
