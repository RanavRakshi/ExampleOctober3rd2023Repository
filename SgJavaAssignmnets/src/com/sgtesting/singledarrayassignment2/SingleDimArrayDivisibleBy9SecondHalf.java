package com.sgtesting.singledarrayassignment2;

public class SingleDimArrayDivisibleBy9SecondHalf {

	public static void main(String[] args) {
		// Programmatically assign numbers in between 200 to 100 which are divisible by 9  
		// into 1D array and read second half of the elements?
		
		// step1: make sure can you print the numbers in between 200 to 100
		// step2: from step1; divide the numbers in between 200 to 100 by 9
		// step3: find the count of numbers which are divided by 9 in between 200 to 100
		
		int count=0;
		for(int i=200;i>=100;i--)
		{
			if(i%9==0)
			{
				count++;
			}
		}
		System.out.println("# of elements: "+count);
		
		// step4: declare/create an array with appropriate size
		int a[]=new int[count];
		
		// step5: assign elements to array numbers in between 200 to 100
		int k=0;
		for(int j=200;j>=100;j--)
		{
			if(j%9==0)
			{
				a[k]=j;
				k++;
			}
		}
		
		// step6: read the second half of the elements
		for(int m=(a.length-1)/2;m<a.length;m++)
		{
			System.out.println(a[m]);
		}
		
	}

}
