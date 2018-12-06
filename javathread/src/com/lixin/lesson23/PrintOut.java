package com.lixin.lesson23;

public class PrintOut
{
	
	// 手动制造一个控制条件
	boolean  flag;
	
	public void  printA()
	{
		//保证线程永远不死
		while(true)
		{
			synchronized (this)
			{
				if(flag)
				{
					try
					{
						this.wait();
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			
				//开始执行任务
				System.out.println(Thread.currentThread().getName()+"-->A");
				
				try
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//唤醒和它持有同一个对象锁的被wait()线程，恢复运行
				this.notify();
				
				//设置flag=true;
				flag=true;
				
			}
			
		}
	}
	
	public void  printB()
	{
		//保证线程永远不死
		while(true)
		{
			synchronized (this)
			{
				//如果是1线程被JVM调度，它不能打印，wait
				//如果是1线程被JVM调度，标识位控制
				if(!flag)
				{
					try
					{
						//1线程被阻塞等待
						this.wait();
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			
				//开始执行任务
				System.out.println(Thread.currentThread().getName()+"-->B");
				
				try
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.notify();
				
				flag=false;
				
			}
			
		}
	}

}
