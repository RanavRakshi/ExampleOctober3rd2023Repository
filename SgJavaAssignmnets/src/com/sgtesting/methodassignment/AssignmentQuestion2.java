package com.sgtesting.methodassignment;

// WAM to display prime numbers in between 50 to 100?

class PrimeNumber
{
	void primeNumber()
	{
		for(int num=50;num<100;num++)
		{
			int flag=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num+" is a prime number");
			}
		}
	}
}

public class AssignmentQuestion2 {

	public static void main(String[] args) {

		PrimeNumber pm=new PrimeNumber();
		pm.primeNumber();
	}

}
