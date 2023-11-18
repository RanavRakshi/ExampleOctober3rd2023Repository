package com.sgtesting.parameterizedconstructor.assignment;

class Desktop
{
	String DesktopName;
	String Manufacture;
	String Origin;
	long DesktopPrice;
	int Qunatity;
	
	Desktop (String DeskName,String Manuf,String Org,long DeskPrice,int Quan)
	{
		DesktopName=DeskName;
		Manufacture=Manuf;
		Origin=Org;
		DesktopPrice=DeskPrice;
		Qunatity=Quan;
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
	
	Laptop (String LapName,String Manuf,String Org,long LapPrice,int Quan)
	{
		LaptopName=LapName;
		Manufacturer=Manuf;
		Origin=Org;
		LaptopPrice=LapPrice;
		Quantity=Quan;
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
	
	Mobile (String MobName,String Manuf,String MobColor,long MobPrice,int Quan)
	{
	MobileName=MobName;
	Manufacturer=Manuf;
	MobileColour=MobColor;
	MobilePrice=MobPrice;
	Quantity=Quan;
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
		
		Desktop desk=new Desktop("DeskTop-HP","HP","California",35895,10);
		
		Laptop lapi=new Laptop("Pavillion","HP","California",55689,20);
		
		Mobile mob=new Mobile("Iphone-14","Apple","Blue",78000,10);
		

	}

}
