package com.sgtesting.singledarrayassignment2;

public class SingleDimArray7ThTableInReverse {

	public static void main(String[] args) {
		// Programmatically assign the result of 7th table into 1D array in reverse order and 
		// read the elements from the array in reverse order?
		
		// step1: declare/create an array with appropriate size
		int num=7;
		int b[]=new int[10];
		
		// step2:  assign elements into 1D array
		int k=0;
		for(int j=10;j>=1;j--)
		{
			int a=num*j;
			{
				b[k]=a;
				k++;
			}
		}
		
		// step3: read the elements from the 1D array in reverse order
		
		for( int m=1;m<=b.length;m++)
		{
			int a=num*m;
			System.out.println(a);
		}

	}

}
