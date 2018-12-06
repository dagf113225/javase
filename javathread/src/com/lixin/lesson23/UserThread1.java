package com.lixin.lesson23;

public class UserThread1  extends Thread
{
	PrintOut  pout ;
	public UserThread1(PrintOut  pout)
	{
		this.pout=pout;
	}
	public void  run()
	{
		pout.printA();
		
	}
}
