package com.sgtesting.methodassignment;

// WAM for the given 3*3 2D string array concatenate the only 
// 3rd row of the elements?

class ConcaStr
{
	void concStr(String s[][])
	{
		String a=" ";
		for(int i=0;i<s.length;i++)
		{
				a=a+s[2][i];	
		}
		System.out.println(a);
	}
}

public class AssignmentQuestion11 {

	public static void main(String[] args) {
		
		String s1[][]= {{"Wlcome","Home","Ranav"},{"Take","Rest","Then"},{"We","Will go","For Walk"}};
		ConcaStr co=new ConcaStr();
		co.concStr(s1);
	}

}
