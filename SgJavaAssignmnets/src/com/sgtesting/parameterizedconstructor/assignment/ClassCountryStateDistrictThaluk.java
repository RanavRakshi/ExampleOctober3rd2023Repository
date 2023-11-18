package com.sgtesting.parameterizedconstructor.assignment;

class Country
{
	String CountryName;
	String CountryPresident;
	String CountryPM;
	String CapitalCity;
	int TotalStates;
	
	Country (String CouName,String couPresident,String CouPM,String CapCity,int TotStates)
	{
		CountryName=CouName;
		CountryPresident=couPresident;
		CountryPM=CouPM;
		CapitalCity=CapCity;
		TotalStates=TotStates;
		System.out.println("CountryName:"+CountryName);
		System.out.println("CountryPresident:"+CountryPresident);
		System.out.println("CountryPM:"+CountryPM);
		System.out.println("CapitalCity:"+CapitalCity);
		System.out.println("TotalStates:"+TotalStates);
		System.out.println("*************************");
	}
}

class State
{
	String CountryName;
	String StateName;
	String Capitalcity;
	int TotalDistricts;
	double Population;
	
	State (String CouName,String StaName,String CapCity,int TotDistrict,double Popul)
	{
		CountryName=CouName;
		StateName=StaName;
		Capitalcity=CapCity;
		TotalDistricts=TotDistrict;
		Population=Popul;
		System.out.println("CountryName:"+CountryName);
		System.out.println("StateName:"+StateName);
		System.out.println("CapitalCity:"+Capitalcity);
		System.out.println("TotalDistricts:"+TotalDistricts);
		System.out.println("Population:"+Population);
		System.out.println("**************************");
	}
}

class District
{
	String StateName;
	String DistrictName;
	String CapitalTown;
	String AnotherName;
	int TotalThaluks;
	
	District (String StaName,String DisName,String CapCity,String AnoName,int TotThaluk)
	{
		StateName=StaName;
		DistrictName=DisName;
		CapitalTown=CapCity;
		AnotherName=AnoName;
		TotalThaluks=TotThaluk;
		System.out.println("stateName:"+StateName);
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("CapitalTown:"+CapitalTown);
		System.out.println("AnotherName:"+AnotherName);
		System.out.println("TotalThaluks:"+TotalThaluks);
		System.out.println("**************************");
	}
}

class Thaluk
{
	String DistrictName;
	String ThalukName;
	String FamousPlace;
	long Population;
	String MLA;
	
	Thaluk (String DisName,String ThaName,String FamPlac,long Poplu,String PMLA)
	{
		DistrictName=DisName;
		ThalukName=ThaName;
		FamousPlace=FamPlac;
		Population=Poplu;
		MLA=PMLA;
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("ThalukName:"+ThalukName);
		System.out.println("FamousPlace:"+FamousPlace);
		System.out.println("Population:"+Population);
		System.out.println("MLA:"+MLA);
	}
}

public class ClassCountryStateDistrictThaluk {

	public static void main(String[] args) {
		// create a class for country,state,district,thaluk and execute each class members?

		Country cou=new Country("Bharath","Draupadi Murmu","Narendra Modi","New Delhi",28);
		
		State sta=new State("Bharath","Karnataka","Bengaluru",30,6.4158);
		
		District dis=new District("Karnataka","Tumakuru","Tumakuru Urban","Vidya Nagari", 10);
		
		Thaluk tha=new Thaluk("Tumakuru","Koratagere","Gorawanahalli",167504,"Parameshwara");
		
		
		
		
	}

}
