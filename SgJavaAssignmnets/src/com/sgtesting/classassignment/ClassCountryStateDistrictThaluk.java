package com.sgtesting.classassignment;

class Country
{
	String CountryName;
	String CountryPresident;
	String CountryPM;
	String CapitalCity;
	int TotalStats;
}

class State
{
	String CountryName;
	String StateName;
	String Capitalcity;
	int TotalDistricts;
	double Population;
}

class District
{
	String SateName;
	String DistrictName;
	String CapitalTown;
	String AnotherName;
	int TotalThaluks;
}

class Thaluk
{
	String DistrictName;
	String ThalukName;
	String FamousPlace;
	long Population;
	String MLA;
}

public class ClassCountryStateDistrictThaluk {

	public static void main(String[] args) {
		// create a class for country,state,district,thaluk and execute each class members?

		Country cou=new Country();
		cou.CountryName="Bharath";
		cou.CountryPresident="Droupadi Murmu";
		cou.CountryPM="Narendra Modi";
		cou.CapitalCity="Dehli";
		cou.TotalStats=28;
		System.out.println("CountryName:"+cou.CountryName);
		System.out.println("CountryPresident:"+cou.CountryPresident);
		System.out.println("CountryPM:"+cou.CountryPM);
		System.out.println("CapitalCity:"+cou.CapitalCity);
		System.out.println("TotalStates:"+cou.TotalStats);
		System.out.println("*************************");
		State sta=new State();
		sta.CountryName="Bharath";
		sta.StateName="Karnataka";
		sta.Capitalcity="Bengaluru";
		sta.TotalDistricts=31;
		sta.Population=6.41;
		System.out.println("CountryName:"+sta.CountryName);
		System.out.println("StateName:"+sta.StateName);
		System.out.println("CapitalCity:"+sta.Capitalcity);
		System.out.println("TotalDistricts:"+sta.TotalDistricts);
		System.out.println("Population:"+sta.Population);
		System.out.println("**************************");
		District dis=new District();
		dis.SateName="Karnataka";
		dis.DistrictName="Tumakuru";
		dis.CapitalTown="Tumakauru Urban";
		dis.AnotherName="Vidya Nagari";
		dis.TotalThaluks=10;
		System.out.println("stateName:"+dis.SateName);
		System.out.println("DistrictName:"+dis.DistrictName);
		System.out.println("CapitalTown:"+dis.CapitalTown);
		System.out.println("AnotherName:"+dis.AnotherName);
		System.out.println("TotalThaluks:"+dis.TotalThaluks);
		System.out.println("**************************");
		Thaluk tha=new Thaluk();
		tha.DistrictName="Tumakuru";
		tha.ThalukName="Koratagere";
		tha.FamousPlace="Gorawanahalli";
		tha.Population=167591;
		tha.MLA="Parameshwar";
		System.out.println("DistrictName:"+tha.DistrictName);
		System.out.println("ThalukName:"+tha.ThalukName);
		System.out.println("FamousPlace:"+tha.FamousPlace);
		System.out.println("Population:"+tha.Population);
		System.out.println("MLA:"+tha.MLA);
		
		
		
	}

}
