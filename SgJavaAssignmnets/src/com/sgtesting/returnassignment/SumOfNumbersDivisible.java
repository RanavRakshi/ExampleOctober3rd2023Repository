package com.sgtesting.returnassignment;

// 3) WAM, the method has to return sum of numbers in between 100 to 200 
// which are divisible by 7?

class Divide
{
	int sumOfDivide()
	{
		int sum=0;
		for(int i=100;i<=200;i++)
		{
			if(i%7==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
}

public class SumOfNumbersDivisible {

	public static void main(String[] args) {
		
		Divide div=new Divide();
		int d=div.sumOfDivide();
		System.out.println("Sum of the numbers divisible by 7 is: "+d);
		System.out.println("**********************");
	
	}

}
