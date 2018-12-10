package com.czm.ch2;
//byte-->short-->int--->long-->float-->double
public class Test
{
	
	public static void main(String[] args)
	{
		/**
		 * 线程通信
		 * 1.主线程向子线程传值
		 * 
		 */  
		
		float  a1=20.09f;
		
		//主线程向子线程传值
		UserThread  u  =new UserThread(a1);
		u.start();
		
		int  sum=0;
		
		for(int i=0;i<=10;i++)
		{
			sum+=i;
		}
		synchronized (u)
		{
			try
			{
				//是主线程在此只有子线程u对象的锁在此阻塞，等待
				u.wait();
				
				System.out.println("和为:"+(sum+u.getSum()));//55+5070
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
