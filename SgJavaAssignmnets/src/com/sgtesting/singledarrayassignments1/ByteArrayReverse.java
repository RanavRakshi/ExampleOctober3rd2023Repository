package com.sgtesting.singledarrayassignments1;

public class ByteArrayReverse {

	public static void main(String[] args) {
		//1) WAP to read the elements from the byte array in reverse order?

		// create a byte array
		byte a[]={10,20,30,40,50,60};

		// use a for loop to read the elements from the byte array
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
