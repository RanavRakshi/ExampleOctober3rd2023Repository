package com.sgtesting.inheritanceassignment;

// 9) WAP for multi-level inheritance in which each class contains same variable name 
//    with datatype?

class Vehicle
{
	int capacity;
	
	Vehicle(int capacity)
	{
		this.capacity=capacity;
	}
	
	void getcapacity()
	{
		System.out.println("Permisible Vehicle capacity: "+capacity+" passengers");
	}
}

class Bus extends Vehicle
{
	int capacity;
	Bus(int capacity1,int capacity)
	{
		super(capacity1);
		this.capacity=capacity;
	}
	
	void showcapacity()
	{
		System.out.println("Bus capacity "+capacity+" passengers");
	}
}

class MiniBus extends Bus
{
	int capacity;
	MiniBus(int capacity1,int capacity2,int capacity)
	{
		super(capacity1,capacity2);
		this.capacity=capacity;
	}
	
	void displaycapacity()
	{
		System.out.println("MiniBus capacity "+capacity+" passengers");
	}
}

public class Question9MultilevelInheritanceSameVarWithDatatype {

	public static void main(String[] args) {
		
		MiniBus min=new MiniBus(50,40,25);
		min.getcapacity();
		min.showcapacity();
		min.displaycapacity();
	}

}
