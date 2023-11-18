package com.sgtesting.operatorassignment2;

public class AndLogicalOperator {

	public static void main(String[] args) {
		// WAP to display and operator?
		
		int a=20;
		int b=10;
		boolean c=((a>b)&&(b<a));
		System.out.println(c);

		boolean d=!((a>b)&&(b<a));
		System.out.println(d);

	}

}
