package com.sgtesting.twodarrayassignment1;

public class String2DimArray {

	public static void main(String[] args) {
		// WAP to read elements from string 2D 3*# array 
		
		String a[][]= {{"Ranav","Rakshi","Ravi"},{"Thilak","Shine","Thili"},{"Praveen","Raya","Sille"}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
