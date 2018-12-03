package com.lixin.lesson5;

public class MyThread  extends Thread
{
	
	public void  run()
	{
		System.out.println(Thread.currentThread().getName()+"-->run");
	}

}
