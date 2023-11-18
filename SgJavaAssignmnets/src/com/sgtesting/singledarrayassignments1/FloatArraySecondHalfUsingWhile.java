package com.sgtesting.singledarrayassignments1;

public class FloatArraySecondHalfUsingWhile {

	public static void main(String[] args) {
		//7) WAP to create a float array and read second half of the elements using while loop?
		
		// create a float array
		float a[]= {10.25f,20.235f,30.456f,40.658f,56.75f,60.789f};
		
		// initialize index for array
		int i=a.length/2;
		
		// read second half half of the elements from float array using while loop
		while(i<a.length)
		{
			System.out.println(a[i]);
			i++;
		}

	}

}
