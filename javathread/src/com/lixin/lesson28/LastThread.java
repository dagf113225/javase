package com.lixin.lesson28;

import java.util.concurrent.CountDownLatch;

public class LastThread  extends  Thread
{
	CountDownLatch  c ;
	public LastThread(CountDownLatch  c )
	{
		
		this.c=c;
		
	}
	public void  run()
	{
		System.out.println("监控最后线程正在启动执行....");
		try
		{
			//当前的线程被阻塞
			this.c.await();
			
			System.out.println("发送Javamail邮件个用户点击链接变更用户状态..");
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
