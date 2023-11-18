package com.sgtesting.methodassignment;

// WAM for the given 3*3 integer array assign 2nd row elements into 1D array 
// and display the elements in 1D array?

class Arrintt
{
	void arrr(int a[][])
	{
		int b[]=new int[a.length*a[0].length];
		
		for(int i=0;i<a[1].length;i++)
		{
				b[i]=a[1][i];
		}
		for(int m=0;m<a[1].length;m++)
		{
			System.out.print(b[m]+" ");
		}
		
	}
}

public class AssignmentQuestion9 {

	public static void main(String[] args) {
		
		int h[][]= {{10,20,30},{40,50,60},{70,80,90}};
		Arrintt de=new Arrintt();
		de.arrr(h);
	}

}
