package com.sgtesting.singledarrayassignments1;

public class StringArrayFirstHalf {

	public static void main(String[] args) {
		//5) WAP to create string array and read first half off the elements the elements?

		// create a string array
		String a[]= {"Ranav","Rakshi","Alalasandra","Koratagere","Tumakuru","KA"};

		// initialize the index for array
		int i=0;

		// read first half of the elements from the string array using while loop
		while(i<a.length/2)
		{
			System.out.println(a[i]);
			i++;
		}

	}

}