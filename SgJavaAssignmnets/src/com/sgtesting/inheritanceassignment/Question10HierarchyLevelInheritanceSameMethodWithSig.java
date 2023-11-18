package com.sgtesting.inheritanceassignment;

// 10) WAP for hierarchical inheritance in which each class contains same method name 
//    with signature?

class Shape
{
	void calculation()
	{
		System.out.println("Area of a Shape");
	}
}

class Circle extends Shape
{
	double radius;
	
	Circle(double radius)
	{
		super.calculation();
		this.radius=radius;
	}
	
	void calculation()
	{
		double area=radius*radius*3.14;
		System.out.println("Area of circle is: "+area);
	}
}

/*class Cylinder extends Circle
{
	double length;
	
	Cylinder(double radius,double length)
	{
		super.calculation();
		//this.length=length;
	}
	
	void calculation()
	{
		double area=((2*radius*radius*3.14)+(2*3.14*radius*length));
		System.out.println("Area of Cylinder is: "+area);
	}
}*/


class Rectangle extends Shape
{
	double length;
	double width;
	
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	
	void calculation()
	{
		double area=length*width;
		System.out.println("Area of Rectangle is: "+area);
	}
}

class Triangle extends Shape
{
	double base;
	double height;
	
	Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	
	void calculation()
	{
		double area=0.5*base*height;
		System.out.println("Area of Rectangle: "+area);
	}
}

class Libraryitem
{
	String title;
	boolean checkedout;
	
	Libraryitem(String title)
	{
		this.title=title;
		checkedout=false;
	}
	
	void checkedout()
	{
		if(!checkedout)
		{
			System.out.println(title+" has been checkedout");
			checkedout=true;
		}
		else 
		{
			System.out.println(title+" is already checked out on");
		}
	}
	
	void returnItem()
	{
		if(checkedout)
		{
			System.out.println(title+" has been returned");
			checkedout=false;
		}
		else
		{
			System.out.println(title+" is in the library");
		}
	}	
}

class Book extends Libraryitem
{
	String author;
	
	Book(String title,String author)
	{
		super(title);
		this.author=author;
	}
}

class Magzine extends Libraryitem
{
	String issuedate;
	
	Magzine(String title,String issuedate)
	{
		super(title);
		this.issuedate=issuedate;
	}
}

public class Question10HierarchyLevelInheritanceSameMethodWithSig {

	public static void main(String[] args) {
		
		System.out.println("Area of Generic Shape");
		System.out.println("---------------------");
		Circle c=new Circle(5);
		c.calculation();
		System.out.println("*************");
		
		Rectangle r=new Rectangle(6,4);
		r.calculation();
		System.out.println("*************");
		
		Triangle t=new Triangle(6,6);
		t.calculation();
		System.out.println("*************");
		System.out.println();
		System.out.println();
		
		System.out.println("Library Items");
		System.out.println("-------------");
		
		Book b=new Book("Karvalo", "Poorna Chandra Tesjasvi");
		b.checkedout();
		System.out.println("************");
		
		Magzine ma=new Magzine("Butti","October 28");
		ma.returnItem();
		
	}

}
