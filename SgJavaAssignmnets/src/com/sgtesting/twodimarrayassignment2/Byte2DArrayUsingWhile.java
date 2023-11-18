package com.sgtesting.twodimarrayassignment2;

public class Byte2DArrayUsingWhile {

	public static void main(String[] args) {
		// Create 3*3 byte 2D array and read the elements from the array using while loop?
		
		// create 3*3 byte 2D array 
		byte b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		// read the elements from array using while loop
		int i=0;
		while(i<b.length)
		{
			int j=0;
			while(j<b[i].length)
			{
				System.out.print(b[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
