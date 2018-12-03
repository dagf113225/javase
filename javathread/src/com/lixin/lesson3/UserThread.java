package com.lixin.lesson3;

public class UserThread  extends  Thread
{
	
	public void  run()
	{
		System.out.println(Thread.currentThread().getName()+"-->run");
	}

}
