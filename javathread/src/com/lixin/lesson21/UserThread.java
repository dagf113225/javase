package com.lixin.lesson21;

public class UserThread  extends  Thread
{
 
	int sum=0;
	public  void  run()
	{
		System.out.println(Thread.currentThread().getName()+"...ȥִ��...");
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
			System.out.println(Thread.currentThread().getName()+"...�������...");
			//����
			//this.notify(); //Ĭ�Ͽ��Բ�д��һ����this.notify(); 
		}
	
		
		
		
	}
	
	public int  getSum()
	{
		return this.sum;
	}
}
