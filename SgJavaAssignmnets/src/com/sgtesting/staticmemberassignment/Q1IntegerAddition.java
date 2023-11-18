package com.sgtesting.staticmemberassignment;

// for the given 2 1D array perform of the addition of each element and return the result?

class Additionret
{
	static int[] getsum(int x[],int y[])
	{
		int res[]=new int[x.length];
		int k=0;

		if(x.length==y.length)
		{
			for(int i=0;i<x.length;i++)
			{
				res[k]=x[i]+y[i];
				k++;
			}
		}

		return res;
	}
}

public class Q1IntegerAddition {

	public static void main(String[] args) {

		int b[]= {1,2,3,4,5,6,7,8,9};
		int c[]= {2,3,4,5,6,7,8,9,1};
		int result[]=Additionret.getsum(b, c);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}

	}

}
