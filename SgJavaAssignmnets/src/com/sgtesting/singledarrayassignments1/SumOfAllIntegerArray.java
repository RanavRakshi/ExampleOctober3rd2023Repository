package com.sgtesting.singledarrayassignments1;

public class SumOfAllIntegerArray {

	public static void main(String[] args) {
		//11) There is an integer array it has some elements WAP to find the sum of all elements?
		
		// create an integer array
		int a[]= {1,20,3,45,50,6};
		
		// create a variable to store the sum value
		int sum=0;
		// find the sum of all elements from integer array
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
