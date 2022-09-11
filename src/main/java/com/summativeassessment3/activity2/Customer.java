package com.summativeassessment3.activity2;

public class Customer
{
	int customerNumber;
	String name;
	int customerCategory;
	String telephone;
	String deliveryAddress;

	public Customer(int customerNumber, String name, int customerCategory, String telephone, String deliveryAddress)
	{
		this.customerNumber = customerNumber;
		this.name = name;
		this.customerCategory = customerCategory;
		this.telephone = telephone;
		this.deliveryAddress = deliveryAddress;
	}

	public int getCustomerNumber()
	{
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getCustomerCategory()
	{
		return customerCategory;
	}

	public void setCustomerCategory(int customerCategory)
	{
		this.customerCategory = customerCategory;
	}

	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	public String getDeliveryAddress()
	{
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress)
	{
		this.deliveryAddress = deliveryAddress;
	}
}
