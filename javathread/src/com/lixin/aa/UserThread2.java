package com.lixin.aa;

public class UserThread2 extends Thread
{
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		SingleModel s2=SingleModel.getInstance();
		System.out.println("------UserThread2-----------"+s2);

	}
}
