package com.lixin.lesson20;
/**
 * 线程之间交换数据
 * 1.主线程传递数据子线程  通过构造函数
 * 2.子线程传递数据主线程   必须在synchronized，使用notify
 * 2.子线程传递数据子线程
 * 
 * 
 * @author lenovo
 *
 */

public class Test
{
	
	public static void main(String[] args)
	{
		
		
		//为什么创建一个子线程,去安排子线程计算1.100之和
		UserThread  ut = new UserThread();
		ut.start();
		
		
		//同步块
		synchronized (ut)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+"--->....");
				//主线程持有ut线程对象的锁，在此被wait()，阻塞
				//等待子线程去计算
				ut.wait();
				
				System.out.println("---------------------------");
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	    
		
		
		
	}

	
}
