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
						System.out.println(Thread.currentThread().getName()+",�̳߳س�ʼ����ɣ�û�������ڴ���Ϣ���ȴ�����ĵ���...");
						this.wait();
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					//�ɻ�
					System.out.println(Thread.currentThread().getName()+"-->�����ɻ�-->����������:"+this.taskName);
					
				
					try
					{
						//ģ������ɻ��ʱ����Ҫ30��
						Thread.sleep(30*1000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"-->������ɣ��ع����");
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
