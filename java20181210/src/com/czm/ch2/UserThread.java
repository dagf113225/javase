package com.czm.ch2;

public class UserThread extends Thread
{
	double a;
	
	
	int sum=0;

	public UserThread(double a)
	{

		this.a = a;

	}

	public void run()
	{
		synchronized (this)
		{
			for(int i=0;i<=100;i++)
			{
				sum+=i;
			}
			
			//10.099 
			sum=sum+(int)a;//5050+20
			
			//唤醒和它持有同一个对象的锁的被阻塞的线程继续运行
			this.notify();
			
		}

	}
	
	public int  getSum()
	{
		return this.sum;
	}

}
