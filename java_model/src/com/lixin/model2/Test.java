package com.lixin.model2;

public class Test
{
	
	public static void main(String[] args)
	{
		
		//Object  obj =  new Object();
		UserThread1  u1  = new UserThread1();
		UserThread2  u2  = new UserThread2();
		
		u1.start();
		u2.start();
	}

}
