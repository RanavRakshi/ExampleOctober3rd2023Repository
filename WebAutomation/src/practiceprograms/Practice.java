package p1;

import java.util.HashMap;
import java.util.Scanner;

class Pract
{
	public static int power(int b,int p)
	{
		int power=1;
		for(int i=1;i<=p;i++)
		{
			power=power*b;
		}
		return power;
	}
}

class DuplicateArray
{
	public void duplicateArray()
	{
		int arr[]= {1,2,3,4,2,7,8,8,3};
		System.out.println("Duplicate element in the given Array: ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]);
				}
			}
		}
	}
}

class Count
{
	
	// input array={1,2,4,5,6,3,1,2,3,3}, output=24
	// here, elements 1 and 2 repeats twice (even), whereas elements 4,5,6 are present only 
	// once (odd) and element 3 occurs thrice (odd).  hence, elements having odd frequency:
	// {4,5,6,3,3,3}. sum of elements having odd frequency: 24
	
	static void countNumbers(int a[])
	{
		HashMap<Integer, Integer>numsCount=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(numsCount.containsKey(a[i]))
			{
				numsCount.put(a[i], numsCount.get(a[i])+1);
			}
			else
			{
				numsCount.put(a[i], 1);
			}
		}
		System.out.println();
		System.out.println(numsCount);
		int sum=0;
		for(int k:numsCount.keySet())
		{
			if(numsCount.get(k)%2==1)
			{
				sum=sum+(k*numsCount.get(k));
			}
		}
		System.out.println(sum);
	}
}

public class Practice {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number b: ");
			int b=sc.nextInt();
			System.err.println("Enter the number p: ");
			int p=sc.nextInt();
			int power=Pract.power(b, p);
			System.out.println(b+" to the Power of "+p+" ="+power);
		}
		System.out.println();
		
		DuplicateArray d=new DuplicateArray();
		d.duplicateArray();
		System.out.println();
		
		int array[]= {1,2,4,5,6,3,1,2,3,3};
		Count.countNumbers(array);
	}

}
