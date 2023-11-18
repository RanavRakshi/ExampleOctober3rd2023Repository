package com.sgtesting.returnassignment;

// 5) WAM for the given 2D string array, it has to return the concatenation result?

class Concat
{
	String concat(String s[][])
	{
		String s1=" ";
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				 s1=s1+s[i][j];
			}
		}
		return s1;
	}
}

public class StringArrayConcate {

	public static void main(String[] args) {
		
		Concat con=new Concat();
		String a[][]= {{"Wlcome","Home","Ranav"},{"Take","Rest","Then"},{"We","Will go","For Walk"}};
		String res=con.concat(a);
		System.out.println(res);
		System.out.println("*********************");
		
	}

}
