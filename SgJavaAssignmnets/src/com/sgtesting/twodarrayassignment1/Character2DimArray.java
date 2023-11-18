package com.sgtesting.twodarrayassignment1;

public class Character2DimArray {

	public static void main(String[] args) {
		// WAP to read elements from 2D 4*3 character array?
		
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'}};
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}

	}

}
