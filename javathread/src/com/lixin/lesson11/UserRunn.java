package com.lixin.lesson11;

public class UserRunn   implements  Runnable
{

	//synchronizedͬ����ȫ�����η������������������
	@Override
	public synchronized void run()
	{
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}

}
