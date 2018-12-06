package com.lixin.lesson23;

public class PrintOut
{
	
	// �ֶ�����һ����������
	boolean  flag;
	
	public void  printA()
	{
		//��֤�߳���Զ����
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
				
			
				//��ʼִ������
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
				
				//���Ѻ�������ͬһ���������ı�wait()�̣߳��ָ�����
				this.notify();
				
				//����flag=true;
				flag=true;
				
			}
			
		}
	}
	
	public void  printB()
	{
		//��֤�߳���Զ����
		while(true)
		{
			synchronized (this)
			{
				//�����1�̱߳�JVM���ȣ������ܴ�ӡ��wait
				//�����1�̱߳�JVM���ȣ���ʶλ����
				if(!flag)
				{
					try
					{
						//1�̱߳������ȴ�
						this.wait();
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			
				//��ʼִ������
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
