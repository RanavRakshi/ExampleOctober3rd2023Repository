package com.sgtesting.twodimarrayassignment2;

public class String2DArraySecondRow {

	public static void main(String[] args) {
		// create 3*3 string 2D array, WAP to read 2nd row of the elements?
		
		// create 3*3 string 2D array
		String s[][]= {{"Wlcome","Home","Ranav"},{"Take","Rest","Then"},{"We","Will go","For Walk"}};
		
		// read the 2nd row of the elements from 2D string array
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[1][i]+" ");
		}

	}

}
