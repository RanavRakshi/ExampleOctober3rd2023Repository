package com.sgtesting.stringassignment;

// the given string is "PROGRAM"
// a) P					b) P R O G R A M
//    P R				   P R O G R A
//	  P R O				   P R O G R
//    P R O G			   P R O G
//	  P R O G R			   P R O	
//    P R O G R A		   P R
//    P R O G R A M		   P

class Pattern
{
	public static void getPattern(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}

class Pattern1
{
	public static void getpattern(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}
public class Q8aStringPattern {

	public static void main(String[] args) {

		String input="PROGRAM";
		Pattern.getPattern(input);
		System.out.println();
		
		
		Pattern1.getpattern(input);
	}

}
