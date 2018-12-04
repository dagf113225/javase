package com.lixin.lesson15;



public class Test
{
	public static void main(String[] args)
	{
		Object  obj  =new Object();
		
		UserThread  u1 = new UserThread(obj);
		
		
		UserThread  u2 = new UserThread(obj);
		
		u1.start();
		u2.start();

	}
}
