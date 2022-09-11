package com.formmativeassessment2.activity2;

public class OfficePark extends Building
{
	public int nrParkingBays, nrRestRooms, nrBoardRooms;
	public boolean underGroundParking;

	public OfficePark(int size, boolean multiStorey, int nrWindows, int nrDoors, String roofType, boolean underGroundParking, int nrParkingBays, int nrRestRooms, int nrBoardRooms)
	{
		super(size, multiStorey, nrWindows, nrDoors, roofType);
		this.underGroundParking = underGroundParking;
		this.nrParkingBays = nrParkingBays;
		this.nrRestRooms = nrRestRooms;
		this.nrBoardRooms = nrBoardRooms;
	}

	public void officeSpaceDesign()
	{
		System.out.println("Only offices require office space design");
	}
}
