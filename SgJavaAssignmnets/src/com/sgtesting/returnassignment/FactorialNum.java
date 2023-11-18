package com.sgtesting.returnassignment;

// WAM for the given number it has to return the factorial number?

class FactNum
{
	int getfactNum(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class FactorialNum {

	public static void main(String[] args) {
		
		FactNum fac=new FactNum();
		int a=fac.getfactNum(5);
		System.out.println("Factorial of a given number is: "+a);
		
		
		
	}

}
