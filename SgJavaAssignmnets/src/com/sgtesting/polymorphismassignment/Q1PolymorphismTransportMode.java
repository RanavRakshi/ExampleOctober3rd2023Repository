package com.sgtesting.polymorphismassignment;

abstract class Transport
{
	abstract void modeOfTransport();
}

class RoadWay extends Transport
{
	void modeOfTransport()
	{
		String name="Lorry";
		System.out.println("Road way transports are: "+name);
	}
}

class SeaWay extends Transport
{
	void modeOfTransport()
	{
		String name="Ship";
		System.out.println("SeaWay transports are: "+name);
	}
}

class AirWay extends Transport
{
	void modeOfTransport()
	{
		String name="Aeroplane";
		System.out.println("AirWay transports are: "+name);
	}
}

public class Q1PolymorphismTransportMode {

	public static void main(String[] args) {

		Transport trans=null;
		
		RoadWay road=new RoadWay();
		SeaWay sea=new SeaWay();
		AirWay air=new AirWay();
		
		trans=road;
		trans.modeOfTransport();
		
		trans=sea;
		trans.modeOfTransport();
		
		trans=air;
		trans.modeOfTransport();
	}

}
