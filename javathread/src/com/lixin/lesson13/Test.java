package com.lixin.lesson13;



public class Test
{
	public static void main(String[] args)
	{
		UserThread  u1 = new UserThread();
		
		Thread  t1 = new Thread(u1);
		Thread  t2 = new Thread(u1);
		
		t1.start();
		t2.start();
	}
}
