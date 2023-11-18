package com.sgtesting.singledarrayassignments1;

public class DoubleArrayReverseUsingDoWhile {

	public static void main(String[] args) {
		//3) WAP to create the double array and read the elements from double array 
		// in reverse order using do while loop?
		
		// create a double array
		double a[]={10.25,20.35,30.65,40.85,50.15};
		
		//initialize the index for array
		int i=a.length-1;
		// read the double array in reverse order using do while loop
		do
		{
			System.out.println(a[i]);
			i--;
		}
		while(i>=0);
		
	}

}
