package com.sgtesting.staticmemberassignment;

// for the given 2 1D integer array subtract each elements and return the result of 
// 2nd half of the elements?

class SubtractArr
{
	static int[] getSubtr(int x[],int y[])
	{
		int res[]=new int[x.length];
		if(x.length==y.length)
		{
			for(int i=x.length/2;i<x.length;i++)
			{
				res[i]=x[i]-y[i];
			}
		}
		return res;
	}
}

public class Q3IntegerSubtract {

	public static void main(String[] args) {

		int b[]= {10,20,30,40,50,60,70,80,90,100};
		int c[]= {5,13,14,25,26,37,58,69,80,75};
		int result[]=SubtractArr.getSubtr(b, c);
		for(int i=result.length/2;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}

}
