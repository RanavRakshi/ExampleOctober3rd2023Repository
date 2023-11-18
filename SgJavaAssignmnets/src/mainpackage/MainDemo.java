package mainpackage;

import p1.IndependentClassP1Package;
import p1.Protection;
import p1.SubClassInP1Package;
import p2.IndependentClassP2Package;
import p2.SubClassInP2Package;

public class MainDemo 
{
	public static void main(String[] args) 
	{
	 // Execute Protection class constructor
		Protection o=new Protection();
		
	 // Execute SubClassInP1Package class constructor
		SubClassInP1Package o1=new SubClassInP1Package();
		
	 // Execute IndependentClassP1Package class constructor
		IndependentClassP1Package o2=new IndependentClassP1Package();
		
	 // Execute SubClassInP2Package class constructor 
		SubClassInP2Package o3=new SubClassInP2Package();
		
	 // Execute IndependentClassP2Package class constructor
		IndependentClassP2Package o4=new IndependentClassP2Package();
	}
}
