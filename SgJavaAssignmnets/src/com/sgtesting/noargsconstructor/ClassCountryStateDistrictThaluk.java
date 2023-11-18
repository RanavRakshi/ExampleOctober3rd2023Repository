package com.sgtesting.noargsconstructor;

class Country
{
	String CountryName;
	String CountryPresident;
	String CountryPM;
	String CapitalCity;
	int TotalStats;
	
	Country ()
	{
		CountryName="Bharath";
		CountryPresident="Droupadi Murmu";
		CountryPM="Narendra Modi";
		CapitalCity="Dehli";
		TotalStats=28;
		System.out.println("CountryName:"+CountryName);
		System.out.println("CountryPresident:"+CountryPresident);
		System.out.println("CountryPM:"+CountryPM);
		System.out.println("CapitalCity:"+CapitalCity);
		System.out.println("TotalStates:"+TotalStats);
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
	
	State ()
	{
		CountryName="Bharath";
		StateName="Karnataka";
		Capitalcity="Bengaluru";
		TotalDistricts=31;
		Population=6.41;
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
	String SateName;
	String DistrictName;
	String CapitalTown;
	String AnotherName;
	int TotalThaluks;
	
	District ()
	{
		SateName="Karnataka";
		DistrictName="Tumakuru";
		CapitalTown="Tumakauru Urban";
		AnotherName="Vidya Nagari";
		TotalThaluks=10;
		System.out.println("stateName:"+SateName);
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
	
	Thaluk ()
	{
		DistrictName="Tumakuru";
		ThalukName="Koratagere";
		FamousPlace="Gorawanahalli";
		Population=167591;
		MLA="Parameshwar";
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

		Country cou=new Country();
		
		State sta=new State();
		
		District dis=new District();
		
		Thaluk tha=new Thaluk();
		
		
		
		
	}

}
