package com.sgtesting.parameterizedconstructor.assignment;

class Product
{
	String ProdName;
	String ProdID;
	String Manufacturer;
	String Location;
	long ProdCost;
	
	Product (String ProdNam,String ProdtID,String Manuf,String Loc,long ProdtCost)
	{
		ProdName=ProdNam;
		ProdID=ProdtID;
		Manufacturer=Manuf;
		Location=Loc;
		ProdCost=ProdtCost;
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
	
	Order (String ProdNam,String OrdID,long Quan,String OrdLoc,long OrdPrice)
	{
		ProdName=ProdNam;
		OrderID=OrdID;
		QuantityOfOrder=Quan;
		OrderLocation=OrdLoc;
		OrderPrice=OrdPrice;
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
	
	Items (String ProdNam,String ItmNum,int Quan,String ItmManuf,String itemLoc)
	{
		ProdName=ProdNam;
		ItemNumber=ItmNum;
		QuantityOfItems=Quan;
		ItemManufacturer=ItmManuf;
		ItemLocation=itemLoc;
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
		
		Product car=new Product("Polo","Polo-Sport","VolksWagen","Germany",1250000);
		
		Order ord=new Order("Polo","Polo-sport12",15,"KalpathaaruTools",125648952);
		
		Items itm=new Items("Polo","1Polo12345",125,"RanavBolts","Indore");
		
		

	}

}
