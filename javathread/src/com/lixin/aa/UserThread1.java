package com.lixin.aa;

public class UserThread1 extends Thread
{
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		SingleModel s1=SingleModel.getInstance();
		System.out.println("------UserThread1-----------"+s1);

	}
}
