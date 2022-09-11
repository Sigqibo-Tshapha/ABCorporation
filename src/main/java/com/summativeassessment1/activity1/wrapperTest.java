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

		//not sure what char objects the question refers to, u r only given 2 String objects which
		// can only be converted to an array of Characters, Stings do not have a wrapper class in Java

		System.out.println(intObj1 + " compared to "+ intObj2 +" : "+ intObj1.compareTo(intObj2));
		System.out.println(intObj3 +" as binary string : "+ Integer.toBinaryString(intObj3));
		System.out.println( s1+ " + "+ s2 +" = "+ (Integer.parseInt(s1) + Integer.parseInt(s2)) );

		//4.2
		System.out.println(intObj1 + " compared to "+ intObj2 + " gives "+ intObj1.compareTo(intObj2));

		//4.3
		System.out.println(intObj3 +" in binary format : "+ Integer.toBinaryString(intObj3));

		//4.4. This question is weird, first it says convert the Strings to integers then CONCATENATE them.
		//But you can't concatenate integers, you can only sum them,which is what the next question is asking for so now I'm not sure
		//so I'll just concatenate them as strings . Also, we were never given s3
		System.out.println("s1 and s2 as strings Concatenated : "+ s1 + s2);

		//4.5
		Integer intObj4 = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println("Sum of s1 and s2 as Integers : " + intObj4);
		//4.6
		int intObj4AsPrimitive = (int) intObj4;
		System.out.println(intObj4 +" as primitive int : "+ intObj4AsPrimitive);
	}
}
