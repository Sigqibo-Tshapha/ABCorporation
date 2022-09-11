package com.formmativeassessment2.activity2;

public class House extends Building
{
	public int nrGarage, nrBedroom, nrBathroom;
	public boolean pool, maidsRooms;

	public House(int size, boolean multiStorey, int nrWindows, int nrDoors, String roofType, int nrGarage, int nrBedroom, int nrBathroom, boolean pool, boolean maidsRooms)
	{
		super(size, multiStorey, nrWindows, nrDoors, roofType);
		this.nrGarage = nrGarage;
		this.nrBedroom = nrBedroom;
		this.nrBathroom = nrBathroom;
		this.pool = pool;
		this.maidsRooms = maidsRooms;
	}

	public void gardenSize()
	{
		System.out.println("Only houses require garden size");
	}
}
