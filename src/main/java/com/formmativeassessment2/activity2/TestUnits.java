package com.formmativeassessment2.activity2;

public class TestUnits
{
	public static void main(String[] args)
	{
		OfficePark NewOfficePark = new OfficePark(1000, false, 500,200, "Steel", false, 100,10,3);
		ShoppingMall NewShoppingMall = new ShoppingMall(10000, true, 5000, 2000, "Fibre Glass", true, 1000, 50, 500);

		System.out.println("NewOfficePark object details"+
								   "\nSize : "+ NewOfficePark.size + " sqm,"+
								   "\nIs multistorey : " + NewOfficePark.multiStorey +
								   "\nNo. of windows : "+ NewOfficePark.nrWindows +
								   "\n");
		System.out.println("NewShoppingMall object Details "+
								   "\nSize : "+ NewShoppingMall.size +
								   "\nIs Multi storey : "+ NewShoppingMall.multiStorey +"\n");
	}
}
