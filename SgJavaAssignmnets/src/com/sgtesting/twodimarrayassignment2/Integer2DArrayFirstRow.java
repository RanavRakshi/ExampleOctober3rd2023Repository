package com.sgtesting.twodimarrayassignment2;

public class Integer2DArrayFirstRow {

	public static void main(String[] args) {
		// create integer 3*3 2D array read only first row of the elements?
		
		// create integer 3*3 2D array
		int i[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		// read only first row of the elements from integer 2D array
		for(int a=0; a<i.length;a++)
		{
			//for(int j=0;j<i[a].length;j++)
			{
				System.out.print(i[0][a]+" ");
			}
			//System.out.println();
		}

	}

}
