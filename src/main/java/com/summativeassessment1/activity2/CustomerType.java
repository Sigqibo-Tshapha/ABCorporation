package com.summativeassessment1.activity2;
//3.1
public enum CustomerType
{
	STUDENT(5),
	RETAIL(10),
	BUSINESS(15);

	private final int interest;
	CustomerType(int interest)
	{
		this.interest = interest;
	}

	public int getNormalInterest()
	{
		return interest;
	}
	public int getSpecialInterest()
	{
		return this.interest + 2;
	}
}
