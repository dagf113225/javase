package com.lixin.lesson27;

public class UserThread  extends Thread
{
	
	public  void  run()
	{
		System.out.println("A");
		
		//wait()一定需要 notify()唤醒，唤醒的前提，一定使用在同步环境下，必须持有同一个对象的锁。
//		try
//		{
//			//一个线程肯定会让出执行权给另外一个线程
//			Thread.sleep(2000);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		//一个线程可能会让出执行权给另外一个线程，也有可能让出给自己
		Thread.yield();
		System.out.println("B");
	}

}
