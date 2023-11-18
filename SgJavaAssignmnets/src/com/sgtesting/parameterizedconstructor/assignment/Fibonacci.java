package com.sgtesting.parameterizedconstructor.assignment;

class Demo3
{
	Demo3()
	{
		int fn = 0;
		int sn = 1;
		System.out.println(fn);
		System.out.println(sn);
		
		for (int i=1; i<=10; i++)
		{
			int tn = fn+sn;
			System.out.println(tn);
			fn = sn;
			sn = tn;
		}
	}
}

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Demo3 dem = new Demo3();
	}

}
