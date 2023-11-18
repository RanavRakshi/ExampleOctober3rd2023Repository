package com.sgtesting.methodassignment;

// WAM for the given 2D 3*3 character array and transpose the array?

class CharacterTranspose
{
	void charTrans(char ch[][])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[0].length;j++)
			{
				System.out.print(ch[j][i]+" ");
			}
			System.out.println();
		}
	}
}

public class AssignmentQuestion7 {

	public static void main(String[] args) {
		
		char a[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		CharacterTranspose ch1=new CharacterTranspose();
		ch1.charTrans(a);
	}

}
