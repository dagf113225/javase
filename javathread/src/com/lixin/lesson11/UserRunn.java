package com.lixin.lesson11;

public class UserRunn   implements  Runnable
{

	//synchronized同步安全，修饰方法，这个方法被加锁
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
