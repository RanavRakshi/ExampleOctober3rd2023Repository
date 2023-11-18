package com.sgtesting.staticmemberassignment;

// for the given 2 1D integer arrays create a resultant array and resultant array?
// Using for loop

class ResulatantArr
{
	static int []getResultant(int x[], int y[])
	{
		int result[]=new int[(x.length)+(y.length)];
		int k=0;
		 for(int i=0;i<x.length;i++)
		 {
			 result[k++]=x[i];
		 }
		 for(int j=0;j<y.length;j++)
		 {
			 result[k++]=y[j];
		 }
		 
		return result;
	}
}

// Using for each loop
class ResultantArr1
{
	static int []getResultantArr(int x[], int y[])
	{
		int res[]=new int[x.length+y.length];
		int k=0;
		
		for(int i:x)
		{
			res[k]=i;
			k++;
		}
		
		for(int i:y)
		{
			res[k]=i;
			k++;
		}
		return res;
	}
}

public class Q2IntegerResultant {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		int res[]=ResulatantArr.getResultant(a, b);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		System.out.println();
		System.out.println("**********************");
		
		int res1[]=ResultantArr1.getResultantArr(a, b);
		for(int i=0;i<res1.length;i++)
		{
			System.out.print(res1[i]+" ");
		}

	}

}
