package com.sgtesting.singledarrayassignments1;

public class CharacterArraySecondHalf {

	public static void main(String[] args) {
		//6) WAP to create character array and second half off the elements from the character array?

		// create a character array
		char ch[]= {'A','B','C','D','E','F'};

		// initialize index for the array
		int i=ch.length/2;

		// use a while loop to read Second half of the elements from the character array
		while(i<ch.length)
		{
			System.out.println(ch[i]);
			i++;
		}

	}

}
