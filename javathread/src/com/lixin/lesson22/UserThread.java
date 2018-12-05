package com.lixin.lesson22;

public class UserThread  extends  Thread
{
	private  Object  obj;
	public UserThread(	Object  obj)
	{
		this.obj=obj;
	}
 
	int sum=0;
	public  void  run()
	{
		System.out.println(Thread.currentThread().getName()+"...去执行...");
		synchronized (obj)
		{
			for(int  i=0;i<=100;i++)
			{
				sum+=i;
			}
			try
			{
				Thread.sleep(10000);
			}
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
			System.out.println(Thread.currentThread().getName()+"...计算好了...");
			//唤醒
			//this.notify(); //默认可以不写，一定是this.notify();
			obj.notify();
		}
	
		
		
		
	}
	
	public int  getSum()
	{
		return this.sum;
	}
}
