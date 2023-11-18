package com.sgtesting.twodimarrayassignment2;

public class Double2DArrayReverse {

	public static void main(String[] args) {
		// Create 3*3 double 2D array and read the elements from the array in reverse order?
		
		// create 2D 3*3 double array
		double d[][]= {{10.256,20.3658,30.546},{16.265,53.255,40.565},{70.656,80.482,90.259}};
		
		//read the elements from 2D array in reverse order
		for(int i=d.length-1;i>=0;i--)
		{
			for(int j=d[i].length-1;j>=0;j--)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}

	}

}
