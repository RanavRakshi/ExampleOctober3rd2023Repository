package com.sgtesting.staticmemberassignment;

// for the given 2D integer array the method has to return all th elemnets of 2D array 
// in the form of 1D array?

class TwoToOne
{
	static int []getArray(int x[][])
	{
		int a[]=new int [x.length*x[0].length];
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				a[k]=x[i][j];
				k++;
			}
		}
		return a;
	}
}

public class Q4TwoDArrayToOneDArray {

	public static void main(String[] args) {
		
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int res[]=TwoToOne.getArray(b);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}

}
