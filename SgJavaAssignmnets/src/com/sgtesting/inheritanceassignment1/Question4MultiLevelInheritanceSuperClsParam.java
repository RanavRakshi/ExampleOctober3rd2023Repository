package com.sgtesting.inheritanceassignment1;

// 4) WAP for multi-level inheritance in which super class contains parameterized constructor?

class Grandparent001
{
	Grandparent001(String name)
	{
		System.out.println("Grand Parent Name is: "+name);
	}
}

class Parent001 extends Grandparent001
{
	String LN;
	Parent001(String FN, String LN)
	{
		super(FN);
		this.LN=LN;
		System.out.println("Parent001 Name is: "+LN);
	}
}

class Child001 extends Parent001
{
	String Lname;
	Child001(String Fname, String Mname, String Lname)
	{
		super(Fname,Mname);
		this.Lname=Lname;
		System.out.println("Child001 Name is: "+Lname);
	}
}

public class Question4MultiLevelInheritanceSuperClsParam {

	public static void main(String[] args) {
		
		Child001 chi = new Child001("Gangappa A N","Manjanna A G", "Rakshith A M");
	}

}
