package com.sgtesting.twodimarrayassignment2;

public class LongA2DArraySumOfAll {

	public static void main(String[] args) {
		// create 3*3 long 2D array display the sum of all the elements?
		
		// create 3*3 long 2D array
		long l[][]= {{1000,2000,3000},{4000,5000,6000},{7000,8000,9000}};
		
		// read the sum of all the elements from 2D long array
		int sum=0;
		for(int i=0;i<l.length;i++)
		{
			for(int j=0;j<l[i].length;j++)
			{
				sum+=l[i][j];
			}
		}
		System.out.println(sum);
	}

}
