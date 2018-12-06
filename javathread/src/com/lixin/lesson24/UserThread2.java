package com.lixin.lesson24;

public class UserThread2  extends Thread
{
	
	PrintOut  pout ;
	public UserThread2(PrintOut  pout)
	{
		this.pout=pout;
	}

	public void  run()
	{
		pout.printB();
	}
}
