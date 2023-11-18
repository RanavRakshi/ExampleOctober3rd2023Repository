package com.sgtesting.stringassignment;

// the given String is "Bangalore and Mysore" WAP to display as "Mysore and Bangalore"

class Display
{
	public static String displayString(String s)
	{
		String[] display=s.split(" ");
		
		StringBuilder reversed=new StringBuilder();
		for(int i=display.length-1;i>=0;i--)
		{
			reversed.append(display[i]+" ");
		}
		return reversed.toString();
	}
}

public class Q7DisplayStringReverse {

	public static void main(String[] args) {

		String a="Bangalore and Mysore";
		
		String reverse=Display.displayString(a);
		System.out.println(reverse);
	}

}
