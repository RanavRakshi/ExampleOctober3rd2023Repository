package com.sgtesting.stringassignment;

// WAP to verify the given string is palindrome or not

class Palindrome
{
	public static void getPalindrome()
	{
		String s="MALAYALAM";
		StringBuilder obj=new StringBuilder(s);
		String s1=obj.reverse().toString();
		System.out.println("Palindrome Result: "+s1);
		
		if(s.equals(s1))
		{
			System.out.println("The given string is a Palindrome: "+s);
		}
		else
		{
			System.out.println("The given String is not a Palindrome: "+s);
		}
	}
	
	public static void getPalind()
	{
		String s="MOM";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		if(s.equals(s1))
		System.out.println(s+" Is Palindrome");
		
		else
		System.out.println(s+" Is not a Palindrome");
	}
}

public class Q5Palindrome {

	public static void main(String[] args) {

		Palindrome.getPalindrome();
		Palindrome.getPalind();
	}

}
