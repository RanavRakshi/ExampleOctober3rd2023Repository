package com.sgtesting.inheritanceassignment1;

// 6) WAP for hierarchical inheritance in which super class contains parameterized constructor?

class Parent002
{
	Parent002(String name,int age)
	{
		System.out.println("Parent002 Name is: "+name);
		System.out.println("Parent002 Age is: "+age);
	}
}

class Child0021 extends Parent002
{
	String name1;
	Child0021(String name,int age,String name1)
	{
		super(name,age);
		this.name1=name1;
		System.out.println("Child0021 Name is: "+name1);
	}
}

class Child0022 extends Parent002
{
	String name1;
	Child0022(String name,int age,String name1)
	{
		super(name,age);
		this.name1=name1;
		System.out.println("Child0022 Name is: "+name1);
	}
}

public class Question6HeirarchicalInheritanceSuperClsParam {

	public static void main(String[] args) {
	
		Child0021 chi=new Child0021("Manjanna",29,"Ranav");
		System.out.println("*******************");
		Child0022 chi1=new Child0022("Manjanna",32,"Ravi");
	}

}
