package com.sgtesting.returnassignment;

// 1) WAM, the method has to return sum of the first 20 numbers?
class Numbers
{
	int getSumFirst20()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			sum+=i;
		}
		return sum;
	}
}

public class SumOfFirst20Numbers {

	public static void main(String[] args) {
		
		Numbers num=new Numbers();
		int sum=num.getSumFirst20();
		System.out.println("Sum of first 20 numbers is: "+sum);
		System.out.println("***************");
		
		// display the square of the sum 
		long square=0;
		for(int i=0;i<sum;i++)
		{
			square=sum*sum;
		}
		System.out.println("Square of the sum is: "+square);
		System.out.println("**************");
		
		// display the cube of the sum
		long cube=0;
		for(int i=0;i<sum;i++)
		{
			cube=sum*sum*sum;
		}
		System.out.println("Cube of the sum is: "+cube);
		System.out.println("**************");
	
		// display the even numbers in between 100 to sum
		
		for(int i=100;i<=sum;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even numbers in between 100 to sum is: "+i);
			}
		}
		
	}

}
