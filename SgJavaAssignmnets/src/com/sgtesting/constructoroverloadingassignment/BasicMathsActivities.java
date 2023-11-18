package com.sgtesting.constructoroverloadingassignment;

class Demo4
{
	Demo4 (int x, int y, String action)
	{
		int res = 0;
		switch (action)
		{
		case "Add":
			res=x+y;
			System.out.println("Addition result: "+res);
			break;
		case "Sub":
			res=x-y;
			System.out.println("Subtraction result: "+res);
			break;
		case "Div":
			res=x/y;
			System.out.println("Division result: "+res);
			break;
		case "Mult":
			res=x*y;
			System.out.println("Multiplication result: "+res);
			break;
			
		}
	}
}

public class BasicMathsActivities 
{
	public static void main(String[] args) 
	{
		Demo4 dem = new Demo4 (10,20,"Add");
		Demo4 dem1 = new Demo4 (25,10,"Sub");
		Demo4 dem2 = new Demo4 (100,5,"Div");
		Demo4 dem3 = new Demo4 (10,20,"Mult");
	}

}
