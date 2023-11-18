package com.sgtesting.singledarrayassignments1;

public class ShortArrayUsingDoWhileLoop {

	public static void main(String[] args) {
		//10) WAP to create a short array and read elements from the short array using do while loop?
		
		// create a short array
		short a[]= {10,20,30,40,50,60};
		
		// initialize index for array
		int i=0;
		
		// read the elements from short array using do while loop
		do
		{
			System.out.println(a[i]);
			i++;
		}
		while(i<a.length);
	}

}
