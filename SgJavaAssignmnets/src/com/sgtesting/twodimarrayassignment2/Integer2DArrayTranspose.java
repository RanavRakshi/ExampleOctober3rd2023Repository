package com.sgtesting.twodimarrayassignment2;

public class Integer2DArrayTranspose {

	public static void main(String[] args) {
		// there is a integer 3*3 2D array, WAP to transpose the elements (row become column)?
		
		// create integer 3*3 2D array
		int i[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		// read the 2D array elements in transpose
		for(int a=0;a<i.length;a++)
		{
			for(int j=0;j<i[a].length;j++)
			{
				System.out.print(i[j][a]+" ");
			}
			System.out.println();
		}

	}

}
