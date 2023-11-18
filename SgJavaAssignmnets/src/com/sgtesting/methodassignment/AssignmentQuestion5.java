package com.sgtesting.methodassignment;

// WAM to display prime numbers in between 250 to 200?

class PrimeNum
{
	void primeNum()
	{
		for(int num=250;num>=200;num--)
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

public class AssignmentQuestion5 {

	public static void main(String[] args) {
		
		PrimeNum pm=new PrimeNum();
		pm.primeNum();
	}

}
