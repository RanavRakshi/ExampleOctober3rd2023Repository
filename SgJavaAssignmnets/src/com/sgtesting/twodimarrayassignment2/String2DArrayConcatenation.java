package com.sgtesting.twodimarrayassignment2;

public class String2DArrayConcatenation {

	public static void main(String[] args) {
		// There is a 3*3 string 2D array, WAP to concatenate all the elements?

		// create string 3*3 2D array
		String s[][]= {{"Wlcome","Home","Ranav"},{"Take","Rest","Then"},{"We","Will go","For Walk"}};
		
		// read the elements from 2D string array concatenation 
		String a=" ";
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				a=a+s[i][j];
			}
				
		}
		System.out.println(a);
	}

}
