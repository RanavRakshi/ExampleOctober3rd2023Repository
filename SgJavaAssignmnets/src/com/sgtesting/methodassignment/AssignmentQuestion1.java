package com.sgtesting.methodassignment;
// WAM to display cube of first 10 numbers in reverse order?

class Reverse
{
	void reverseCube()
	{
		for(int i=10;i>=1;i--)
		{
			int cube=i*i*i;
			System.out.println(cube);
		}
	}
}

public class AssignmentQuestion1 {

	public static void main(String[] args) {
		
		Reverse cube=new Reverse();
		cube.reverseCube();
	}

}
