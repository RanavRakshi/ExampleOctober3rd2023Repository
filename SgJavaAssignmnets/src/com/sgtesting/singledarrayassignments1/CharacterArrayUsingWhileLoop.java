package com.sgtesting.singledarrayassignments1;

public class CharacterArrayUsingWhileLoop {

	public static void main(String[] args) {
		//2) WAP to read the character array and read the elements from character array using while loop?

		// create a character array
		char ch[]= {'A','B','C','D','E','F'};

		// initialize index for the array
		int i=0;
		// use a while loop to read the elements from the character array
		while(i<ch.length)
		{
			System.out.println(ch[i]);
			i++;
		}

	}

}
