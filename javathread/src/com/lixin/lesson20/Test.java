package com.lixin.lesson20;
/**
 * �߳�֮�佻������
 * 1.���̴߳����������߳�  ͨ�����캯��
 * 2.���̴߳����������߳�   ������synchronized��ʹ��notify
 * 2.���̴߳����������߳�
 * 
 * 
 * @author lenovo
 *
 */

public class Test
{
	
	public static void main(String[] args)
	{
		
		
		//Ϊʲô����һ�����߳�,ȥ�������̼߳���1.100֮��
		UserThread  ut = new UserThread();
		ut.start();
		
		
		//ͬ����
		synchronized (ut)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+"--->....");
				//���̳߳���ut�̶߳���������ڴ˱�wait()������
				//�ȴ����߳�ȥ����
				ut.wait();
				
				System.out.println("---------------------------");
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	    
		
		
		
	}

	
}
