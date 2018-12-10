package com.lixin.ch12;

import java.util.ArrayList;


/**
 * ArrayList和Vector的区别:
 * 1.它们底层都是采用数组实现的.
 * 2.ArrayList是线程非安全(没有synchronized)，所有的方法都是不用synchronized修饰的,性能好，但是数据非安全
 * 3.Vector是线程安全(有synchronized)，所有的方法都是用synchronized修饰的,Vector性能弱，但是数据安全
 * 
 * @author lenovo
 *
 */
//做个安全测试
public class Test6   implements  Runnable
{
	
	//构建一个ArrayList 线程非安全
	Object  obj =new Object();
	static  ArrayList  lists  = new ArrayList();
	//static  Vector  lists  = new Vector();
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		synchronized (obj)
		{
			for(int i=0;i<100;i++)
			{
				lists.add(i);
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		Test6   t6 = new Test6();
		
		Thread  t1 = new Thread(t6,"线程一");
		Thread  t2 = new Thread(t6,"线程二");
		Thread  t3 = new Thread(t6,"线程三");
		
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			
			t2.join();
			t3.join();
			
			
			System.out.println("lists的大小为:"+lists.size());
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	

}
