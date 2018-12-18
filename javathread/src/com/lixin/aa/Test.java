package com.lixin.aa;

public class Test
{
	public static void main(String[] args)
	{
		UserThread1 u1 = new UserThread1();
		UserThread2 u2 = new UserThread2();
		
		u1.start();
		u2.start();
	}
}
