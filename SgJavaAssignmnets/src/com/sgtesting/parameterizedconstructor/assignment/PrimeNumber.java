package com.sgtesting.parameterizedconstructor.assignment;

class Demo2
{
	Demo2(int num)
	{
		int flag=0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+" is not a Prime Number");
		}
	}
}

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo2 dem = new Demo2 (7);
		Demo2 dem1 = new Demo2 (8);
		Demo2 dem2 = new Demo2 (13);
		Demo2 dem3 = new Demo2 (21);

	}

}
