package com.summativeassessment1.activity2;

import java.util.Arrays;

public class CustomerEnum
{
	public static void main(String[] args)
	{
		//3.3
		CustomerType normalStudent = CustomerType.STUDENT;
		CustomerType normalRetail = CustomerType.RETAIL;
		CustomerType normalBusiness = CustomerType.BUSINESS;

		//3.4 ...confirm
		System.out.println("Student constant : "+ normalStudent);
		System.out.println("Retail constant : "+ normalRetail);
		System.out.println("Business constant : "+ normalBusiness);
		System.out.println();

		//3.5
		System.out.println("Normal Student interest : "+ normalStudent.getNormalInterest());
		System.out.println("Normal Retail interest : "+ normalRetail.getNormalInterest());
		System.out.println("Normal Business interest : "+ normalBusiness.getNormalInterest());
		System.out.println();

		//3.6
		CustomerType specialStudent = CustomerType.STUDENT;
		CustomerType specialRetail = CustomerType.RETAIL;
		CustomerType specialBusiness = CustomerType.BUSINESS;

		//3.7
		System.out.println("Special Student interest : "+ specialStudent.getSpecialInterest());
		System.out.println("Special Retail interest : "+ specialRetail.getSpecialInterest());
		System.out.println("Special Business interest : "+ specialBusiness.getSpecialInterest());
		System.out.println();

		//3.8
		CustomerType[] customerTypeArray = CustomerType.values();
		System.out.println(Arrays.toString(customerTypeArray));
		System.out.println();

		//3.9
		for(CustomerType c : customerTypeArray)
		{
			System.out.println("Ordinal value of "+c+" : "+c.ordinal());
		}
		System.out.println();


	}
}
