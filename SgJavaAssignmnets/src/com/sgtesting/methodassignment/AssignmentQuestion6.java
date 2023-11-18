package com.sgtesting.methodassignment;

// WAM to display all complete 20 tables?

class Tables
{
	void tables()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("Table of: "+i);
			for(int j=1;j<=10;j++)
			{
				int num=i*j;
				System.out.println(i+"*"+j+"="+num);
			}
			System.out.println();
		}
	}
}

public class AssignmentQuestion6 {

	public static void main(String[] args) {
		
		Tables tb=new Tables();
		tb.tables();
	}

}
