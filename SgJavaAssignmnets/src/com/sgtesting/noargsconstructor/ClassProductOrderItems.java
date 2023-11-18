package com.sgtesting.noargsconstructor;

class Product
{
	String ProdName;
	String ProdID;
	String Manufacturer;
	String Location;
	long ProdCost;
	
	Product ()
	{
		ProdName="Polo";
		ProdID="Polo12Sport";
		Manufacturer="VolksWagen";
		Location="Germany";
		ProdCost=1255000;
		System.out.println("ProdName:"+ProdName);
		System.out.println("ProdID:"+ProdID);
		System.out.println("Manufacturer:"+Manufacturer);
		System.out.println("Location:"+Location);
		System.out.println("ProdCost:"+ProdCost);
		System.out.println("****************************");
	}
}

class Order
{
	String ProdName;
	String OrderID;
	long QuantityOfOrder;
	String OrderLocation;
	long OrderPrice;
	
	Order ()
	{
		ProdName="Polo";
		OrderID="1Polo12Sport";
		QuantityOfOrder=125;
		OrderLocation="Tumakuru";
		OrderPrice=156875000;
		System.out.println("ProdName:"+ProdName);
		System.out.println("OrderID:"+OrderID);
		System.out.println("QuantityOFOrder:"+QuantityOfOrder);
		System.out.println("OrderLocation:"+OrderLocation);
		System.out.println("OrderPrice:"+OrderPrice);
		System.out.println("***************************");
	}
}

class Items
{
	String ProdName;
	String ItemNumber;
	int QuantityOfItems;
	String ItemManufacturer;
	String ItemLocation;
	
	Items ()
	{
		ProdName="Polo";
		ItemNumber="123PoloSport";
		QuantityOfItems=25;
		ItemManufacturer="KalpataruTools";
		ItemLocation="Indore";
		System.out.println("ProdName:"+ProdName);
		System.out.println("ItemNumber:"+ItemNumber);
		System.out.println("QuantityOfItems:"+QuantityOfItems);
		System.out.println("ItemManufacturer:"+ItemManufacturer);
		System.out.println("ItemLocation:"+ItemLocation);
	}
}

public class ClassProductOrderItems {

	public static void main(String[] args) {
		// create class for product,order, items and execute each column member?
		
		Product car=new Product();
		
		Order ord=new Order();
		
		Items itm=new Items();
		
		

	}

}
