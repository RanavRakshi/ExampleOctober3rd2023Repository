package com.sgtesting.tests;
class Maths
{	
	private int res;
	static Maths addition(int x,int y)
	{
		Maths maths=new Maths();
		maths.res=(x+y);
		return maths;
	}
	
	void multiplication(int x,int y)
	{
		this.res*=(x);
		System.out.println("Multiplication result: "+res);
	}
}
public class Sample 
{
	public static void main(String[] args) 
	{
		Maths.addition(5,5).multiplication(10,5);
	}

}
