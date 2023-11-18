package com.sgtesting.classassignment;

class Product
{
	String ProdName;
	String ProdID;
	String Manufacturer;
	String Location;
	long ProdCost;
}

class Order
{
	String ProdName;
	String OrderID;
	long QuantityOfOrder;
	String OrderLocation;
	long OrderPrice;
}

class Items
{
	String ProdName;
	String ItemNumber;
	int QuantityOfItems;
	String ItemManufacturer;
	String ItemLocation;
}

public class ClassProductOrderItems {

	public static void main(String[] args) {
		// create class for product,order, items and execute each column member?
		
		Product car=new Product();
		car.ProdName="Polo";
		car.ProdID="Polo12Sport";
		car.Manufacturer="VolksWagen";
		car.Location="Germany";
		car.ProdCost=1255000;
		System.out.println("ProdName:"+car.ProdName);
		System.out.println("ProdID:"+car.ProdID);
		System.out.println("Manufacturer:"+car.Manufacturer);
		System.out.println("Location:"+car.Location);
		System.out.println("ProdCost:"+car.ProdCost);
		System.out.println("****************************");
		Order ord=new Order();
		ord.ProdName="Polo";
		ord.OrderID="1Polo12Sport";
		ord.QuantityOfOrder=125;
		ord.OrderLocation="Tumakuru";
		ord.OrderPrice=156875000;
		System.out.println("ProdName:"+ord.ProdName);
		System.out.println("OrderID:"+ord.OrderID);
		System.out.println("QuantityOFOrder:"+ord.QuantityOfOrder);
		System.out.println("OrderLocation:"+ord.OrderLocation);
		System.out.println("OrderPrice:"+ord.OrderPrice);
		System.out.println("***************************");
		Items itm=new Items();
		itm.ProdName="Polo";
		itm.ItemNumber="123PoloSport";
		itm.QuantityOfItems=25;
		itm.ItemManufacturer="KalpataruTools";
		itm.ItemLocation="Indore";
		System.out.println("ProdName:"+itm.ProdName);
		System.out.println("ItemNumber:"+itm.ItemNumber);
		System.out.println("QuantityOfItems:"+itm.QuantityOfItems);
		System.out.println("ItemManufacturer:"+itm.ItemManufacturer);
		System.out.println("ItemLocation:"+itm.ItemLocation);
		

	}

}
