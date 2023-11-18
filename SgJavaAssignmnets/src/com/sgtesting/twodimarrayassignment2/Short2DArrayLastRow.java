package com.sgtesting.twodimarrayassignment2;

public class Short2DArrayLastRow {

	public static void main(String[] args) {
		// create 3*3 short 2D array, WAP to read the last row of the elements alone?
		
		// create 3*3 short 2D array
		short s[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		// read the last row of the elements from 2D short array
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[2][i]+" ");
		}

	}

}
