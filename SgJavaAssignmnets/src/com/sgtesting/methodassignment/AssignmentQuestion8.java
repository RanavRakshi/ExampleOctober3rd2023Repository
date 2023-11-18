package com.sgtesting.methodassignment;

// WAM for the given 3*3 character array concatenate all the elements?

class ChaacConcate
{
	void chaConc(char ch[][])
	{
		String b=" ";
		for(char row[]:ch)
		{
			for(char a:row)
			{
				b+=a;
			}
		}
		System.out.println(b);
	}
}

public class AssignmentQuestion8 {

	public static void main(String[] args) {
		
		char b[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		ChaacConcate cha=new ChaacConcate();
		cha.chaConc(b);
	}

}
