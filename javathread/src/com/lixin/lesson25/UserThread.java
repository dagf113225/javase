package com.lixin.lesson25;

public class UserThread extends Thread
{
	boolean flag;
	
	String taskName;
	
	

	public void run()
	{
		while (true)
		{
			synchronized (this)
			{
				if(!flag)
				{
					try
					{
						System.out.println(Thread.currentThread().getName()+",线程池初始化完成，没有任务，在此休息，等待任务的到来...");
						this.wait();
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					//干活
					System.out.println(Thread.currentThread().getName()+"-->出来干活-->任务名称是:"+this.taskName);
					
				
					try
					{
						//模拟这个干活的时间需要30秒
						Thread.sleep(30*1000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"-->任务完成，回归池中");
					flag=false;
				}
				
				
			
			}

		}
	}



	public boolean isFlag()
	{
		return flag;
	}



	public void setFlag(boolean flag)
	{
		synchronized (this)
		{
			this.flag = flag;
			this.notify();
		}
	
	}



	public String getTaskName()
	{
		return taskName;
	}



	public void setTaskName(String taskName)
	{
		this.taskName = taskName;
	}

}
