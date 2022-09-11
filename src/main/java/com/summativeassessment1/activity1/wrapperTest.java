package com.summativeassessment1.activity1;

import java.util.ArrayList;
import java.util.List;

public class wrapperTest
{
	public static void main(String[] args)
	{
		// 4
		int a = 10, b = 100, c = 52;
		double x = 11.65, y = 89.01;
		String s1 = "123", s2 = "456";

		//4.1
		Integer intObj1 = (Integer) a, intObj2 = (Integer) b, intObj3 = (Integer) c;
		Double doubleObj1 = (Double) x, doubleObj2 = (Double) y;

		System.out.println(intObj1 + " compared to "+ intObj2 +" : "+ intObj1.compareTo(intObj2));
		System.out.println(intObj3 +" as binary string : "+ Integer.toBinaryString(intObj3));
		System.out.println( s1+ " + "+ s2 +" = "+ (Integer.parseInt(s1) + Integer.parseInt(s2)) );

		//4.2
		System.out.println(intObj1 + " compared to "+ intObj2 + " gives "+ intObj1.compareTo(intObj2));

		//4.3
		System.out.println(intObj3 +" in binary format : "+ Integer.toBinaryString(intObj3));

		//4.4.
		System.out.println("s1 and s2 as strings Concatenated : "+ s1 + s2);

		//4.5
		Integer intObj4 = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println("Sum of s1 and s2 as Integers : " + intObj4);
		//4.6
		int intObj4AsPrimitive = (int) intObj4;
		System.out.println(intObj4 +" as primitive int : "+ intObj4AsPrimitive);
	}
}
