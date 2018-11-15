package com.lixin.ch12;

public class Base
{

	int a;

	static int b;
	
	int a1;

	int b1;

	public Base()
	{

		a = 1;
		b = 1;
		a1=10;
		b1=10;

	}

	public void addA()
	{
		a += 4;
	}

	public static void addB()
	{
		b += 5;
	}

}
