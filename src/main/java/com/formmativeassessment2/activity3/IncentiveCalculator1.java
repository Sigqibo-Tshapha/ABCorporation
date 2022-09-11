package com.formmativeassessment2.activity3;

import java.util.Scanner;

public class IncentiveCalculator1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		try
		{
			System.out.println("Object: Employee");
			System.out.print("\nEmployee Number : ");
			int employeeNumber = scanner.nextInt();
			System.out.print("\nEmployee Name : ");
			String employeeName = scanner.next();
			System.out.print("\nEmployee Surname : ");
			String employeeSurname = scanner.next();
			System.out.print("\nAnnual Salary : ");
			double annualSalary = scanner.nextDouble();
			System.out.print("\nNumber Of Years Employed : ");
			int numberOfYearsEmployed = scanner.nextInt();
			System.out.print("\nPerformance Score : ");
			double performanceScore = scanner.nextDouble();

			Employee employeeObject = new Employee(employeeNumber, employeeName, employeeSurname, numberOfYearsEmployed, annualSalary, performanceScore);
			System.out.println("Bonus for " + employeeName + " : " + employeeObject.CalculateBonusAmount(annualSalary, numberOfYearsEmployed, performanceScore));
		}catch (Exception e)
		{
			System.out.println("Please ensure a valid datatype!");
		}
	}
}
