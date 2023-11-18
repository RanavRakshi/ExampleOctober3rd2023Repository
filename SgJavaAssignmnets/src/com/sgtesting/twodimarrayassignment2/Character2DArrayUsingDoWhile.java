package com.sgtesting.twodimarrayassignment2;

public class Character2DArrayUsingDoWhile {

	public static void main(String[] args) {
		// create 2*3 character array and read the elements using do while loop?
		
		// create 2*3 character array
		char ch[][]= {{'A','B','C'},{'D','E','F'}};
		
		// read the elements from character 2D array using do while loop
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(ch[i][j]+" ");
				j++;
			}
			while(j<ch[i].length);
			System.out.println();
			i++;
		}
		while(i<ch.length);

	}

}
