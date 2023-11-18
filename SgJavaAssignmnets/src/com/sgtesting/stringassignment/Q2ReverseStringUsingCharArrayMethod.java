package com.sgtesting.stringassignment;

// without using reverse method reverse the given String by applying tocharArray method

class ReverseArray
{
	public static char[] reverseArray(String s)
	{
		//StringBuilder obj=new StringBuilder();
		char ch[]=s.toCharArray();
		char c[]=new char[ch.length];
		int k=0;
		for(int i=ch.length-1;i>=0;i--)
		{
			c[k]=ch[i];
			k++;
		}
		return c;
	}
}

public class Q2ReverseStringUsingCharArrayMethod {

	public static void main(String[] args) {

		String a="Welcome";
		
		char[] V=ReverseArray.reverseArray(a);
		System.out.println(V);
	}

}
