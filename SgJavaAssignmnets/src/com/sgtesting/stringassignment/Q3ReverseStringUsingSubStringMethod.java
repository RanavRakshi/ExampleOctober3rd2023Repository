package com.sgtesting.stringassignment;

// without using reverse method reverse the given string using subString method

class ReverseSub
{
	public static String subString(String s)
	{
		StringBuilder obj=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			obj.append(s.substring(i, i+1));
		}
		return obj.toString();
		
	}
}

public class Q3ReverseStringUsingSubStringMethod {

	public static void main(String[] args) {

		String b="Welcome";
		
		String reverse=ReverseSub.subString(b);
		System.out.println(reverse);
	}

}
