package com.formmativeassessment2.activity3;

public class Employee
{
	public int employeeNumber,numberOfYearsEmployed;
	private double annualSalary,performanceScore;
	public String employeeName,employeeSurname;

	public Employee(int employeeNumber, String employeeName, String employeeSurname, int numberOfYearsEmployed, double annualSalary, double performanceScore)
	{
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.numberOfYearsEmployed = numberOfYearsEmployed;
		this.annualSalary = annualSalary;
		this.performanceScore = performanceScore;
	}

	public double CalculateBonusAmount( double annualSalary, int numberOfYearsEmployed, double performanceScore)
	{
		double bonusIncentive = (annualSalary * performanceScore * 0.01) + (annualSalary * numberOfYearsEmployed * 0.001);
		return bonusIncentive;
	}
}
