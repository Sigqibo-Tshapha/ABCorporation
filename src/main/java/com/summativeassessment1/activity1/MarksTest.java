package com.summativeassessment1.activity1;

import java.text.DecimalFormat;

abstract class Marks
{
	public double getPercentage()
	{
		return 0;
	}
}

class MarksA extends Marks
{
	private double a,b,c;
	public MarksA(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getPercentage()
	{
		return (a + b + c) / 3;
	}

}

class MarksB extends Marks
{
	private double a,b,c,d;
	public MarksB(double a, double b, double c, double d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public double getPercentage()
	{
		return (a + b + c + d) / 4;
	}
}

public class MarksTest
{
	public static void main(String[] args)
	{
		System.out.println("Test Data");
		DecimalFormat df = new DecimalFormat("##0.00");

		System.out.println("Student A: marksA(50, 48, 38)");
		MarksA marksA = new MarksA(50, 48, 38);
		System.out.println("Percentage : " +df.format(marksA.getPercentage()));

		System.out.println("Student B: marksB(75, 86, 93, 80)");
		MarksB marksB = new MarksB(75, 86, 93, 80);
		System.out.println("Percentage : " + df.format(marksB.getPercentage()) );
	}
}
