package com.summativeassessment3.activity2;

import java.util.HashMap;

public class CustomerAccountOrder extends CustomerOrder
{

	public CustomerAccountOrder(int customerNumber, int quotationNumber, int customerCategory, int productCode, int quantity, double price, double subTotal, double vatAmount, double discountAmount,
								double amountDue, HashMap<Product, Integer> products)
	{
		super(customerNumber, quotationNumber, customerCategory, productCode, quantity, price, subTotal, vatAmount, discountAmount, amountDue, products);
	}
	@Override
	public double calculateTotalAmountDue()
	{
		getProducts().forEach((product, quantity) -> subTotal += product.getPrice() * quantity);
		double vatAmount = subTotal * 0.15;
		double subTotalInclVat = vatAmount + subTotal;
		double categoryDiscount = 0;

		switch (customerCategory)
		{
			case 1:
				categoryDiscount = subTotalInclVat * 0.1 ;
			case 2:
				categoryDiscount = subTotalInclVat * 0.15;
			case 3:
				categoryDiscount = subTotalInclVat * 0.2;
		}

		discountAmount = categoryDiscount + subTotalInclVat * 0.03;
		amountDue = subTotalInclVat - discountAmount;
		return amountDue;
	}
}
