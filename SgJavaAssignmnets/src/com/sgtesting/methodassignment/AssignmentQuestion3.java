package com.sgtesting.methodassignment;

// WAM to find the count of prime numbers in between 1 to 100?

class PrimeCount
{
	void primeCount()
	{
		int count=0;
		for(int num=1;num<100;num++)
		{
			if(num>1) 
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
					count++;
				}
			}
		}
		System.out.println("The count of prime numbers between 1 and 100 is: " + count);
	}
}

public class AssignmentQuestion3 {

	public static void main(String[] args) {

		PrimeCount pm=new PrimeCount();
		pm.primeCount();
	}

}
