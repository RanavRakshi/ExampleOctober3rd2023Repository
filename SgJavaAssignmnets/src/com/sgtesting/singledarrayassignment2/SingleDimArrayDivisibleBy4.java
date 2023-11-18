package com.sgtesting.singledarrayassignment2;

public class SingleDimArrayDivisibleBy4 {

	public static void main(String[] args) {
		// Programmatically assign numbers in between 100 to 50 which are divisible by 4
		// into single array and read the elements from 1D array?
		
		// Step1: make sure can you print numbers in between 100 t0 50
		// step2: from step1; among numbers 100 to 50 try to divide numbers by 4
		// step3: from step2; find count of the divisible numbers in between 100 to 50
		
		int count=0;
		for(int i=100;i>=50;i--)
		{
			if(i%4==0)
			{
				count++;
			}
		}
		
		System.out.println("# elements: "+count);
		
		// step4: declare/create an array with appropriate size
		int a[]=new int[count];
		
		// step5: assign the elements into 1D array
		int k=0;
		for(int j=100;j>=50;j--)
		{
			if(j%4==0)
			{
				a[k]=j;
				k++;
			}
		}
		
		// step6: read the elements from the 1D array which are divisible by 4
		for(int m=0;m<a.length;m++)
		{
			System.out.println(a[m]);
		}

	}

}
