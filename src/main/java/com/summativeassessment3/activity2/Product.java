package com.summativeassessment3.activity2;

import java.math.BigInteger;

public class Product
{
	private String name;
	private String size;
	private double price;
	private BigInteger productCode;

	public Product(String name, String size, double price, BigInteger barcode)
	{
		this.name = name;
		this.size = size;
		this.price = price;
		this.productCode = barcode;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSize()
	{
		return size;
	}

	public void setSize(String size)
	{
		this.size = size;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public BigInteger getBarcode()
	{
		return productCode;
	}

	public void setBarcode(BigInteger barcode)
	{
		this.productCode = barcode;
	}
}
