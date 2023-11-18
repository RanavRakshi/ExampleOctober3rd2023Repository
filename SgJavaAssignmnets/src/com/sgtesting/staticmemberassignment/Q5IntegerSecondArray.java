package com.sgtesting.staticmemberassignment;

// for the given 1D integer array assign elements into another array in reverse order
// and return the second array?

class SecondRev
{
	static int []getArray(int x[])
	{
		int a[]=new int[x.length];
		int k=0;
		for(int i=x.length-1;i>=0;i--)
		{
			a[k]=x[i];
			k++;
		}
		return a;
	}
}

public class Q5IntegerSecondArray {

	public static void main(String[] args) {
		
		int y[]= {1,2,3,4,5,6,7,8,9};
		int res[]=SecondRev.getArray(y);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

}
