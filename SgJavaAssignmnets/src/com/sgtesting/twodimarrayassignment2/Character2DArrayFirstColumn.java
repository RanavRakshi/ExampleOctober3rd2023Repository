package com.sgtesting.twodimarrayassignment2;

public class Character2DArrayFirstColumn {

	public static void main(String[] args) {
		// Create 3*3 character 2D array, read first column of the elements?
		
		// create 3*3 character 2D array
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		
		// read the first column of the elements from the character 2D array
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i][0]+" ");
		}

	}

}
