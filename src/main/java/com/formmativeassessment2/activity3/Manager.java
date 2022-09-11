package com.formmativeassessment2.activity3;

public class Manager extends Employee
{
	public Manager(int employeeNumber, String employeeName, String employeeSurname, int numberOfYearsEmployed, double annualSalary, double performanceScore)
	{
		super(employeeNumber, employeeName, employeeSurname, numberOfYearsEmployed, annualSalary, performanceScore);
	}

	@Override
	public double CalculateBonusAmount(double annualSalary, int numberOfYearsEmployed, double performanceScore)
	{
		double bonusIncentive = (annualSalary * performanceScore * 0.015) + (annualSalary * numberOfYearsEmployed * 0.0015);
		return bonusIncentive;
	}
}
