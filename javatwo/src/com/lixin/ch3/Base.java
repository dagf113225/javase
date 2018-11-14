package com.lixin.ch3;

public class Base
{
	
	static
	{
		System.out.println("*************父类的静态块");
	}
	{
		System.out.println("*************父类的构造块");
	}

	Base(int a)
	{
		System.out.println("父类的构造函数");
	}

}
