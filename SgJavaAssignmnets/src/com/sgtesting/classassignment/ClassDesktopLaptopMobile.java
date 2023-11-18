package com.sgtesting.classassignment;

class Desktop
{
	String DesktopName;
	String Manufacture;
	String Origin;
	long DesktopPrice;
	int Qunatity;
}

class Laptop
{
	String LaptopName;
	String Manufacturer;
	String Origin;
	long LaptopPrice;
	int Quantity;
}

class Mobile
{
	String MobileName;
	String Manufacturer;
	String MobileColour;
	long MobilePrice;
	int Quantity;
}

public class ClassDesktopLaptopMobile {

	public static void main(String[] args) {
		// create a class for desktop,laptop,mobile and execute each members of the class?
		
		Desktop desk=new Desktop();
		desk.DesktopName="HP-Desk001";
		desk.Manufacture="HP";
		desk.Origin="California";
		desk.DesktopPrice=35800;
		desk.Qunatity=15;
		System.out.println("DesktopName:"+desk.DesktopName);
		System.out.println("Manufacturer:"+desk.Manufacture);
		System.out.println("Origin:"+desk.Origin);
		System.out.println("DesktopPrice:"+desk.DesktopPrice);
		System.out.println("Quantity:"+desk.Qunatity);
		System.out.println("***********************");
		Laptop lapi=new Laptop();
		lapi.LaptopName="HP-Pavillion";
		lapi.Manufacturer="HP";
		lapi.Origin="California";
		lapi.LaptopPrice=58945;
		lapi.Quantity=10;
		System.out.println("LaptopName:"+lapi.LaptopName);
		System.out.println("Manufacturer:"+lapi.Manufacturer);
		System.out.println("Origin:"+lapi.Origin);
		System.out.println("LaptopPrice:"+lapi.LaptopPrice);
		System.out.println("Quantity:"+lapi.Quantity);
		System.out.println("***********************");
		Mobile mob=new Mobile();
		mob.MobileName="iphone-14";
		mob.Manufacturer="Apple";
		mob.MobileColour="Blue";
		mob.MobilePrice=78000;
		mob.Quantity=5;
		System.out.println("MobileName:"+mob.MobileName);
		System.out.println("Manufacturer:"+mob.Manufacturer);
		System.out.println("MobileColour:"+mob.MobileColour);
		System.out.println("MobilePrice:"+mob.MobilePrice);
		System.out.println("Quantity:"+mob.Quantity);

	}

}
