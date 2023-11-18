package com.sgtesting.methodassignment;

// WAM to find the sum of prime numbers in between 150 to 100?

class PrimeSum
{
	void primeSum()
	{
		int sum=0;
		for(int num=150;num>=100;num--)
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
				sum+=num;
			}
		}
		System.out.println("The sum of all prime numbers between 150 and 100 is: " + sum);
	}
}

public class AssignmentQuestion4 {

	public static void main(String[] args) {
		
		PrimeSum pm=new PrimeSum();
		pm.primeSum();
		
	}

}
