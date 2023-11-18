package com.sgtesting.inheritanceassignment1;

//8) WAP for multi-level inheritance in which each class contains same method name with signature?

 /* class Eagle 
  {
	  void showeating (int percentage)
	  {
		  int eats,Noofeats;
		  eats=50;
		  Noofeats=(eats*percentage)/100;
		  System.out.println("percentage of eats by Eagle: "+Noofeats);
	  }
  }
  
  class Snake extends Eagle
  {
	  Snake(int percentage)
	  {
		  super.showeating(percentage);
	  }
	  
	  void showeating(int percentage)
	  {
		  System.out.println("No of eats by Sanke: "+percentage);
	  }
  }
  
  class Frog extends Snake
  {
	  Frog(int noofeats)
	  {
		  super.showeating(noofeats);
	  }
	  
	  void showeating(noofeats)
	  {
		  System.out.println("No of eats by Frog: "+noofeats);
	  }
  }*/

class Grandparent12
{
	void displayinfo(String name)
	{
		System.out.println("Grandparent Name is: "+name);
		//System.out.println("Age: "+age);
	}
}

class Parent12 extends Grandparent12
{
	Parent12(String name)
	{
		super.displayinfo(name);
	}
	
	void displayinfo(String name)
	{
		System.out.println("Parent name: "+name);
		//System.out.println("Age: "+age);
	}
}

class Child12 extends Parent12
{
	Child12(String name,String name1)
	{
		super(name); 
		super.displayinfo(name1);
	}
	
	void displayinfo(String name)
	{
		System.out.println("Child12 Name: "+name);
		//System.out.println("Age: "+age);
	}
}

public class Question8MultiLevelInheritanceWithSameMethodWithSig {

	public static void main(String[] args) {

		/*Snake s=new Snake(2);
		s.showeating(5);*/
		
		//Parent12 p=new Parent12("Manjanna", 60);
		//p.displayinfo("Ranav", 29);
		
		Child12 c=new Child12("Gangappa", "Manjanna");
		c.displayinfo("Ranav");
		
		
		
	}

}
