package com.summativeassessment3.activity2;

import java.util.HashMap;
import java.util.List;

public class CustomerOrder
{
	protected int customerNumber;
	protected int quotationNumber;
	protected int customerCategory;
	protected int quantity;
	protected double subTotal;
	protected double vatAmount;
	protected double discountAmount;
	protected double amountDue;

	private HashMap<Product, Integer>  products;

	public CustomerOrder(int customerNumber, int quotationNumber, int customerCategory, int productCode, int quantity, double price, double subTotal, double vatAmount, double discountAmount, double amountDue, HashMap<Product, Integer> products)
	{
		this.customerNumber = customerNumber;
		this.quotationNumber = quotationNumber;
		this.customerCategory = customerCategory;
		this.quantity = quantity;
		this.subTotal = subTotal;
		this.vatAmount = vatAmount;
		this.discountAmount = discountAmount;
		this.amountDue = amountDue;
		this.products = products;
	}

	public double calculateTotalAmountDue()
	{
		products.forEach( (product, quantity) -> subTotal += product.getPrice() * quantity);
		vatAmount = subTotal * 0.15;
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

		discountAmount = categoryDiscount + subTotalInclVat* 0.1;

		amountDue = subTotalInclVat - discountAmount;
		return amountDue;
	}

	public HashMap<Product, Integer> getProducts()
	{
		return products;
	}

	public void setProducts(HashMap<Product, Integer> products)
	{
		this.products = products;
	}

	public int getCustomerNumber()
	{
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
	}

	public int getQuotationNumber()
	{
		return quotationNumber;
	}

	public void setQuotationNumber(int quotationNumber)
	{
		this.quotationNumber = quotationNumber;
	}

	public int getCustomerCategory()
	{
		return customerCategory;
	}

	public void setCustomerCategory(int customerCategory)
	{
		this.customerCategory = customerCategory;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}


	public double getSubTotal()
	{
		return subTotal;
	}

	public double getVatAmount()
	{
		return vatAmount;
	}


	public double getDiscountAmount()
	{
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount)
	{
		this.discountAmount = discountAmount;
	}
}
