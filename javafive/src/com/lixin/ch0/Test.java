package com.lixin.ch0;

public class Test
{
	static void exec(int a, int b)
	{

		if (b == 0)
		{
			return;
		}
		// ArithmeticException 算术异常
		int c = a / b;
		System.out.println("c的值为:" + c);
	}

	public static void main(String[] args)
	{
		int a = 10;

		int b = 0;

		exec(a, b);
	}
}
