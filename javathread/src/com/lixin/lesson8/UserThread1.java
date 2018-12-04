package com.lixin.lesson8;

//AABB|ABAB
public class UserThread1  extends  Thread
{

	public void  run()
	{
		System.out.println(Thread.currentThread().getName()+"-->A");
		
		//让步，让出执行权,有可能让出给别的线程，有可能让出给自己
	     Thread.yield();
	     
		System.out.println(Thread.currentThread().getName()+"-->B");
	}

}
