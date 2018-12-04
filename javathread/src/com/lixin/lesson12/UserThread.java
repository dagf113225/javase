package com.lixin.lesson12;

public class UserThread extends Thread
{
	// synchronized同步安全，修饰方法，这个方法被加锁
	//锁的住的前提:多线程必须持有同一个对象的锁。
	@Override
	public synchronized void run()
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName() + "-->" + i);
		}
	}

}
