package com.sgtesting.singledarrayassignments1;

public class StringArrayInReverseUsingWhile {

	public static void main(String[] args) {
		//4) WAP to create a string array and read the elements from the string array in reverse order 
		// using while loop?

		// create a string array
		String a[]= {"Ranav","Rakshi","Alalasandra","Koratagere","Tumakuru"};

		// Initialize the index for array
		int i=a.length-1;

		// read the elements from the string array in reverse order using while loop
		while(i>=0)
		{
			System.out.println(a[i]);
			i--;
		}

	}

}
