package com.lixin.lesson21;

public class UserThread  extends  Thread
{
 
	int sum=0;
	public  void  run()
	{
		System.out.println(Thread.currentThread().getName()+"...去执行...");
		synchronized (this)
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
		}
	
		
		
		
	}
	
	public int  getSum()
	{
		return this.sum;
	}
}
