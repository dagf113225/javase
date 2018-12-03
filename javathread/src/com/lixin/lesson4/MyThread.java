package com.lixin.lesson4;

public class MyThread  extends Thread
{
	
	public void  run()
	{
		System.out.println(Thread.currentThread().getName()+"-->run");
	}

}
