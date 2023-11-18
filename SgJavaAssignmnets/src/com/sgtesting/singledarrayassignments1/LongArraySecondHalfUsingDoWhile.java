package com.sgtesting.singledarrayassignments1;

public class LongArraySecondHalfUsingDoWhile {

	public static void main(String[] args) {
		//9) WAP to create long array and read second half of the elements by applying do while loop?
		
		// create long array
		long a[]= {1000,10000,100000,20000,30000,5000};
		
		// initialize index for array
		int i=a.length/2;
		
		// read the second half of the elements from array using do while loop
		do
		{
			System.out.println(a[i]);
			i++;
		}
		while(i<a.length);

	}

}
