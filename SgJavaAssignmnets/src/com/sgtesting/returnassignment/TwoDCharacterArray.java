package com.sgtesting.returnassignment;

// 4) From the given 2D character array return 1st row of the elements?

class CharacArr
{
	char[] getFirstrow(char[][] ch)
	{
		char[] c=new char[ch[0].length];
		char k=0;
		for(int i=0;i<ch[0].length;i++)
		{
				c[k]=ch[0][i];
				k++;
		}
		return c;
	}
}

public class TwoDCharacterArray {

	public static void main(String[] args) {
		
		CharacArr cha=new CharacArr();
		char ch1 [][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		char[] res=cha.getFirstrow(ch1);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]+" ");
		}
	}

}
