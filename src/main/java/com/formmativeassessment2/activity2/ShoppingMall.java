package com.formmativeassessment2.activity2;

public class ShoppingMall extends Building
{
	public int nrParkingBays, nrRestRooms, nrShops;
	public boolean underGroundParking;

	public ShoppingMall(int size, boolean multiStorey, int nrWindows, int nrDoors, String roofType, boolean underGroundParking, int nrParkingBays, int nrRestRooms, int nrShops)
	{
		super(size, multiStorey, nrWindows, nrDoors, roofType);
		this.nrParkingBays = nrParkingBays;
		this.nrRestRooms = nrRestRooms;
		this.nrShops = nrShops;
		this.underGroundParking = underGroundParking;
	}

	public void electricityUsePerShop()
	{
		System.out.println("Shopping malls require electricity use per shop");
	}
}
