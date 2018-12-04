package com.lixin.lesson15;

public class UserThread extends Thread
{
	//Object  obj  =new Object();
	Object  obj =null;
	public  UserThread(	Object  obj)
	{
		this.obj=obj;
	}
	
	// synchronized同步安全，修饰方法，这个方法被加锁
	//锁的住的前提:多线程必须持有同一个对象的锁。
	@Override
	public  void run()
	{
		//Object  obj  =new Object();
		
		System.out.println(Thread.currentThread().getName() +"欢迎你来执行.........开始");
		
		synchronized(obj)
		{
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++)
			{
				System.out.println(Thread.currentThread().getName() + "-->" + i);
			}
		}
		
		System.out.println(Thread.currentThread().getName() +"欢迎你来完成.........结束");
	}

}
