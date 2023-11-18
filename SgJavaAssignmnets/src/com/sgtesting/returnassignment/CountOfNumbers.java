package com.sgtesting.returnassignment;

class CountNumbers
{
	int countNumbers()
	{
		int count=0;
		for(int i=150;i<=250;i++)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		return count;
	}
}

public class CountOfNumbers {

	public static void main(String[] args) {
		
		CountNumbers cou=new CountNumbers();
		int c=cou.countNumbers();
		System.out.println("Count of odd numbers in between 150 to 250 is: "+c);
	}

}
