package com.lixin.lesson28;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * 闭锁：CountDownLatch
 * 一个线程等一定数量(可配置)完成任务后再执行.
 * 
 * 一个新员工上班，6点下班，等另外3个同事下班后，他才能下班。
 * 
 * 一个线程等待其它的线程完成任务后，才执行。
 * 
 * @author lenovo
 *
 */
public class Test
{
	public static void main(String[] args)
	{
		//对三个线程数量进行监控
		final CountDownLatch   adw =  new CountDownLatch(3);
		
		System.out.println("6点下班.............");
		
		new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				System.out.println("新员工王启明在次被阻塞，等待其她三位同事下班...");
				try
				{
					adw.await();
					
					System.out.println("新员工王启明,其它同事下班了，你也可以走了....");
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
		
		for(int i=0;i<3;i++)
		{
			new Thread(new Runnable()
			{
				
				@Override
				public void run()
				{
					// TODO Auto-generated method stub
					try
					{
						System.out.println("同事-->"+Thread.currentThread().getName()+"准备下班了...");
						Thread.sleep(new Random().nextInt(8000));
						adw.countDown(); //-1
						
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();
		}
		
	}

}
