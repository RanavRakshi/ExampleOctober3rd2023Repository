package com.sgtesting.stringassignment;

// without using length method write a program to find the no. of characters in a 
// given String

class NoOfChar
{
	public static int countchar(String s)
	{
		int count=0;
		for(int s1:s.toCharArray())
		{
			count++;
		}
		return count;
	}
}

public class Q4WitoutUsingLengthFindNoOfChar {

	public static void main(String[] args) {
		
		String a="Welcome";
		
		int charCount=NoOfChar.countchar(a);
		System.out.println("No of Characters: "+charCount);
	}

}
