package com.formmativeassessment2.activity2;

public class Building
{
	public int size, nrWindows ,nrDoors;
	public boolean multiStorey;
	public String roofType;

	public Building(int size, boolean multiStorey, int nrWindows, int nrDoors, String roofType)
	{
		this.size =  size;
		this.multiStorey = multiStorey;
		this.nrWindows = nrWindows;
		this.nrDoors = nrDoors;
		this.roofType = roofType;
	}

	public void waterConsumption()
	{
		System.out.println("Every building has water consumption");
	}

	public void electricityUse()
	{
		System.out.println("Every building has electricity consumption");
	}
}
