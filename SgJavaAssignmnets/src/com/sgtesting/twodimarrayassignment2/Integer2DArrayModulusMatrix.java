package com.sgtesting.twodimarrayassignment2;

public class Integer2DArrayModulusMatrix {

	public static void main(String[] args) {
		// create 3*3 integer 2D array apply modulus operator on each element and display result
		// in matrix format


		// create integer 3*3 2D array
		int i[][]= {{10,20,30},{40,50,60},{70,80,90}};

		// display modulus of 2D array in matrix format
		for(int a=0; a<i.length;a++)
		{
			for(int j=0;j<i[a].length;j++)
			{
				System.out.print((i[a][j]%2)+" ");
			}
			System.out.println();
		}


	}

}
