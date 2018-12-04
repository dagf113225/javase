package com.lixin.lesson10;

//A--B--A

/**
 * 
 * a
 * @author lenovo
 *
 */
public class Test
{
	
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName()+",main线程");
		
		UserThread  u = new UserThread();
		u.start();
		
		int count =1000;
		
		count=count/2;//500
		
		
		try
		{//合并线程,把子线程合并到主线程来运行
			u.join();
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("结果为:"+(count+u.getSum()));
	}
	

}
