package com.sgtesting.stringassignment;

// without using reverse method reverse given string by applying charAt method

class ReverseString
{
	public static String reverseString(String s)
	{
		StringBuilder obj=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			obj.append(s.charAt(i));
		}
		return obj.toString();
	}
}

public class Q1ReverseStringUsingCharAtMethod {

	public static void main(String[] args) {

		String originalString="Welcome, Home";
		
		String reversedString=ReverseString.reverseString(originalString);
		System.out.println(reversedString);
	}

}
