package com.sgtesting.constructoroverloadingassignment;

class VTU
{
	String RegionName;
	int NumberOfCollegesUnder;
	String Address;
	int Pincode;
	int NumberOfCourseAvailable;
	String CourseOffered;
	
	VTU(String RegionName)
	{
		this.RegionName=RegionName;
		System.out.println("RegionName: "+RegionName);
	}
	
	VTU(int NumberOfCollegesUnder)
	{
		this.NumberOfCollegesUnder=NumberOfCollegesUnder;
		System.out.println("NumberOfCollegesUnder: "+NumberOfCollegesUnder);
	}
	
	VTU(String Address,int Pincode)
	{
		this.Address=Address;
		this.Pincode=Pincode;
		System.out.println("Address: "+Address);
		System.out.println("Pincode: "+Pincode);
	}
	
	VTU(int NumberOfCourseAvailable,String CourseOffered)
	{
		this.NumberOfCourseAvailable=NumberOfCourseAvailable;
		this.CourseOffered=CourseOffered;
		System.out.println("NumberOfCourseAvailable: "+NumberOfCourseAvailable);
		System.out.println("CourseOffered: "+CourseOffered);
	}
}

public class VishveshwaraiaTechnologicalUniversity{

	public static void main(String[] args) {
		// by using constructor overloading create University 
		
		VTU c1=new VTU("Bengaluru");
		VTU c2=new VTU(15);
		/*VTU c3=new VTU("Nagarabhavi Bengaluru",560048);
		VTU c4=new VTU(1,"Mechanical Engineering");*/

	}

}
