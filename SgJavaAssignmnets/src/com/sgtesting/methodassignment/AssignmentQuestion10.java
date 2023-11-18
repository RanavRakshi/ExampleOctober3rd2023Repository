package com.sgtesting.methodassignment;

// WAM to perform subtraction of 2 matrix and transpose the result?

class MatrixSub
{
	void matrixSub(int x[][],int y[][])
	{
		if(x.length==y.length && x[0].length==y[0].length)
		{
			int c[][]=new int [x.length][x[0].length];
			System.out.println("Result Before Transpose: ");
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					c[i][j]=x[i][j]-y[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}

			System.out.println("Result After Transpose; ");
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					System.out.print(c[j][i]+" ");
				}
				System.out.println();
			}

		}

	}

}

public class AssignmentQuestion10 {

	public static void main(String[] args) {

		int a[][]= {{70,80,90},{40,50,60},{80,90,100}};
		int b[][]= {{40,30,20},{10,25,10},{30,25,35}};
		MatrixSub ms=new MatrixSub();
		ms.matrixSub(a, b);
	}

}
